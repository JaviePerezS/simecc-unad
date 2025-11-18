import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-multas',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './multas.component.html'
})
export class MultasComponent {

  multas = [
    { id: 1, usuario: 'Carlos', valor: 150000, fecha: '2025-01-12' },
    { id: 2, usuario: 'Ana', valor: 85000, fecha: '2025-01-25' }
  ];

}
