import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ApiService } from '../../../core/services/api.service';

@Component({
  selector: 'app-multas',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './multas.component.html',
  styleUrls: ['./multas.component.scss']
})
export class MultasComponent implements OnInit {

  multas: any[] = [];

  constructor(private api: ApiService) {}

  ngOnInit() {
    const user = JSON.parse(localStorage.getItem('user') || '{}');

    this.api.get<any[]>('multas').subscribe(data => {
      this.multas = data.filter(m => m.usuario?.id === user.id);
    });
  }
}
