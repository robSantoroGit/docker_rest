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
	
	@GetMapping("/")
	public String ciao() {
		return "Ciao Luca, stai vedendo un primo giro di test che a partire da un commit su Git dei sorgenti Java, si connette a Travis CI (applicazione di CI/DC) " + 
				"crea un container dentro il quale li compila, esegue i test (sempre nel container) genera l'immagine di produzione, la pubblica su Docker Hub, " +
				" da Docker Hub la fa scaricare in Amazon Web Services (Elastic Beanstalk) e la pubblica";
	}

}
