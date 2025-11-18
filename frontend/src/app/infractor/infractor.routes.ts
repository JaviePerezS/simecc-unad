import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { ActividadesComponent } from './pages/actividades/actividades.component';
import { MultasComponent } from './pages/multas/multas.component';
import { RedencionesComponent } from './pages/redenciones/redenciones.component';
import { CertificadosComponent } from './pages/certificados/certificados.component';
import { PerfilComponent } from './pages/perfil/perfil.component';
import { AuthGuard } from '../core/guards/auth.guard';

export const infractorRoutes: Routes = [
  {
    path: '',
    canActivate: [AuthGuard],
    children: [
      { path: 'home', component: HomeComponent },
      { path: 'actividades', component: ActividadesComponent },
      { path: 'multas', component: MultasComponent },
      { path: 'redenciones', component: RedencionesComponent },
      { path: 'certificados', component: CertificadosComponent },
      { path: 'perfil', component: PerfilComponent },
      { path: '**', redirectTo: 'home' }
    ]
  }
];
