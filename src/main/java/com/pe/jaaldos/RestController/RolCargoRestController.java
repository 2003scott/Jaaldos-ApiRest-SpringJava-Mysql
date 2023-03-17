package com.pe.jaaldos.RestController;

import com.pe.jaaldos.Entity.RolCargo;
import com.pe.jaaldos.Service.RolCargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rolcargo")
public class RolCargoRestController {

    @Autowired
    private RolCargoService rolCargoService;

    /**
     * http://localhost:8090/jaaldos/rolcargo
     * @return
     */
    @GetMapping
    public List<RolCargo> findAll(){
        return rolCargoService.findAll();
    }

    @GetMapping("/custom")
    public List<RolCargo> findAllCustom(){
        return rolCargoService.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<RolCargo> findById(@PathVariable Long id){
        return rolCargoService.findById(id);
    }

    @PostMapping
    public RolCargo add(@RequestBody RolCargo rc){
        return rolCargoService.add(rc);
    }

    @PutMapping("/{id}")
    public RolCargo update(@PathVariable Long id, @RequestBody RolCargo rc){
        rc.setCodigo(id);
        return rolCargoService.update(rc);
    }

    @DeleteMapping("/{id}")
    public RolCargo delete(@PathVariable Long id){
        RolCargo objRolCargo = new RolCargo();
        objRolCargo.setEstado(false);
        return rolCargoService.delete(RolCargo.builder().codigo(id).build());

    }
}
