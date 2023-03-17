package com.pe.jaaldos.Service;

import com.pe.jaaldos.Entity.RolCargo;
import com.pe.jaaldos.Repository.RolCargoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolCargoServiceImpl implements RolCargoService{

    @Autowired
    private RolCargoRepository rolCargoRepository;

    @Override
    public List<RolCargo> findAll() {
        return rolCargoRepository.findAll();
    }

    @Override
    public List<RolCargo> findAllCustom() {
        return rolCargoRepository.findAllCustom();
    }

    @Override
    public Optional<RolCargo> findById(Long id) {
        return rolCargoRepository.findById(id);
    }

    @Override
    public RolCargo add(RolCargo rc) {
        return rolCargoRepository.save(rc);
    }

    @Override
    public RolCargo update(RolCargo rc) {
        RolCargo objRolCargo = rolCargoRepository.getById(rc.getCodigo());
        BeanUtils.copyProperties(rc, objRolCargo);
        return rolCargoRepository.save(objRolCargo);
    }

    @Override
    public RolCargo delete(RolCargo rc) {
        RolCargo objRolCargo = rolCargoRepository.getById(rc.getCodigo());
        objRolCargo.setEstado(false);
        return rolCargoRepository.save(objRolCargo);
    }
}
