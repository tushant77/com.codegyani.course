package com.codegyani.course.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}
	
	@Bean 
	CorsConfigurationSource configurationSource(){
	 CorsConfiguration corsConfiguration = new CorsConfiguration();
	 corsConfiguration.setAllowedOrigins(Arrays.asList("*"));
	 corsConfiguration.setAllowedMethods(Arrays.asList("*"));
	 corsConfiguration.setAllowedHeaders(Arrays.asList("*"));
	 corsConfiguration.setAllowCredentials(true);
     UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
     source.registerCorsConfiguration("/**", corsConfiguration);
     return source;
	}
	

}
