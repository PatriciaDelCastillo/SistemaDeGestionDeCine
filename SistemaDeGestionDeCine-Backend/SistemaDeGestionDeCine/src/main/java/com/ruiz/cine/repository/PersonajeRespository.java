package com.ruiz.cine.repository;

import com.ruiz.cine.entity.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonajeRespository extends JpaRepository<Personaje,Long> {
}
