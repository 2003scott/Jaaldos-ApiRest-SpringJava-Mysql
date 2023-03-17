package com.pe.jaaldos.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Entrada")
@Table(name = "entrada")
public class Entrada implements Serializable {

    public static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codent")
    private Long codigo;

    @Column(name = "cantent")
    private Integer cantidad;

    @Column(name = "preent")
    private Double preciogeneral;

    @ManyToOne
    @JoinColumn(name = "codprov", nullable = false)
    private Proveedor proveedor;

    @ManyToOne
    @JoinColumn(name = "codpro", nullable = false)
    private Producto producto;

    @Column(name = "estent")
    private Boolean estado;
}
