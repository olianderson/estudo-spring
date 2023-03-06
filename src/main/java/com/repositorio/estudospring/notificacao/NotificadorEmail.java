package com.repositorio.estudospring.notificacao;

import org.springframework.stereotype.Component;

import com.repositorio.estudospring.model.Cliente;

@Component
public class NotificadorEmail implements Notificador {

    public NotificadorEmail() {
        System.out.println("Construtor NotificadorEmail chamado");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
