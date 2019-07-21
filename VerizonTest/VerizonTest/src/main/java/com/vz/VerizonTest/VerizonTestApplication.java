package com.vz.VerizonTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvc
public class VerizonTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerizonTestApplication.class, args);
	}

}
