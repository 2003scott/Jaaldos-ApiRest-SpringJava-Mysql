package com.pe.jaaldos.RestController;


import com.pe.jaaldos.Entity.Ubicacion;
import com.pe.jaaldos.Service.UbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ubicacion")
public class UbicacionRestController {

    @Autowired
    private UbicacionService ubicacionService;

    /**
     * http://localhost:8090/jaaldos/ubicacion
     * @return
     */
    @GetMapping
    public List<Ubicacion> findAll() {
        return ubicacionService.findAll();
    }

    @GetMapping("/custom")
    public List<Ubicacion> findAllCustom() {
        return ubicacionService.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<Ubicacion> findById(@PathVariable Long id) {
        return ubicacionService.findById(id);
    }

    @PostMapping
    public Ubicacion add(@RequestBody Ubicacion u){
        return ubicacionService.add(u);
    }

    @PutMapping("/{id}")
    public Ubicacion update(@PathVariable Long id, @RequestBody Ubicacion u){
        u.setCodigo(id);
        return ubicacionService.update(u);
    }

    @DeleteMapping("/{id}")
    public Ubicacion delete(@PathVariable Long id){
        Ubicacion objUbicacion = new Ubicacion();
        objUbicacion.setEstado(false);
        return ubicacionService.delete(Ubicacion.builder().codigo(id).build());
    }

}
