package com.repositorio.estudospring.service;

import org.springframework.stereotype.Component;

import com.repositorio.estudospring.model.Cliente;
import com.repositorio.estudospring.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;

        System.out.println("AtivacaoClienteService: " + notificador);
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
