package com.pe.jaaldos.Service;



import com.pe.jaaldos.Entity.Empleado;

import java.util.List;
import java.util.Optional;

public interface EmpleadoService {
    List<Empleado> findAll();
    List<Empleado> findAllCustom();
    Optional<Empleado> findById(Long id);
    Empleado add(Empleado e);
    Empleado update(Empleado e);
    Empleado delete(Empleado e);
}
