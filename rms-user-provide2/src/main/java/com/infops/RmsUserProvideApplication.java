package com.infops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RmsUserProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(RmsUserProvideApplication.class, args);
	}

}
