import { Routes } from '@angular/router';
import { AdminLayoutComponent } from './layout/admin-layout.component';

// Pages
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { UsuariosComponent } from './pages/usuarios/usuarios.component';
import { MultasComponent } from './pages/multas/multas.component';
import { ActividadesComponent } from './pages/actividades/actividades.component';
import { RedencionesComponent } from './pages/redenciones/redenciones.component';

export const ADMIN_ROUTES: Routes = [
  {
    path: '',
    component: AdminLayoutComponent,
    children: [
      { path: 'dashboard', component: DashboardComponent },
      { path: 'usuarios', component: UsuariosComponent },
      { path: 'multas', component: MultasComponent },
      { path: 'actividades', component: ActividadesComponent },
      { path: 'redenciones', component: RedencionesComponent },

      // ruta por defecto
      { path: '', redirectTo: 'dashboard', pathMatch: 'full' }
    ]
  }
];
