package com.pe.jaaldos.Service;

import com.pe.jaaldos.Entity.Cliente;
import com.pe.jaaldos.Entity.DetalleEntrada;
import com.pe.jaaldos.Repository.DetalleEntradaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleEntradaServiceImpl implements DetalleEntradaService{

    @Autowired
    DetalleEntradaRepository detalleEntradaRepository;

    @Override
    public List<DetalleEntrada> findAll() {
        return detalleEntradaRepository.findAll();
    }

    @Override
    public Optional<DetalleEntrada> findById(Long id) {
        return detalleEntradaRepository.findById(id);
    }

    @Override
    public DetalleEntrada add(DetalleEntrada de) {
        return detalleEntradaRepository.save(de);
    }

    @Override
    public DetalleEntrada update(DetalleEntrada de) {
        DetalleEntrada objDetalleEntrada = detalleEntradaRepository.getById(de.getCodigo());
        BeanUtils.copyProperties(de, objDetalleEntrada);
        return detalleEntradaRepository.save(objDetalleEntrada);
    }

    @Override
    public DetalleEntrada delete(DetalleEntrada de) {
        DetalleEntrada objDetalleEntrada = detalleEntradaRepository.getById(de.getCodigo());
        return detalleEntradaRepository.save(objDetalleEntrada);
    }
}
