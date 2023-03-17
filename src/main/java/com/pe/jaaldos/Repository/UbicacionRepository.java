package com.pe.jaaldos.Repository;

import com.pe.jaaldos.Entity.Ubicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UbicacionRepository extends JpaRepository<Ubicacion,Long> {

    @Query("select u from Ubicacion u where u.estado=1")
    List<Ubicacion> findAllCustom();
}
