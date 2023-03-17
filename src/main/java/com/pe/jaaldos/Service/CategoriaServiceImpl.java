package com.pe.jaaldos.Service;

import com.pe.jaaldos.Entity.Categoria;
import com.pe.jaaldos.Repository.CategoriaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public List<Categoria> findAllCustom() {
        return categoriaRepository.findAllCustom();
    }

    @Override
    public Optional<Categoria> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public Categoria add(Categoria c) {
        return categoriaRepository.save(c);
    }

    @Override
    public Categoria update(Categoria c) {
        Categoria objcategoria = categoriaRepository.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objcategoria);
        return categoriaRepository.save(objcategoria);
    }

    @Override
    public Categoria delete(Categoria c) {
        Categoria objcategoria = categoriaRepository.getById(c.getCodigo());
        objcategoria.setEstado(false);
        return categoriaRepository.save(objcategoria);
    }
}
