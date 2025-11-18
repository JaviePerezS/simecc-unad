import { Component, OnInit } from '@angular/core';
import { ApiService } from '../../../core/services/api.service';

@Component({
  selector: 'app-home',
  standalone: true,
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  usuario: any;
  puntosRestantes = 0;
  actividadesRealizadas = 0;

  constructor(private api: ApiService) {}

  ngOnInit() {
    this.cargarDatos();
  }

  cargarDatos() {
    const user = JSON.parse(localStorage.getItem('user') || '{}');

    this.api.get(`usuarios/${user.id}`).subscribe(data => {
      this.usuario = data;
    });

    this.api.get(`redenciones`).subscribe((data: any[]) => {
      this.actividadesRealizadas = data.length;
    });
  }
}
