import { Routes } from '@angular/router';

import { InfractorLayoutComponent } from './layout/infractor-layout.component';

import { HomeComponent } from './pages/home/home.component';
import { ActividadesComponent } from './pages/actividades/actividades.component';
import { MultasComponent } from './pages/multas/multas.component';
import { RedencionesComponent } from './pages/redenciones/redenciones.component';
import { CertificadosComponent } from './pages/certificados/certificados.component';
import { PerfilComponent } from './pages/perfil/perfil.component';

export const INFRACTOR_ROUTES: Routes = [
  {
    path: '',
    component: InfractorLayoutComponent,
    children: [
      { path: 'home', component: HomeComponent },
      { path: 'actividades', component: ActividadesComponent },
      { path: 'multas', component: MultasComponent },
      { path: 'redenciones', component: RedencionesComponent },
      { path: 'certificados', component: CertificadosComponent },
      { path: 'perfil', component: PerfilComponent },

      { path: '', redirectTo: 'home', pathMatch: 'full' }
    ]
  }
];
