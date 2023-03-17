package com.pe.jaaldos.RestController;

import com.pe.jaaldos.Entity.Entrada;
import com.pe.jaaldos.Service.EntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entrada")
public class EntradaRestController {

    @Autowired
    private EntradaService entradaService;

    /**
     * http://localhost:8090/jaaldos/entrada
     * @return
     */
    @GetMapping
    public List<Entrada> findAll() {
        return entradaService.findAll();
    }

    @GetMapping("/custom")
    public List<Entrada> findAllCustom() {
        return entradaService.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<Entrada> findById(@PathVariable Long id) {
        return entradaService.findById(id);
    }

    @PostMapping
    public Entrada add(@RequestBody Entrada ent){
        return entradaService.add(ent);
    }

    @PutMapping("/{id}")
    public Entrada update(@PathVariable Long id, @RequestBody Entrada ent){
        ent.setCodigo(id);
        return entradaService.update(ent);
    }

    @DeleteMapping("/{id}")
    public Entrada delete(@PathVariable Long id){
        Entrada objentrada = new Entrada();
        objentrada.setEstado(false);
        return entradaService.delete(Entrada.builder().codigo(id).build());
    }
}
