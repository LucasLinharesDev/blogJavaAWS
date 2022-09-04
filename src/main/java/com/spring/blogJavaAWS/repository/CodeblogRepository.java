package com.spring.blogJavaAWS.repository;

import com.spring.blogJavaAWS.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository<Post, Long > {
}
