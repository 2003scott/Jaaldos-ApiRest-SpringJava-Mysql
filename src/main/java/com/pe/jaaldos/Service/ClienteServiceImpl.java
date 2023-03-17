package com.pe.jaaldos.Service;

import com.pe.jaaldos.Entity.Cliente;
import com.pe.jaaldos.Repository.ClienteRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public List<Cliente> findAllCustom() {
        return clienteRepository.findAllCustom();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente add(Cliente cli) {
        return clienteRepository.save(cli);
    }

    @Override
    public Cliente update(Cliente cli) {
        Cliente objCliente = clienteRepository.getById(cli.getCodigo());
        BeanUtils.copyProperties(cli, objCliente);
        return clienteRepository.save(objCliente);
    }

    @Override
    public Cliente delete(Cliente cli) {
        Cliente objCliente = clienteRepository.getById(cli.getCodigo());
        objCliente.setEstado(false);
        return clienteRepository.save(objCliente);
    }
}
