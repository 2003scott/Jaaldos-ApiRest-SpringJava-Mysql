package com.pe.jaaldos.RestController;

import com.pe.jaaldos.Entity.DetalleEntrada;
import com.pe.jaaldos.Entity.DetalleSalida;
import com.pe.jaaldos.Service.DetalleEntradaService;
import com.pe.jaaldos.Service.DetalleSalidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detallesalida")
public class DetalleSalidaRestController {

    @Autowired
    private DetalleSalidaService detalleSalidaService;

    /**
     *http://localhost:8090/jaaldos/detallesalida
     * @return
     */
    @GetMapping
    public List<DetalleSalida> findAll(){
        return  detalleSalidaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DetalleSalida> findById(@PathVariable Long id){
        return  detalleSalidaService.findById(id);
    }

    @PostMapping
    public DetalleSalida add(@RequestBody DetalleSalida ds){
        return detalleSalidaService.add(ds);
    }

    @PutMapping("{id}")
    public DetalleSalida update(@PathVariable Long id,@RequestBody DetalleSalida ds){
        ds.setCodigo(id);
        return detalleSalidaService.update(ds);
    }

    @DeleteMapping("/{id}")
    public DetalleSalida delete(@PathVariable Long id){
        return detalleSalidaService.delete(DetalleSalida.builder().codigo(id).build());
    }

}
