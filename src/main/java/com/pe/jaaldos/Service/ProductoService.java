package com.pe.jaaldos.Service;

import com.pe.jaaldos.Entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    List<Producto> findAll();
    List<Producto> findAllCustom();
    Optional<Producto> findById(Long id);
    Producto add(Producto p);
    Producto update(Producto p);
    Producto delete(Producto p);
}
