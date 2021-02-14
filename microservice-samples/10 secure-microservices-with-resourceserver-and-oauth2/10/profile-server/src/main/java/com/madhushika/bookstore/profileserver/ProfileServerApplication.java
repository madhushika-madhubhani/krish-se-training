package com.madhushika.bookstore.profileserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EntityScan(basePackages = "com.madhushika.bookstore.commons.model")
@EnableAuthorizationServer
@EnableResourceServer

public class ProfileServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileServerApplication.class, args);
	}

}
