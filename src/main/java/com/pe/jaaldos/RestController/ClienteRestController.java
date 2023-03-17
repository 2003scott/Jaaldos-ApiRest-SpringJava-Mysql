package com.pe.jaaldos.RestController;

import com.pe.jaaldos.Entity.Cliente;
import com.pe.jaaldos.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    /**
     * http://localhost:8090/jaaldos/clientes
     * @return
     */
    @GetMapping
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    @GetMapping("/custom")
    public List<Cliente> findAllCustom() {
        return clienteService.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @PostMapping
    public Cliente add(@RequestBody Cliente cli){
        return clienteService.add(cli);
    }

    @PutMapping("/{id}")
    public Cliente update(@PathVariable Long id, @RequestBody Cliente cli){
        cli.setCodigo(id);
        return clienteService.update(cli);
    }

    @DeleteMapping("/{id}")
    public Cliente delete(@PathVariable Long id){
        Cliente objcliente = new Cliente();
        objcliente.setEstado(false);
        return clienteService.delete(Cliente.builder().codigo(id).build());

    }

}
