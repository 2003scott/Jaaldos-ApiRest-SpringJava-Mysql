package com.pe.jaaldos.Service;

import com.pe.jaaldos.Entity.Ubicacion;

import java.util.List;
import java.util.Optional;

public interface UbicacionService {

    List<Ubicacion> findAll();
    List<Ubicacion> findAllCustom();
    Optional<Ubicacion> findById(Long id);
    Ubicacion add(Ubicacion u);
    Ubicacion update(Ubicacion u);
    Ubicacion delete(Ubicacion u);


}
