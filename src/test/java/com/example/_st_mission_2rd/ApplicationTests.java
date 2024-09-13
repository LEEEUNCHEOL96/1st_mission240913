package com.example._st_mission_2rd;

import com.example._st_mission_2rd.Article.Article;
import com.example._st_mission_2rd.Article.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class ApplicationTests {

	@Autowired
	ArticleRepository articleRepository;


	@Test
	void contextLoads() {
		Article article = new Article();
		article.setTitle("테스트용 제목");
		article.setContent("테스트용 내용");
		article.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(article);
	}
}
