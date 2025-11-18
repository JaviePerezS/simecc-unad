import { Component, OnInit } from '@angular/core';
import { ApiService } from '../../../core/services/api.service';

@Component({
  selector: 'app-redenciones',
  standalone: true,
  templateUrl: './redenciones.component.html',
  styleUrls: ['./redenciones.component.scss']
})
export class RedencionesComponent implements OnInit {

  redenciones: any[] = [];

  constructor(private api: ApiService) {}

  ngOnInit() {
    const user = JSON.parse(localStorage.getItem('user') || '{}');

    this.api.get('redenciones').subscribe((data: any[]) => {
      this.redenciones = data.filter(r => r.usuario?.id === user.id);
    });
  }
}
