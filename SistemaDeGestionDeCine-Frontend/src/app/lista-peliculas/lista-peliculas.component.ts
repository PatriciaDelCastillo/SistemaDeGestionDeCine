import { Component, OnInit } from '@angular/core';
import { Pelicula } from '../model/pelicula';
import { PeliculaService } from '../pelicula.service';
import { faTired } from '@fortawesome/free-solid-svg-icons';
import { faDev } from '@fortawesome/free-brands-svg-icons';

@Component({
  selector: 'app-lista-peliculas',
  templateUrl: './lista-peliculas.component.html',
  styleUrls: ['./lista-peliculas.component.css'],
})
export class ListaPeliculasComponent implements OnInit {
  peliculas: Pelicula[];

  constructor(private peliculaServicio: PeliculaService) {}
  ngOnInit(): void {
    this.obtenerPeliculas();
  }

  private obtenerPeliculas() {
    this.peliculaServicio.obtenerListaPeliculas().subscribe((dato) => {
      this.peliculas = dato;
    });
  }
}
