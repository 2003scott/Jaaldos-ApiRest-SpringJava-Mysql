package com.pe.jaaldos.Repository;

import com.pe.jaaldos.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto,Long> {

    @Query("select p from Producto p where p.estado=1")
    List<Producto> findAllCustom();
}
