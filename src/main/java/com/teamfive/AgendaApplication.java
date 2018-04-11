package com.teamfive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(scanBasePackages={"com.teamfive"})
public class AgendaApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(AgendaApplication.class, args);
	}
	@Override
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	     registry
         .addResourceHandler("/webjars/**")
         .addResourceLocations("/webjars/");
		}
	
	 
}
