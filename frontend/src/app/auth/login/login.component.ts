import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './login.component.html'
})
export class LoginComponent {

  credentials = {
    documento: '',
    contrasenia: ''
  };

  onLogin() {
    console.log('Intentando iniciar sesión...', this.credentials);
    // Aquí luego conectamos al backend /api/usuarios/login
  }
}
