package com.osho.twcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TwCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwCloudGatewayApplication.class, args);
	}

}
