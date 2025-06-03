package com.spanlet.simplehelloworld;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SimplehelloworldApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SimplehelloworldApplication.class, args)
		// .properties("server.port=${SERVER_PORT:8080}")
        //     .run(args);

			new SpringApplicationBuilder(SimplehelloworldApplication.class)
            .properties("server.port=${SERVER_PORT:8080}")
            .run(args);
	}

}
