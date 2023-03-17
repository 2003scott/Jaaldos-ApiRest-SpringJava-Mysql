package com.pe.jaaldos.Service;

import com.pe.jaaldos.Entity.Ubicacion;
import com.pe.jaaldos.Repository.UbicacionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UbicacionServiceImpl implements UbicacionService{

    @Autowired
    private UbicacionRepository ubicacionRepository;

    @Override
    public List<Ubicacion> findAll() {
        return ubicacionRepository.findAll();
    }

    @Override
    public List<Ubicacion> findAllCustom() {
        return ubicacionRepository.findAllCustom();
    }

    @Override
    public Optional<Ubicacion> findById(Long id) {
        return ubicacionRepository.findById(id);
    }

    @Override
    public Ubicacion add(Ubicacion u) {
        return ubicacionRepository.save(u);
    }

    @Override
    public Ubicacion update(Ubicacion u) {
        Ubicacion objUbicacion = ubicacionRepository.getById(u.getCodigo());
        BeanUtils.copyProperties(u, objUbicacion);
        return ubicacionRepository.save(objUbicacion);
    }

    @Override
    public Ubicacion delete(Ubicacion u) {
        Ubicacion objUbicacion = ubicacionRepository.getById(u.getCodigo());
        objUbicacion.setEstado(false);
        return ubicacionRepository.save(objUbicacion);
    }
}
