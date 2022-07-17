package com.tmdsproject.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.tmdsproject.TmdsCommon.entities"})
public class TmdsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmdsBackendApplication.class, args);
	}

}
