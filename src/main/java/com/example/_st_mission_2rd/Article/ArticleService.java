package com.example._st_mission_2rd.Article;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ArticleService {
    private ArticleRepository articleRepository;

    public List<Article> getList(){
        return this.articleRepository.findAll();
    }

    public Article getArticle(Integer id){
        Optional<Article> optionalArticle = this.articleRepository.findById(id);
        if(optionalArticle.isEmpty()){
            return null;
        }
        return optionalArticle.get();
    }
}
