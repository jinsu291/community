package com.example.community.mapper;

import com.example.community.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface ArticleMapper {

    Article writeArticle(String title, String body);
}
