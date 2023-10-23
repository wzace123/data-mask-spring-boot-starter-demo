package com.wz.datamasking.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.wz.datamask.annotation.EnableDataMask;

@EnableDataMask
@SpringBootApplication
public class DataMaskingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataMaskingDemoApplication.class, args);
	}

}
