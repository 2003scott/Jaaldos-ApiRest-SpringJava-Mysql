package com.pe.jaaldos.RestController;

import com.pe.jaaldos.Entity.Proveedor;
import com.pe.jaaldos.Service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/proveedor")
public class ProveedorRestController {

    @Autowired
    private ProveedorService proveedorService;

    /**
     * http://localhost:8090/jaaldos/proveedor
     * @return
     */
    @GetMapping
    public List<Proveedor> findAll() {
        return proveedorService.findAll();
    }

    @GetMapping("/custom")
    public List<Proveedor> findAllCustom() {
        return proveedorService.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<Proveedor> findById(@PathVariable Long id) {
        return proveedorService.findById(id);
    }

    @PostMapping
    public Proveedor add(@RequestBody Proveedor prov){
        return proveedorService.add(prov);
    }

    @PutMapping("/{id}")
    public Proveedor update(@PathVariable Long id, @RequestBody Proveedor prov){
        prov.setCodigo(id);
        return proveedorService.update(prov);
    }

    @DeleteMapping("/{id}")
    public Proveedor delete(@PathVariable Long id){
        Proveedor objproveedor = new Proveedor();
        objproveedor.setEstado(false);
        return proveedorService.delete(Proveedor.builder().codigo(id).build());
    }
}
