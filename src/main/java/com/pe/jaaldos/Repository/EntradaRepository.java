package com.pe.jaaldos.Repository;

import com.pe.jaaldos.Entity.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EntradaRepository extends JpaRepository<Entrada,Long> {

    @Query("select ent from Entrada ent where ent.estado=1")
    List<Entrada> findAllCustom();
}
