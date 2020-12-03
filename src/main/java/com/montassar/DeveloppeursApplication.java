package com.montassar;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.montassar.entities.Developpeur;


@SpringBootApplication
public class DeveloppeursApplication implements CommandLineRunner{
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;


	public static void main(String[] args) {
		SpringApplication.run(DeveloppeursApplication.class, args);
		
			
	}
	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Developpeur.class);
		
}
}