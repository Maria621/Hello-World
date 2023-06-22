package com.generation.helloworld.objetivos;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivos")


public class Objetivos {
	
	@GetMapping
	public String Objetivos() {
		return "\t Lista de meus Objetivos De Aprendizagem desta semana : Criando bancos de dados relacionais com MySQL; "
				+ " Introdução ao SQL; "
				+ "SQL Avançado - Juntando Tabelas; "
				+ "Prototipando o banco de dados; "
				+ "Introdução ao Desenvolvimento Web com Java e Spring Boot; "
				+ "Injeção de dependências usando Spring Framewor.";
	}
}   