package com.pe.jaaldos.RestController;

import com.pe.jaaldos.Entity.DetalleEntrada;
import com.pe.jaaldos.Service.DetalleEntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detalleentrada")
public class DetalleEntradaRestController {

    @Autowired
    private DetalleEntradaService detalleEntradaService;

    /**
     *http://localhost:8090/jaaldos/detalleentrada
     * @return
     */
    @GetMapping
    public List<DetalleEntrada> findAll(){
        return  detalleEntradaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DetalleEntrada> findById(@PathVariable Long id){
        return  detalleEntradaService.findById(id);
    }

    @PostMapping
    public DetalleEntrada add(@RequestBody DetalleEntrada de){
        return detalleEntradaService.add(de);
    }

    @PutMapping("{id}")
    public DetalleEntrada update(@PathVariable Long id,@RequestBody DetalleEntrada de){
        de.setCodigo(id);
        return detalleEntradaService.update(de);
    }

    @DeleteMapping("/{id}")
    public DetalleEntrada delete(@PathVariable Long id){
        return detalleEntradaService.delete(DetalleEntrada.builder().codigo(id).build());
    }
}
