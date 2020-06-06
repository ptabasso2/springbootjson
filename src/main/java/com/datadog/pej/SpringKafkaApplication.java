package com.datadog.pej;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringKafkaApplication {

  Logger log = LoggerFactory.getLogger("commonLogger");

  public static void main(String[] args) {
    SpringApplication.run(SpringKafkaApplication.class, args);
  }

  @Bean
  public RestTemplate restTemplate(){
    return new RestTemplateBuilder().build();
  }

  @Bean
  public CommandLineRunner run() {
    return args -> {
        System.out.println("Instructor");
        log.info("\ntest");
    };
  }

}
