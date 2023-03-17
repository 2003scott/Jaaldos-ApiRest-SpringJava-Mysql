package com.pe.jaaldos.Repository;

import com.pe.jaaldos.Entity.Salida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SalidaRepository extends JpaRepository<Salida,Long> {

    @Query("select s from Salida s where s.estado=1")
    List<Salida> findAllCustom();
}