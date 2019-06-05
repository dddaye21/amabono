package com.intensive.sk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AmabonoActivityManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmabonoActivityManagementApplication.class, args);
	}

}
