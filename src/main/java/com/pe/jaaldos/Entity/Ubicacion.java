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
@Entity(name = "Ubicacion")
@Table(name = "ubicacion")
public class Ubicacion  implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codubi")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "provincia")
    private String provincia;

    @Column(name = "distrito")
    private String distrito;

    @Column(name = "estubi")
    private boolean estado;
}
