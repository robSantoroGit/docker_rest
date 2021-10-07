package com.azienda.esempioRestContainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EsempioRestContainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsempioRestContainerApplication.class, args);
	}
	
	@GetMapping("/ciao")
	public String ciao() {
		return "Ciao";
	}

}
