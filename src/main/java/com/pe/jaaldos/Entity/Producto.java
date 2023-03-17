package com.pe.jaaldos.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Producto")
@Table(name = "productos")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codpro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "nompro")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "codcat",nullable = false)
    private Categoria categoria;

    @Column(name = "stockpro")
    private int stock;

    @Column(name = "precsol")
    private double preciosoles;


    @Column(name = "estpro")
    private boolean estado;
}
