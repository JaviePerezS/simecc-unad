import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ApiService } from '../../../core/services/api.service';

@Component({
  selector: 'app-actividades',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './actividades.component.html',
  styleUrls: ['./actividades.component.scss']
})
export class ActividadesComponent implements OnInit {

  actividades: any[] = [];

  constructor(private api: ApiService) {}

  ngOnInit() {
    this.api.get<any[]>('actividades').subscribe(data => {
      this.actividades = data;
    });
  }

  redimir(idActividad: number) {
    console.log('Redimir actividad', idActividad);
  }
}
