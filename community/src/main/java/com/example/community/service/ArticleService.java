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

    public Article writeArticle(String title, String body) {
        return articleMapper.writeArticle(title, body);
    }

    public void modifyArticle(int id, String title, String body) {
        articleMapper.modifyArticle(id, title, body);
    }

    public void deleteArticle(int id) {
        articleMapper.deleteArticle(id);
    }
}