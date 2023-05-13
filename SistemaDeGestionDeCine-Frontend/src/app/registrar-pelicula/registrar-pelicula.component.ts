import { Component } from '@angular/core';
import { Pelicula } from '../model/pelicula';

import { faCalendar } from '@fortawesome/free-regular-svg-icons';

@Component({
  selector: 'app-registrar-pelicula',
  templateUrl: './registrar-pelicula.component.html',
  styleUrls: ['./registrar-pelicula.component.css'],
})
export class RegistrarPeliculaComponent {
  title = 'appBootstrap';
  faCalendar = faCalendar;
  pelicula: Pelicula = new Pelicula();
  estadoGenero: string[] = [
    'ACCION',
    'AVENTURA',
    'CIENCIA FICCION',
    'COMEDIA',
    'DRAMA',
    'FANTASIA',
    'MUSICAL',
    'SUSPENSO',
    'TERROR',
  ];
  calificacion: string[] = [
    'EXCELENTE',
    'MUY BUENA',
    'BUENA',
    'REGULAR',
    'MALA',
  ];
  disponible: string[] = ['SI', 'NO'];
  pais: string[] = [
    'USA',
    'REINO UNIDO',
    'ESPAÑA',
    'ARGENTINA',
    'MEXICO',
    'CANADA',
    'CHINA',
    'INDIA',
    'ITALIA',
    'ALEMANIA',
    'JAPON',
    'FRANCIA',
  ];
  idioma: string[] = ['INGLES', 'FRANCES', 'ESPAÑOL', 'JAPONES', 'MANDARIN'];
  model: any;
  constructor() {}

  ngOnInit(): void {}
  onSubmit() {
    console.log(this.pelicula);
  }
}
