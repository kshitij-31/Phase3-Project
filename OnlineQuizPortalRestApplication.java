package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@ComponentScan({"com.service", "com.bean"})
@EntityScan("com.bean")
@EnableJpaRepositories("com.repository")

public class OnlineQuizPortalRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineQuizPortalRestApplication.class, args);
	}

}
