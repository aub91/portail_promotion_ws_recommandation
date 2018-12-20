package fr.afcepf.al32.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = { "fr.afcepf.al32.groupe2" })
//@EntityScan(basePackages= {"fr.afcepf.al32.groupe2.entity"})
public class App extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(App.class, args);
		// System.out.println("http://localhost:8082/client");
	}

}