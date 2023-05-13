package com.ruiz.cine.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;
import java.time.LocalDate;
import java.util.Date;
import java.util.Timer;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class HorarioFuncion {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private Date diaDeSemana;
 private int intervalo;
 private int duracionPublicidad;
 private boolean esTrasnoche;

 private LocalDate horaPrimeraFuncion;
 private LocalDate horaUltimaFuncion;
}
