package com.pe.jaaldos.Service;


import com.pe.jaaldos.Entity.DetalleSalida;

import java.util.List;
import java.util.Optional;

public interface DetalleSalidaService {

    List<DetalleSalida> findAll();
    Optional<DetalleSalida> findById(Long id);
    DetalleSalida add(DetalleSalida ds);
    DetalleSalida update(DetalleSalida ds);
    DetalleSalida delete(DetalleSalida ds);
}
