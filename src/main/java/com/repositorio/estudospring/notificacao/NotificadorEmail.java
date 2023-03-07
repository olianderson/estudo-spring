package com.repositorio.estudospring.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.repositorio.estudospring.model.Cliente;


@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {
    
    @Autowired
    private NotificadorProperties properties;

    public NotificadorEmail() {
        System.out.println("NotificadorEmail chamado");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {

        System.out.println("Host: " + properties.getHostServidor());
        System.out.println("Porta: " + properties.getPortaServidor());

        System.out.printf("Notificando %s através do e-mail %s: %s\n", 
                            cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
