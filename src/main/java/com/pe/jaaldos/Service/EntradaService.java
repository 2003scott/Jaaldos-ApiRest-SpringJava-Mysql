package com.pe.jaaldos.Service;


import com.pe.jaaldos.Entity.Entrada;

import java.util.List;
import java.util.Optional;

public interface EntradaService {

    List<Entrada> findAll();
    List<Entrada> findAllCustom();
    Optional<Entrada> findById(Long id);
    Entrada add(Entrada ent);
    Entrada update(Entrada ent);
    Entrada delete(Entrada ent);
}
