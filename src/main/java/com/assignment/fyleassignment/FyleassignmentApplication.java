package com.assignment.fyleassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import com.assignment.fyleassignment.config.JwtFilter;

@SpringBootApplication
public class FyleassignmentApplication {

	@Bean
	public FilterRegistrationBean<JwtFilter> jwtFilter() {
		final FilterRegistrationBean<JwtFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new JwtFilter()); //
		registrationBean.addUrlPatterns("/bankDetails/*");
		return registrationBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(FyleassignmentApplication.class, args);
	}
}
