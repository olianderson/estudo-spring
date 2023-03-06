package com.repositorio.estudospring.notificacao;

import com.repositorio.estudospring.model.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);

}