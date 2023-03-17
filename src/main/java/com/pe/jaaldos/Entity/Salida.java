package com.pe.jaaldos.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Salida")
@Table(name = "salida")
public class Salida implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codsal")
    private Long codigo;

    @Column(name = "cantsal")
    private String cantidad;

    @Column(name = "presal")
    private Double preciogeneral;

    @ManyToOne
    @JoinColumn(name = "codpro", nullable = false)
    private Producto producto;

    @Column(name = "estsal")
    private Boolean estado;
}
