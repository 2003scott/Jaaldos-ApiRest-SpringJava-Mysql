package com.pe.jaaldos.Service;


import com.pe.jaaldos.Entity.Salida;

import java.util.List;
import java.util.Optional;

public interface SalidaService {

    List<Salida> findAll();
    List<Salida> findAllCustom();
    Optional<Salida> findById(Long id);
    Salida add(Salida s);
    Salida update(Salida s);
    Salida delete(Salida s);

}
