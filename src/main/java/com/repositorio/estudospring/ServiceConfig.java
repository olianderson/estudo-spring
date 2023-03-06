package com.repositorio.estudospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.repositorio.estudospring.notificacao.Notificador;
import com.repositorio.estudospring.service.AtivacaoClienteService;


@Configuration
public class ServiceConfig {
    
    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
        return new AtivacaoClienteService(notificador);
    }
    
}
