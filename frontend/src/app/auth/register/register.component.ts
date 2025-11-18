import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './register.component.html'
})
export class RegisterComponent {

  formData = {
    nombre: '',
    documento: '',
    correo: '',
    contrasenia: ''
  };

  onSubmit() {
    console.log('Registrando usuario...', this.formData);
  }
}
