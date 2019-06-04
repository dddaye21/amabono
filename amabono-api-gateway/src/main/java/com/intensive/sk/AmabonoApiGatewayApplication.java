package com.intensive.sk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class AmabonoApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmabonoApiGatewayApplication.class, args);
	}

}
