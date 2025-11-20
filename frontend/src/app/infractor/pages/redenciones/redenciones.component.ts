
import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ApiService } from '../../../core/services/api.service';

@Component({
  selector: 'app-redenciones',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './redenciones.component.html',
  styleUrls: ['./redenciones.component.scss']
})
export class RedencionesComponent implements OnInit {

  redenciones: any[] = [];

  constructor(private api: ApiService) {}

  ngOnInit() {
    const user = JSON.parse(localStorage.getItem('user') || '{}');

    this.api.get<any[]>('redenciones').subscribe(data => {
      this.redenciones = data.filter(r => r.usuario?.id === user.id);
    });
  }
}
