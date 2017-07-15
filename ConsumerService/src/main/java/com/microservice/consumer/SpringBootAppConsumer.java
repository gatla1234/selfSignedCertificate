package com.microservice.consumer;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.microservice.consumer.controller.ConsumerController;


@SpringBootApplication
public class SpringBootAppConsumer {

	public static void main(String[] args) throws RestClientException, IOException {
			ApplicationContext ctx = SpringApplication.run(
					SpringBootAppConsumer.class, args);
			
			ConsumerController consumerController=ctx.getBean(ConsumerController.class);
			System.out.println(consumerController);
			consumerController.getEmployee();
			
		}
		
		@Bean
		public  ConsumerController  consumerController()
		{
			return  new ConsumerController();
		}
	}


