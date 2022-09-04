package com.spring.blogJavaAWS.service;

import com.spring.blogJavaAWS.model.Post;

import java.util.List;

public interface CodeblogService {

    List<Post> findAll();
    Post findById(Long id);
    Post save (Post post);

}
