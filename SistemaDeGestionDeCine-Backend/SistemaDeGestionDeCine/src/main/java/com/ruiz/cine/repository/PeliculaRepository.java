package com.ruiz.cine.repository;

import com.ruiz.cine.entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PeliculaRepository extends JpaRepository<Pelicula,Long> {

}
