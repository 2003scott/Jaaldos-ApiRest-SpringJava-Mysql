package com.pe.jaaldos.Service;

import com.pe.jaaldos.Entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {

    List<Categoria> findAll();
    List<Categoria> findAllCustom();
    Optional<Categoria> findById(Long id);
    Categoria add(Categoria c);
    Categoria update(Categoria c);
    Categoria delete(Categoria c);

}
