package com.example.springhib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringHibApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringHibApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(SpringHibApplication.class, args);
	}

}
