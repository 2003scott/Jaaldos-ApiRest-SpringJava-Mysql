package com.pe.jaaldos.RestController;

import com.pe.jaaldos.Entity.Empleado;
import com.pe.jaaldos.Service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empleado")
public class EmpleadoRestController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public List<Empleado> findAll() {
        return empleadoService.findAll();
    }

    @GetMapping("/custom")
    public List<Empleado> findAllCustom() {
        return empleadoService.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<Empleado> findById(@PathVariable Long id) {
        return empleadoService.findById(id);
    }

    @PostMapping
    public Empleado add(@RequestBody Empleado e){
        return empleadoService.add(e);
    }

    @PutMapping("/{id}")
    public Empleado update(@PathVariable Long id,@RequestBody Empleado e){
        e.setCodigo(id);
        return empleadoService.update(e);
    }

    @DeleteMapping("/{id}")
    public Empleado delete(@PathVariable Long id){
        Empleado objempleado = new Empleado();
        objempleado.setEstado(false);
        return empleadoService.delete(Empleado.builder().codigo(id).build());
    }
}
