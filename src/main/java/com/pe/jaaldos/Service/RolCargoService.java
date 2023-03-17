package com.pe.jaaldos.Service;

import com.pe.jaaldos.Entity.RolCargo;

import java.util.List;
import java.util.Optional;

public interface RolCargoService {
    List<RolCargo> findAll();
    List<RolCargo> findAllCustom();
    Optional<RolCargo> findById(Long id);
    RolCargo add(RolCargo rc);
    RolCargo update(RolCargo rc);
    RolCargo delete(RolCargo rc);
}
