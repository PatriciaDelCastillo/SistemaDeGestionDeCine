package com.ruiz.cine.service;

import com.ruiz.cine.entity.Pelicula;
import com.ruiz.cine.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaService {
    @Autowired
    private  PeliculaRepository peliculaRepository;

   public List<Pelicula>listarPeliculas(){
       return peliculaRepository.findAll();
   }

   public void guardarPeliculas(Pelicula pelicula){
       peliculaRepository.save(pelicula);
   }

   public  Pelicula obtenerPeliculaPorId(Long id){
       return peliculaRepository.findById(id).get();
   }

    public void eliminarPeliculaPorId(Long id){
       peliculaRepository.deleteById(id);
    }
    public Pelicula actualizarPelicula(Pelicula pelicula) {
        Pelicula peliculaActual = obtenerPeliculaPorId(pelicula.getId());
        if (peliculaActual != null) {
            guardarPeliculas(pelicula);
            return pelicula;
        } else {
            return null;
        }
    }


}
