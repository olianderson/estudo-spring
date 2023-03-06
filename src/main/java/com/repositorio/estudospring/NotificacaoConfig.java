package com.repositorio.estudospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.repositorio.estudospring.notificacao.NotificadorEmail;

@Configuration
public class NotificacaoConfig {
    
    @Bean
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificador = new NotificadorEmail("estudospring@gmail.com");
        notificador.setCaixaAlta(true);

        return notificador;
    }
}
