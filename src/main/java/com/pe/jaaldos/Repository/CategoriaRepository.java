package com.pe.jaaldos.Repository;

import com.pe.jaaldos.Entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

    @Query("select c from Categoria c where c.estado=1")
    List<Categoria> findAllCustom();

}
