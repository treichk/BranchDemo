package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableCaching
@EnableScheduling
@SpringBootApplication
public class MainApplication {

	private Logger logger = LoggerFactory.getLogger(MainApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
	
	@CacheEvict(value = "users", allEntries = true)
	@Scheduled(fixedRate = 43200000) //empty the cache every 12 hours
	public void emptyUsersCache() {
	    logger.info("emptying Users cache");
	}
}
