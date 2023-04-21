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
@Entity(name = "Cliente")
@Table(name = "cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codcli")
    private Long codigo;

    @Column(name = "nombrescli")
    private String nombres;

    @Column(name = "apellidoscli")
    private String apellidos;

    @Column(name = "dnicli")
    private String dni;

    @Column(name = "telcli")
    private String telefono;

    @Column(name = "correocli")
    private String correo;

    @ManyToOne
    @JoinColumn(name = "codubi", nullable = false)
    private Ubicacion ubicacion;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "estadocli")
    private boolean estado;

}
