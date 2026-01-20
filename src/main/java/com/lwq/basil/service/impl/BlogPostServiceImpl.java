package com.lwq.basil.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwq.basil.repository.BlogPostRepository;
import com.lwq.basil.service.BlogPostService;

@Service
public class BlogPostServiceImpl implements BlogPostService {
    
    @Autowired
    private BlogPostRepository blogPostRepository;
}
