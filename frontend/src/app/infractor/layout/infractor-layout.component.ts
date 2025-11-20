import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-infractor-layout',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './infractor-layout.component.html',
  styleUrls: ['./infractor-layout.component.scss']
})
export class InfractorLayoutComponent {

  logout() {
    localStorage.removeItem('user');
    window.location.href = '/auth/login';
  }
}
