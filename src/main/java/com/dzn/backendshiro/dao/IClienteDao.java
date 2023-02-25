package com.dzn.backendshiro.dao;

import com.dzn.backendshiro.entities.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;



public interface IClienteDao extends CrudRepository<Cliente, Long> {



}
