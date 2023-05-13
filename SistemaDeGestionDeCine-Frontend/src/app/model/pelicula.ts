import { Calificacion } from './calificacion';
import { Genero } from './genero';
import { PaisDeOrigen } from './paisDeOrigen';

export class Pelicula {
  id: number;
  nombre: string;
  tituloOriginal: string;
  anioEstreno: string;
  duracion: number;
  fechaIngreso: string;
  disponible: Boolean;
  genero: Genero;
  calificacion: Calificacion;
  paisDeOrigen: PaisDeOrigen;
}
