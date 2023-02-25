package com.dzn.backendshiro.controllers;


import com.dzn.backendshiro.entities.Cliente;
import com.dzn.backendshiro.services.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteRestController {


    @Autowired
    public ClienteServiceImpl clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index(){

        return clienteService.findAll();
    }

}
