package com.example.service;

import com.example.model.Post;

import java.util.List;

public interface PostService {
    Post addPost(Post post);
    Post get(String postId);
    List<Post> getAll();
    boolean modify(Post post);
    boolean delete(String postId);
}
