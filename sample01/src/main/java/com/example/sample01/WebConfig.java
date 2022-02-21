package com.example.sample01;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration      // 설정임을 알려주는 Annotation -> 자동 호출
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // WebMvcConfigurer.super.addCorsMappings(registry);
        // registry.addMapping("/**").allowedOrigins("http://localhost:8090");
        registry.addMapping("/**").allowedOrigins("*");             // 아무나 접속할 수 있게 설정
    }

}
