package com.example.community.service;

import com.example.community.entity.Article;
import com.example.community.mapper.ArticleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class ArticleService {
    @Autowired
    private final ArticleMapper articleMapper;

    @Transactional
    public int write(Article article) {
        articleMapper.save(article);
        return article.getId();
    }
}