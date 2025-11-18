import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './dashboard.component.html'
})
export class DashboardComponent {

  // Aquí luego haremos peticiones al backend
  data = {
    totalUsuarios: 32,
    totalMultas: 12,
    totalActividades: 18,
    totalRedenciones: 9
  };

}
