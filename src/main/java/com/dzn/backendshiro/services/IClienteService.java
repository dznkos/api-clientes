package com.dzn.backendshiro.services;

import com.dzn.backendshiro.entities.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();
}
