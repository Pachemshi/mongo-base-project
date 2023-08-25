package com.ep.mongobaseproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongoBaseProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoBaseProjectApplication.class, args);
	}
}
