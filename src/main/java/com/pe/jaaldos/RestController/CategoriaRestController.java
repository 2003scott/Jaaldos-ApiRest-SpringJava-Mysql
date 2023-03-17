package com.pe.jaaldos.RestController;


import com.pe.jaaldos.Entity.Categoria;
import com.pe.jaaldos.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoriaRestController {

    @Autowired
    private CategoriaService categoriaService;

    /**
     * http://localhost:8090/jaaldos/categoria
     * @return
     */
    @GetMapping
    public List<Categoria> findAll(){
        return categoriaService.findAll();
    }

    @GetMapping("/custom")
    public List<Categoria> findAllCustom(){
        return categoriaService.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<Categoria> findById(@PathVariable Long id){
        return categoriaService.findById(id);
    }

    @PostMapping
    public Categoria add(@RequestBody Categoria c){
        return categoriaService.add(c);
    }

    @PutMapping("/{id}")
    public Categoria update(@PathVariable Long id, @RequestBody Categoria c){
        c.setCodigo(id);
        return categoriaService.update(c);
    }

    @DeleteMapping("/{id}")
    public Categoria delete(@PathVariable Long id){
        Categoria objcategoria = new Categoria();
        objcategoria.setEstado(false);
        return categoriaService.delete(Categoria.builder().codigo(id).build());

    }
}
