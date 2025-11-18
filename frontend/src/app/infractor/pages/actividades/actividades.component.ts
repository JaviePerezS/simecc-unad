import { Component, OnInit } from '@angular/core';
import { ApiService } from '../../../core/services/api.service';

@Component({
  selector: 'app-actividades',
  standalone: true,
  imports: [CommonModule]
  templateUrl: './actividades.component.html',
  styleUrls: ['./actividades.component.scss']
})
export class ActividadesComponent implements OnInit {

  actividades: any[] = [];

  constructor(private api: ApiService) {}

  ngOnInit() {
    this.api.get('actividades').subscribe((data: any[]) => {
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
      alert('Actividad redimida correctamente');
    });
  }
}
