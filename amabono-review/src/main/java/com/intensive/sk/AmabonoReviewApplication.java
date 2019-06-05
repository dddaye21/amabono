package com.intensive.sk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class AmabonoReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmabonoReviewApplication.class, args);
	}

}
