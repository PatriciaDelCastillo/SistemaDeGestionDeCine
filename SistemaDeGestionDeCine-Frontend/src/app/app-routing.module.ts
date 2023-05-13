import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaPeliculasComponent } from './lista-peliculas/lista-peliculas.component';
import { RegistrarPeliculaComponent } from './registrar-pelicula/registrar-pelicula.component';

const routes: Routes = [
  {path:'peliculas',component:ListaPeliculasComponent},
  {path:'',redirectTo:'peliculas',pathMatch:'full'},
  {path:'registrar-empleado',component:RegistrarPeliculaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
