package com.pe.jaaldos.RestController;

import com.pe.jaaldos.Entity.Salida;
import com.pe.jaaldos.Service.SalidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/salida")
public class SalidaRestController {

    @Autowired
    private SalidaService salidaService;

    /**
     * http://localhost:8090/jaaldos/salida
     * @return
     */
    @GetMapping
    public List<Salida> findAll(){
        return salidaService.findAll();
    }

    @GetMapping("/custom")
    public List<Salida> findAllCustom(){
        return salidaService.findAllCustom();
    }

    @GetMapping("{id}")
    public Optional<Salida> findById(@PathVariable Long id){
        return salidaService.findById(id);
    }

    @PostMapping
    public Salida add(@RequestBody Salida s){
        return  salidaService.add(s);
    }

    @PutMapping("{id}")
    public Salida update(@PathVariable Long id, @RequestBody Salida s){
        s.setCodigo(id);
        return salidaService.update(s);
    }
    
    

    @DeleteMapping("{id}")
    public Salida delete(@PathVariable Long id){
        Salida objsalida = new Salida();
        objsalida.setEstado(false);
        return salidaService.delete(Salida.builder().codigo(id).build());
    }
}
