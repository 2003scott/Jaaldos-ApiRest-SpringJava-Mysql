package com.pe.jaaldos.RestController;

import com.pe.jaaldos.Entity.Producto;
import com.pe.jaaldos.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductoRestController {

    @Autowired
    private ProductoService productoService;


    /**
     * http://localhost:8090/jaaldos/productos
     * @return
     */
    @GetMapping
    public List<Producto> findAll(){
        return productoService.findAll();
    }

    @GetMapping("/custom")
    public List<Producto> findAllCustom(){
        return productoService.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<Producto> findById(@PathVariable Long id){
        return productoService.findById(id);
    }

    @PostMapping
    public Producto add(@RequestBody Producto p){
        return productoService.add(p);
    }

    @PutMapping("/{id}")
    public Producto update(@PathVariable Long id, @RequestBody Producto p){
        p.setCodigo(id);
        return productoService.update(p);
    }

    @DeleteMapping("/{id}")
    public Producto delete(@PathVariable Long id){
        Producto objproducto = new Producto();
        objproducto.setEstado(false);
        return productoService.delete(Producto.builder().codigo(id).build());

    }

}
