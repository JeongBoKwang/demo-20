package com.example.spring.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.demo.dto.Article;

@Service
public class ArticleServiceImpl implements ArticleService{
	@Autowired 
	private ArticleDao articleDao;
	
	@Override
	public List<Article> getArticles() {
		
		return articleDao.getArticles();
	}
	
}
