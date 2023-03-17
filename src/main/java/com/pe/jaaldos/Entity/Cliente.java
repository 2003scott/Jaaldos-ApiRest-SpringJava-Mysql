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
    public Long codigo;

    @Column(name = "nombrescli")
    public String nombres;

    @Column(name = "apellidoscli")
    public String apellidos;

    @Column(name = "dnicli")
    public String dni;

    @Column(name = "telcli")
    public String telefono;

    @Column(name = "correocli")
    public String correo;

    @ManyToOne
    @JoinColumn(name = "codubi", nullable = false)
    public Ubicacion ubicacion;

    @Column(name = "direccion")
    public String direccion;

    @Column(name = "estadocli")
    public boolean estado;

}
