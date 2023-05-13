package com.ruiz.cine.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreEnLaPelicula;


    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_actor")
    private Actor actor;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_rol")
    private Rol rol;
    @ManyToOne
    private Pelicula pelicula;
}
