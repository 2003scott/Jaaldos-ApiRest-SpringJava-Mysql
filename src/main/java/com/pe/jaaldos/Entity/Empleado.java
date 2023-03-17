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
@Entity(name = "Empleado")
@Table(name = "empleado")
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codempl")
    private Long codigo;

    @Column(name = "nombresempl")
    private String nombres;

    @Column(name = "apellidosempl")
    private String apellidos;

    @Column(name = "dniempl")
    private String dni;

    @Column(name = "telempl")
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "codubi", nullable = false)
    private Ubicacion ubicacion;

    @ManyToOne
    @JoinColumn(name = "codrol", nullable = false)
    private RolCargo cargo;

    @Column(name = "estempl")
    private boolean estado;
}
