import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

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

  constructor(private router: Router) {}

  onLogin() {

    // LUEGO SE CAMBIA POR EL BACKEND REAL
    const fakeUser = {
      documento: this.credentials.documento,
      rol: this.credentials.documento === 'admin'
        ? 'ADMIN'
        : 'INFRACTOR'
    };

    if (fakeUser.rol === 'ADMIN') {
      this.router.navigate(['/admin/dashboard']);
      return;
    }

    if (fakeUser.rol === 'INFRACTOR') {
      this.router.navigate(['/infractor/home']);
      return;
    }
  }
}
