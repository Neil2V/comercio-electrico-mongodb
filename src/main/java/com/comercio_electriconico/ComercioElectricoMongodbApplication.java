package com.comercio_electriconico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories(basePackages = "dao")
@SpringBootApplication
public class ComercioElectricoMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComercioElectricoMongodbApplication.class, args);
	}

}
