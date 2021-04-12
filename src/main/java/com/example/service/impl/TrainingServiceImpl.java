package com.example.service.impl;

import com.example.model.Training;
import com.example.param.TrainningQueryParam;
import com.example.service.TrainingService;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.springframework.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService {
    private static final Logger LOG  = LoggerFactory.getLogger(TrainingServiceImpl.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Training addTraining(Training training){
        if (training == null ){
            LOG.error("无效的训练项目");
            return null;
        }
        return mongoTemplate.insert(training);
    }

    @Override
    public Training get(String trainingId) {
        // 输入的主键 id 必须有文本，不能为空或全空格
        if (!StringUtils.hasText(trainingId)) {
            LOG.error("input songId is blank.");
            return null;
        }
        return mongoTemplate.findById(trainingId,Training.class);
    }

    @Override
    public Page<Training> list(TrainningQueryParam trainningParam) {
        if (trainningParam == null) {
            LOG.error("分页需求无效.");
            return null;
        }
        Criteria criteria = new Criteria();
        List<Criteria> subCris = new ArrayList<>();
        // 条件对象构建查询对象
        Query query = new Query(criteria);
        // 必须先查询总数，再分页检索
        long count = mongoTemplate.count(query, Training.class);

        // 构建分页对象。注意此对象页码号是从 0 开始计数的。
        Pageable pageable = PageRequest.of(trainningParam.getPageNum() - 1, trainningParam.getPageSize());
        query.with(pageable);
        // 查询结果
        List<Training> trainnings = mongoTemplate.findAll(Training.class);
        // 构建分页器
        Page<Training> pageResult = PageableExecutionUtils.getPage(trainnings, pageable, () -> count);
        return pageResult;
    }

    @Override
    public boolean modify(Training training) {
        if (training == null || !StringUtils.hasText(training.getId())){
            LOG.error("输入的修改数据无效");
            return false;
        }
        Query query = new Query(Criteria.where("id").is(training.getId()));
        Update updateData = new Update();
        UpdateResult result = mongoTemplate.updateFirst(query,updateData,Training.class);
        return result.getModifiedCount() > 0;
    }

    @Override
    public boolean delete(String trainingId) {
        // 输入的主键 id 必须有文本，不能为空或全空格
        if (!StringUtils.hasText(trainingId)) {
            LOG.error("input songId is blank.");
            return false;
        }
        Training temp = get(trainingId);
        DeleteResult result = mongoTemplate.remove(temp);
        return result.getDeletedCount() > 0;
    }
}
