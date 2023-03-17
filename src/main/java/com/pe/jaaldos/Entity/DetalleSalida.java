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
@Entity(name = "DetalleSalida")
@Table(name = "detallesalida")
public class DetalleSalida implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coddetsal")
    private Long codigo;

    @Column(name = "fechadetsal")
    private Date fechaSalida;

    @ManyToOne
    @JoinColumn(name = "codsal")
    private Salida salida;

}
