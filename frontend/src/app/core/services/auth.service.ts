import { Injectable } from '@angular/core';
import { StorageService } from './storage.service';

@Injectable({ providedIn: 'root' })
export class AuthService {

  constructor(private storage: StorageService) {}

  login(documento: string, contrasenia: string) {
    // esto luego lo conectamos al backend
    this.storage.set('user', { documento });
    return true;
  }

  logout() {
    this.storage.remove('user');
  }

  isLogged() {
    return this.storage.get('user') != null;
  }
}
