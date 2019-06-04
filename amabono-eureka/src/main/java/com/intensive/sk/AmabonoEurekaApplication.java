package com.intensive.sk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AmabonoEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmabonoEurekaApplication.class, args);
	}

}
