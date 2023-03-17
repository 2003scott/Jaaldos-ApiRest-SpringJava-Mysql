package com.pe.jaaldos.Service;

import com.pe.jaaldos.Entity.Proveedor;
import com.pe.jaaldos.Repository.ProveedorRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorServiceImpl  implements ProveedorService{

    @Autowired
    ProveedorRepository proveedorRepository;

    @Override
    public List<Proveedor> findAll() {
        return proveedorRepository.findAll();
    }

    @Override
    public List<Proveedor> findAllCustom() {
        return proveedorRepository.findAllCustom();
    }

    @Override
    public Optional<Proveedor> findById(Long id) {
        return proveedorRepository.findById(id);
    }

    @Override
    public Proveedor add(Proveedor prov) {
        return proveedorRepository.save(prov);
    }

    @Override
    public Proveedor update(Proveedor prov) {
        Proveedor objProveedor = proveedorRepository.getById(prov.getCodigo());
        BeanUtils.copyProperties(prov, objProveedor);
        return proveedorRepository.save(objProveedor);
    }

    @Override
    public Proveedor delete(Proveedor prov) {
        Proveedor objProveedor = proveedorRepository.getById(prov.getCodigo());
        objProveedor.setEstado(false);
        return proveedorRepository.save(objProveedor);
    }
}
