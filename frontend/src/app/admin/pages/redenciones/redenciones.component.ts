import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-redenciones-admin',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './redenciones.component.html',
  styleUrls: ['./redenciones.component.scss']
})
export class RedencionesComponent {

  redenciones = [
    { id: 1, usuario: 'Pedro López', actividad: 'Limpieza de parque', fecha: '2025-01-10' },
    { id: 2, usuario: 'María Díaz', actividad: 'Charla educativa', fecha: '2025-01-15' }
  ];

}
