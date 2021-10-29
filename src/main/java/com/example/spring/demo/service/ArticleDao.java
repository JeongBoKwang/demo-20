package com.example.spring.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.spring.demo.dto.Article;

@Component
public class ArticleDao {

	public List<Article> getArticles() {
		
		List<Article> articles = new ArrayList<>();
		
		Article article4  = new Article(4, "2021-10-29 18:42:04", "제목4", "내용4");
		Article article3 = new Article(3, "2021-10-29 18:42:03", "제목3", "내용3");
		Article article2 = new Article(2, "2021-10-29 18:42:02", "제목2", "내용2");
		Article article1 = new Article(1, "2021-10-29 18:42:01", "제목1", "내용1");
		
		articles.add(article4);
		articles.add(article3);
		articles.add(article2);
		articles.add(article1);
		
		return articles;
	}

}
