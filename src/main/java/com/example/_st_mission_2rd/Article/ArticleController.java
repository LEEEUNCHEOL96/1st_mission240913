package com.example._st_mission_2rd.Article;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/article")
@Controller
public class ArticleController {

    private final  ArticleRepository articleRepository;

    @GetMapping("/list")
    public String articleList(Model model){
        List<Article> articleList = this.articleRepository.findAll();
        model.addAttribute("articleList",articleList);

        return "article_list";
    }

}
