package com.example.service.impl;

import com.example.model.Post;
import com.example.service.PostService;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import java.util.List;

public class PostServiceImpl implements PostService {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Post addPost(Post post){
        return mongoTemplate.insert(post);
    }

    @Override
    public Post get(String postId){
        return mongoTemplate.findById(postId, Post.class);
    }

    @Override
    public List<Post> getAll() {
        List<Post> posts = mongoTemplate.findAll(Post.class);
        return posts;
    }

    @Override
    public boolean modify(Post post) {
        Query query = new Query(Criteria.where("id").is(post.getId()));
        Update updateData = new Update();
        updateData.set("postName",post.getPostName());
        UpdateResult result = mongoTemplate.updateFirst(query,updateData,Post.class);
        return true;
    }

    @Override
    public boolean delete(String postId) {
        Post temp = get(postId);
        DeleteResult result = mongoTemplate.remove(temp);
        return true;
    }
}
