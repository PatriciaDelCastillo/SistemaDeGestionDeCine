import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Pelicula } from './model/pelicula';
@Injectable({
  providedIn: 'root',
})
export class PeliculaService {
  private baseURL = 'http://localhost:8080/api/v1/peliculas';

  constructor(private httpClient: HttpClient) {}

  obtenerListaPeliculas(): Observable<Pelicula[]> {
    return this.httpClient.get<Pelicula[]>(`${this.baseURL}`);
  }
}
