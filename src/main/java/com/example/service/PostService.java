package com.example.service;

import com.example.model.Post;

import java.util.List;

public interface PostService {
    public Post addPost(Post post);
    public Post get(String postId);
    public List<Post> getAll();
    public boolean modify(Post post);
    public boolean delete(String postId);
}
