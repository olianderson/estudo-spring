package com.repositorio.estudospring.service;

import org.springframework.stereotype.Component;

import com.repositorio.estudospring.model.Cliente;
import com.repositorio.estudospring.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {

    private NotificadorEmail notificador;

    public void notificar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
