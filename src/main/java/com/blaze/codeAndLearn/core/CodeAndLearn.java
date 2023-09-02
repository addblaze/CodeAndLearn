package com.blaze.codeAndLearn.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages =  "com.blaze.codeAndLearn")
public class CodeAndLearn extends SpringBootServletInitializer {
	
	private static Logger LOGGER = LoggerFactory.getLogger("CodeAndLearn");
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(CodeAndLearn.class).logStartupInfo(true).web(WebApplicationType.SERVLET);
	}
	
	public static void main(String[] args) {
		LOGGER.info("Running CodeAndLearn App....!");
		SpringApplication.run(CodeAndLearn.class, args);
	}

}
