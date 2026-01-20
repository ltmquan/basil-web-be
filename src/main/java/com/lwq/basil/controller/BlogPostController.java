package com.lwq.basil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwq.basil.service.BlogPostService;

@RestController
@RequestMapping("/api/blogpost")
public class BlogPostController {
    
    @Autowired
    BlogPostService blogPostService;
}
