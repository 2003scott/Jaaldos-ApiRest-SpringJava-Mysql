package com.pe.jaaldos.Service;

import com.pe.jaaldos.Entity.DetalleEntrada;

import java.util.List;
import java.util.Optional;

public interface DetalleEntradaService {

    List<DetalleEntrada> findAll();
    Optional<DetalleEntrada> findById(Long id);
    DetalleEntrada add(DetalleEntrada de);
    DetalleEntrada update(DetalleEntrada de);
    DetalleEntrada delete(DetalleEntrada de);
}
