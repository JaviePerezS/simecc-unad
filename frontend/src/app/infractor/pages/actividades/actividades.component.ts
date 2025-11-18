import { Component, OnInit } from '@angular/core';
import { ApiService } from '../../../core/services/api.service';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-actividades',
  standalone: true,
  imports: [CommonModule], // <-- Coma agregada
  templateUrl: './actividades.component.html',
  styleUrls: ['./actividades.component.scss']
})
export class ActividadesComponent implements OnInit {

  actividades: any[] = [];

  constructor(private api: ApiService) {}

  ngOnInit() {
    // Se añade el genérico <any[]> para tipado correcto
    this.api.get<any[]>('actividades').subscribe((data: any[]) => {
      this.actividades = data;
    });
  }

  redimir(idActividad: number) {
    const user = JSON.parse(localStorage.getItem('user') || '{}');

    const body = {
      usuario: { id: user.id },
      actividad: { id: idActividad },
      fecha: new Date().toISOString()
    };

    this.api.post('redenciones', body).subscribe(() => {
      // Se reemplaza alert() por console.log()
      console.log('Actividad redimida correctamente');
    });
  }
}