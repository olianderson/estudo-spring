package com.repositorio.estudospring.notificacao;

import org.springframework.stereotype.Component;

import com.repositorio.estudospring.model.Cliente;

@Component
public class NotificadorEmail {
    public NotificadorEmail() {
        System.out.println("Construtor NotificadorEmail chamado");
    }

    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificação %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
