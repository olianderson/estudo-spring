package com.repositorio.estudospring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.repositorio.estudospring.model.Cliente;
import com.repositorio.estudospring.notificacao.NivelUrgencia;
import com.repositorio.estudospring.notificacao.Notificador;
import com.repositorio.estudospring.notificacao.TipoDoNotificador;


@Component
public class AtivacaoClienteService {

    @TipoDoNotificador(NivelUrgencia.URGENTE)
    @Autowired
    private Notificador notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
