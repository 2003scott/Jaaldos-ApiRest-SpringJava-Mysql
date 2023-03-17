package com.pe.jaaldos.Service;

import com.pe.jaaldos.Entity.DetalleSalida;
import com.pe.jaaldos.Repository.DetalleSalidaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleSalidaServiceImpl implements DetalleSalidaService {

    @Autowired
    DetalleSalidaRepository detalleSalidaRepository;

    @Override
    public List<DetalleSalida> findAll() {
        return detalleSalidaRepository.findAll();
    }

    @Override
    public Optional<DetalleSalida> findById(Long id) {
        return detalleSalidaRepository.findById(id);
    }

    @Override
    public DetalleSalida add(DetalleSalida ds) {
        return detalleSalidaRepository.save(ds);
    }

    @Override
    public DetalleSalida update(DetalleSalida ds) {
        DetalleSalida objDetalleSalida = detalleSalidaRepository.getById(ds.getCodigo());
        BeanUtils.copyProperties(ds, objDetalleSalida);
        return detalleSalidaRepository.save(objDetalleSalida);
    }

    @Override
    public DetalleSalida delete(DetalleSalida ds) {
        DetalleSalida objDetalleSalida = detalleSalidaRepository.getById(ds.getCodigo());
        return detalleSalidaRepository.save(objDetalleSalida);
    }
}
