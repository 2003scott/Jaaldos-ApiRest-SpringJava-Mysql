package com.pe.jaaldos.Service;



import com.pe.jaaldos.Entity.Proveedor;

import java.util.List;
import java.util.Optional;

public interface ProveedorService {

    List<Proveedor> findAll();
    List<Proveedor> findAllCustom();
    Optional<Proveedor> findById(Long id);
    Proveedor add(Proveedor prov);
    Proveedor update(Proveedor prov);
    Proveedor delete(Proveedor prov);

}
