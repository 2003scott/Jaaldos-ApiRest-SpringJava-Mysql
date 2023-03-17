package com.pe.jaaldos.Repository;

import com.pe.jaaldos.Entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProveedorRepository extends JpaRepository<Proveedor,Long> {

    @Query("select prov from Proveedor prov where prov.estado=1")
    List<Proveedor> findAllCustom();
}
