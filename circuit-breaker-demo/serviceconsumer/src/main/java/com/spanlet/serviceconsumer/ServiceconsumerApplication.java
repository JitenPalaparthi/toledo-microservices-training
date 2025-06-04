package com.spanlet.serviceconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class ServiceconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceconsumerApplication.class, args);
	}

}
