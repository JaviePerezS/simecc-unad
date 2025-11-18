import { Component, OnInit } from '@angular/core';
import { ApiService } from '../../../core/services/api.service';

@Component({
  selector: 'app-certificados',
  standalone: true,
  imports: [CommonModule]
  templateUrl: './certificados.component.html',
  styleUrls: ['./certificados.component.scss']
})
export class CertificadosComponent implements OnInit {

  certificados: any[] = [];

  constructor(private api: ApiService) {}

  ngOnInit() {
    const user = JSON.parse(localStorage.getItem('user') || '{}');

    this.api.get('certificados').subscribe((data: any[]) => {
      this.certificados = data.filter(c => c.usuario?.id === user.id);
    });
  }
}
