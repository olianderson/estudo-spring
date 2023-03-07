package com.repositorio.estudospring.notificacao;

import org.springframework.stereotype.Component;

import com.repositorio.estudospring.model.Cliente;


@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {

    public NotificadorSMS() {
        System.out.println("NotificadorSMS chamado");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do telefone %s: %s\n", 
                            cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
