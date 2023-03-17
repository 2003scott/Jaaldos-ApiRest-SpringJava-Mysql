package com.pe.jaaldos.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Proveedor")
@Table(name = "proveedor")
public class Proveedor implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codprov")
    private Long codigo;

    @Column(name = "nomprov")
    private String nombre;

    @Column(name = "correoprov")
    private String correo;

    @Column(name = "telprov")
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "codubi", nullable = false)
    private Ubicacion ubicacion;

    @Column(name = "dirprov")
    private String direccion;

    @Column(name = "estprov")
    private Boolean estado;
}
