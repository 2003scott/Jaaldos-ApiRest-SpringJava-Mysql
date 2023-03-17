package com.pe.jaaldos.Service;

import com.pe.jaaldos.Entity.Entrada;
import com.pe.jaaldos.Repository.EntradaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntradaServiceImpl implements EntradaService {

    @Autowired
    EntradaRepository entradaRepository;

    @Override
    public List<Entrada> findAll() {
        return entradaRepository.findAll();
    }

    @Override
    public List<Entrada> findAllCustom() {
        return entradaRepository.findAllCustom();
    }

    @Override
    public Optional<Entrada> findById(Long id) {
        return entradaRepository.findById(id);
    }

    @Override
    public Entrada add(Entrada ent) {
        return entradaRepository.save(ent);
    }

    @Override
    public Entrada update(Entrada ent) {
        Entrada objEntrada = entradaRepository.getById(ent.getCodigo());
        BeanUtils.copyProperties(ent,objEntrada);
        return entradaRepository.save(objEntrada);
    }

    @Override
    public Entrada delete(Entrada ent) {
        Entrada objEntrada = entradaRepository.getById(ent.getCodigo());
        objEntrada.setEstado(false);
        return entradaRepository.save(objEntrada);
    }
}
