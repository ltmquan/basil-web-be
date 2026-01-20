package com.lwq.basil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lwq.basil.model.BlogPost;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long>{
    
}
