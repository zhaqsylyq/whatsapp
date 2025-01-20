package com.zhaqsylyq.whatsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WhatsappApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhatsappApiApplication.class, args);
	}

}
