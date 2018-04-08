package com.ese_temp;

import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication // enable auto-configuration for SpringBoot application
@Controller // web request handling

public class HelloTempApplication { // class for server

	@RequestMapping("/") // handles requests made for the home page
	public String home(Model model){

		// add page attributes that are formatted for display in the html and css files
		model.addAttribute("author", "E$e!");

		List favoriteFoods = Arrays.asList("Candy", "Gumbo", "Pizza");
		model.addAttribute("favoriteFood", favoriteFoods);

		model.addAttribute("favShow", "Game of Throwns");
		return "index.html";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloTempApplication.class, args);
	} // Run server
}
