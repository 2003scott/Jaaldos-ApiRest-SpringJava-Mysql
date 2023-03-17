package com.pe.jaaldos.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "DetalleEntrada")
@Table(name = "detalleentrada")
public class DetalleEntrada implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coddetent")
    private Long codigo;

    @Column(name = "fechadetent")
    private Date fechaEntrada;

    @ManyToOne
    @JoinColumn(name = "codent")
    private Entrada entrada;

}
