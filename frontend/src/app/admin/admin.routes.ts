import { Routes } from '@angular/router';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { UsuariosComponent } from './pages/usuarios/usuarios.component';
import { MultasComponent } from './pages/multas/multas.component';

// CORRECCIÓN: Se renombra a ADMIN_ROUTES (MAYÚSCULAS) para consistencia con AUTH_ROUTES.
export const ADMIN_ROUTES: Routes = [
  {
    path: '',
    children: [
      { path: 'dashboard', component: DashboardComponent },
      { path: 'usuarios', component: UsuariosComponent },
      { path: 'multas', component: MultasComponent },
      { path: '', redirectTo: 'dashboard', pathMatch: 'full' }
    ]
  }
];