package com.masai.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.masai.module.Articles;
import com.masai.module.NewsData;


@CrossOrigin(value = "*")
@RestController
public class NewsController {

	@Autowired
	RestTemplate restTemplate;
	
	
	@GetMapping("/news")
	public List<Articles> newsDatas(){
		
		NewsData newsData = restTemplate.getForObject("https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=f252578253904ac6a249a1516faf61a0", NewsData.class);

		List<Articles> list = newsData.getArticles();
		
		List<Articles> articles = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			articles.add(list.get(i));
		}

		return articles;
	}
	
}















