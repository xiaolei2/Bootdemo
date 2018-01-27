package com.tencent.sdc.Bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BootdemoApplication {

	@RequestMapping("/")
	public String index(){
			return "my first spring boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(BootdemoApplication.class, args);
	}
}
