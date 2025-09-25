package com.esercizioColloquio.conti_service;

import org.springframework.boot.SpringApplication;

public class TestContiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(ContiServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
