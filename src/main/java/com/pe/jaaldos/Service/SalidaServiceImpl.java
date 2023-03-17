package com.pe.jaaldos.Service;

import com.pe.jaaldos.Entity.Salida;
import com.pe.jaaldos.Repository.SalidaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalidaServiceImpl implements SalidaService{

    @Autowired
    SalidaRepository salidaRepository;

    @Override
    public List<Salida> findAll() {
        return salidaRepository.findAll();
    }

    @Override
    public List<Salida> findAllCustom() {
        return salidaRepository.findAllCustom();
    }

    @Override
    public Optional<Salida> findById(Long id) {
        return salidaRepository.findById(id);
    }

    @Override
    public Salida add(Salida s) {
        return salidaRepository.save(s);
    }

    @Override
    public Salida update(Salida s) {
        Salida objSalida = salidaRepository.getById(s.getCodigo());
        BeanUtils.copyProperties(s, objSalida);
        return salidaRepository.save(objSalida);
    }

    @Override
    public Salida delete(Salida s) {
        Salida objSalida = salidaRepository.getById(s.getCodigo());
        objSalida.setEstado(false);
        return salidaRepository.save(objSalida);
    }
}
