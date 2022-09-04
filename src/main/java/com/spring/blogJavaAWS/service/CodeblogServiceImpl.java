package com.spring.blogJavaAWS.service;

import com.spring.blogJavaAWS.model.Post;
import com.spring.blogJavaAWS.repository.CodeblogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeblogServiceImpl implements CodeblogService{

    @Autowired
    CodeblogRepository codeblogrepository;

    @Override
    public List<Post> findAll() {
        return codeblogrepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return codeblogrepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeblogrepository.save(post);
    }
}
