import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-actividades-admin',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './actividades.component.html',
  styleUrls: ['./actividades.component.scss']
})
export class ActividadesComponent {

  actividades = [
    { id: 1, nombre: 'Limpieza de parque', puntos: 40, tipo: 'Servicio Comunitario' },
    { id: 2, nombre: 'Charla educativa', puntos: 25, tipo: 'Formación' }
  ];

}
