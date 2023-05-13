package com.ruiz.cine.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class Pelicula  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre;
    private String tituloOriginal;
    private Double duracion;
    private Date anioEstreno;
    private Date fechaIngreso;
    private String disponible;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_genero")
    private Genero genero;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_calificacion")
    private Calificacion calificacion;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_pais")
    private PaisDeOrigen paisDeOrigen;
    @OneToMany(mappedBy = "pelicula")
    @JsonIgnore
    private Set<Personaje> personaje;
}
