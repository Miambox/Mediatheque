package com.mediatheque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

@SpringBootApplication
public class MediathequeApplication {

	public static void main(String[] args) {
		
		//instanciation de lapp springboot
		//SpringApplication application = new SpringApplication(MediathequeApplication.class);
		//Creation objet configurable environment
		//onfigurableEnvironment environment = new StandardEnvironment();
		//On manipule lobjet pour lui assigner un profil par defaut
		//environment.setDefaultProfiles("dev");
		//on associe lobjet application a lenvironnement
		//application.setEnvironment(environment);
		//application.run(args);
		SpringApplication.run(MediathequeApplication.class, args);
		
	}

}
