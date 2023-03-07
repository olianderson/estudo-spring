package com.repositorio.estudospring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.repositorio.estudospring.model.Cliente;
import com.repositorio.estudospring.service.AtivacaoClienteService;


@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService ativacaoClienteService;
    
    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;

        System.out.println("MeuPrimeiroController: " + ativacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {

        Cliente anderson = new Cliente("Anderson", "lima.anderson@gmail.com", "(98) 9 8558-3212", false);
        ativacaoClienteService.ativar(anderson);

        return "Hello, spring";
    }
}
