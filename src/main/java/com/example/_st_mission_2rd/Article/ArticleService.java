package com.example._st_mission_2rd.Article;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ArticleService {
    private ArticleRepository articleRepository;

    public List<Article> getList(){
        return this.articleRepository.findAll();
    }
}
