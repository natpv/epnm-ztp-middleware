package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.filter.SimpleFilter;


@EnableZuulProxy
@SpringBootApplication
public class EpnmZtpMiddlewareApplication {

	public static void main(String[] args) {
		SpringApplication.run(EpnmZtpMiddlewareApplication.class, args);
	}
	
	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}

}
