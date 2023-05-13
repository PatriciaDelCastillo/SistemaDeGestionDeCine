package com.ruiz.cine.controller;


import com.ruiz.cine.entity.Pelicula;
import com.ruiz.cine.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class PeliculaController {
    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/peliculas")
    public List<Pelicula> listarPeliculas() {
        return peliculaService.listarPeliculas();
    }

    @GetMapping("/peliculas/{id}")
    public ResponseEntity<Pelicula> obtenerPelicula(@PathVariable Long id) {
        try {
            Pelicula pelicula = peliculaService.obtenerPeliculaPorId(id);
            return new ResponseEntity<Pelicula>(pelicula, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<Pelicula>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/peliculas")
    public void guardarPelicula(@RequestBody Pelicula pelicula) {
        peliculaService.guardarPeliculas(pelicula);
    }

    @PutMapping("/peliculas/{id}")
    public ResponseEntity<?> modificarPeliculas(@RequestBody Pelicula pelicula,@PathVariable Long id) {
        try {
          Pelicula peliculaActual = peliculaService.obtenerPeliculaPorId(id);

            peliculaService.actualizarPelicula(peliculaActual);
            return new ResponseEntity<Pelicula>( HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<Pelicula>(HttpStatus.NOT_FOUND);

        }
    }

    @DeleteMapping("/peliculas/{id}")
    public void eliminarPelicula(@PathVariable Long id) {
        peliculaService.eliminarPeliculaPorId(id);
    }

}
