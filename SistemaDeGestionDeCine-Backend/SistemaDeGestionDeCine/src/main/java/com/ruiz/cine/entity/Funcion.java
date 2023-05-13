package com.ruiz.cine.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Funcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date diaSemana;
    private Double duracion;
    private Date HoraInicio;
    private int numero;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_sala")
//    private Sala sala;

}
