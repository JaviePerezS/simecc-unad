import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-usuarios',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './usuarios.component.html'
})
export class UsuariosComponent {

  usuarios = [
    { id: 1, nombre: 'Carlos', documento: '12345', rol: 'Infractor' },
    { id: 2, nombre: 'Ana', documento: '67890', rol: 'Administrador' }
  ];

}
