package com.pe.jaaldos.Service;


import com.pe.jaaldos.Entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    List<Cliente> findAll();
    List<Cliente> findAllCustom();
    Optional<Cliente> findById(Long id);
    Cliente add(Cliente cli);
    Cliente update(Cliente cli);
    Cliente delete(Cliente cli);
}
