package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NewsApplication1Application {

	public static void main(String[] args) {
		SpringApplication.run(NewsApplication1Application.class, args);
	}
	
	
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

}
