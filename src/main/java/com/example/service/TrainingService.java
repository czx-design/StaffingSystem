package com.example.service;

import com.example.model.Training;
import com.example.param.TrainningQueryParam;
import org.springframework.data.domain.Page;

public interface TrainingService {
    Training addTraining(Training training);
    Training get(String trainingId);
    Page<Training> list(TrainningQueryParam trainningQueryParam);
    boolean modify(Training training);
    boolean delete(String trainingId);
}
