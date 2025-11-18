import { Component, OnInit } from '@angular/core';
import { ApiService } from '../../../core/services/api.service';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-certificados',
  standalone: true,
  imports: [CommonModule], // <-- Coma agregada
  templateUrl: './certificados.component.html',
  styleUrls: ['./certificados.component.scss']
})
export class CertificadosComponent implements OnInit {

  certificados: any[] = [];

  constructor(private api: ApiService) {}

  ngOnInit() {
    const user = JSON.parse(localStorage.getItem('user') || '{}');

    // Se mantiene la corrección genérica <any[]> para evitar errores de tipado
    this.api.get<any[]>('certificados').subscribe((data: any[]) => {
      this.certificados = data.filter(c => c.usuario?.id === user.id);
    });
  }
}