package com.blackyak.b2c.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.RequiredArgsConstructor;


/**
 * spring security cors 설정
 * 
 * addMapping : cors를 적용할 URL패턴을 정의
 * allowedOrigins : 자원 공유를 허락할 origin을 지정
 * allowedHeaders : 어떤 헤더들을 허용할 것인지
 * allowedMethods : 허용할 HTTP method를 지정 ex)GET, POST, PUT, DELETE
 * allowCredentials : 키 요청을 허용한다(다른 도메인 서버에 인증하는 경우에만 사용해야함)
 * 
 */

@Configuration
@EnableWebMvc
@RequiredArgsConstructor
public class WebSecurityConfig implements WebMvcConfigurer{
	
	@Override
	public void addCorsMappings(CorsRegistry corsRegistry) {
		corsRegistry.addMapping("/**") 
	      .allowedOrigins("http://localhost:3000") 
	      .allowedMethods("GET","POST")
	      .allowCredentials(false); 
	}

}