package com.tarent.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase {

	  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
CommandLineRunner initDatabase(CourseRepossitory repository) {
	return args -> {
		log.info("Preloading" + repository.save(new Course("Introduction to Prolog", "FH",  "Raghu", 299., "2020-01-01", "2020-06-01")));
		log.info("Preloading" + repository.save(new Course("Introduction to MachneLearning", "Universität","Raghu", 399., "2020-01-01", "2020-06-01")));
		
		for(Course course : repository.findAll()) {
			log.info(course.toString());
		}
	};
}
}
