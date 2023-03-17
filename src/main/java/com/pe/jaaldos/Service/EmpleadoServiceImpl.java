package com.pe.jaaldos.Service;

import com.pe.jaaldos.Entity.Empleado;
import com.pe.jaaldos.Repository.EmpleadoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public List<Empleado> findAllCustom() {
        return empleadoRepository.findAllCustom();
    }

    @Override
    public Optional<Empleado> findById(Long id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public Empleado add(Empleado e) {
        return empleadoRepository.save(e);
    }

    @Override
    public Empleado update(Empleado e) {
        Empleado objEmpleado = empleadoRepository.getById(e.getCodigo());
        BeanUtils.copyProperties(e, objEmpleado);
        return empleadoRepository.save(objEmpleado);
    }

    @Override
    public Empleado delete(Empleado e) {
        Empleado objEmpleado = empleadoRepository.getById(e.getCodigo());
        objEmpleado.setEstado(false);
        return empleadoRepository.save(objEmpleado);
    }
}
