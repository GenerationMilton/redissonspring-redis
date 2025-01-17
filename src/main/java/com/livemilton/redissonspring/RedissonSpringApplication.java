package com.livemilton.redissonspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableCaching
@EnableScheduling
@SpringBootApplication
@ComponentScan(basePackages = "com.livemilton.redissonspring.fib.config.RedissonCacheConfig.class")
public class RedissonSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedissonSpringApplication.class, args);
	}

}