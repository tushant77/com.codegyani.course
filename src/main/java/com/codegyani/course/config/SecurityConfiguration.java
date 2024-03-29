package com.codegyani.course.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter  {
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		
		 http
         // ...
         .csrf().disable();
		 
		 http.authorizeRequests().anyRequest().permitAll();
		
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception{
		web.ignoring()
		 .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**");
	}

}
