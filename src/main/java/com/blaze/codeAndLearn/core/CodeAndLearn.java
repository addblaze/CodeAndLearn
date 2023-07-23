package com.blaze.codeAndLearn.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class CodeAndLearn {
	
	private static Logger LOGGER = LoggerFactory.getLogger("CodeAndLearn");
	
	public static void main(String[] args) {
		LOGGER.info("Running CodeAndLearn App....!");
		SpringApplication.run(CodeAndLearn.class, args);
	}

}
