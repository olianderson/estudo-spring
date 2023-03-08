package com.repositorio.estudospring.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.repositorio.estudospring.EstudoSpringApplication;
import com.repositorio.estudospring.domain.model.Cozinha;

public class ExclusaoCozinhaMain {

    public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(EstudoSpringApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);
		
		Cozinha cozinha = new Cozinha();
		cozinha.setId(1L);
		
		cadastroCozinha.remover(cozinha);
	}
}
