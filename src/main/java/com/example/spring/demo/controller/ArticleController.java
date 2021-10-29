package com.example.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring.demo.dto.Article;
import com.example.spring.demo.service.ArticleService;


@Controller
public class ArticleController {
	@Autowired
	private ArticleService articleservice;
	
	@RequestMapping("/article/list")
	public String showList(Model model) {
		List<Article> articles = articleservice.getArticles();
		
		model.addAttribute("articles", articles);
		
		return "article/list";
	}
}
