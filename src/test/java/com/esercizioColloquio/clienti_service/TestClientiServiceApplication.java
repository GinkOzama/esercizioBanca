package com.esercizioColloquio.clienti_service;

import org.springframework.boot.SpringApplication;

public class TestClientiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(ClientiServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
