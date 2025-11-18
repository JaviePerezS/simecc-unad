import { Component, OnInit } from '@angular/core';
import { ApiService } from '../../../core/services/api.service';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-redenciones',
  standalone: true,
  // CORRECCIÓN: Se añade CommonModule a imports
  imports: [CommonModule],
  templateUrl: './redenciones.component.html',
  styleUrls: ['./redenciones.component.scss']
})
export class RedencionesComponent implements OnInit {

  redenciones: any[] = [];

  constructor(private api: ApiService) {}

  ngOnInit() {
    const user = JSON.parse(localStorage.getItem('user') || '{}');

    // Asumiendo que ya corregimos el ApiService para manejar <any[]> genérico
    this.api.get<any[]>('redenciones').subscribe((data: any[]) => {
      this.redenciones = data.filter(r => r.usuario?.id === user.id);
    });
  }
}