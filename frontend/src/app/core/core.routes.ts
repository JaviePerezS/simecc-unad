import { Routes } from '@angular/router';
import { AdminLayoutComponent } from './layouts/admin-layout/admin-layout.component';
import { AuthLayoutComponent } from './layouts/auth-layout/auth-layout.component';

export const coreRoutes: Routes = [
  {
    path: '',
    component: AuthLayoutComponent,
    children: [
      {
        path: '',
        loadChildren: () => import('../auth/auth.routes')
          .then(m => m.AUTH_ROUTES) // CORREGIDO (Ya lo habíamos hecho)
      }
    ]
  },
  {
    path: 'admin',
    component: AdminLayoutComponent,
    children: [
      {
        path: '',
        loadChildren: () => import('../admin/admin.routes')
          // CORRECCIÓN FINAL: Se cambia 'adminRoutes' a 'ADMIN_ROUTES' para coincidir con la exportación
          .then(m => m.ADMIN_ROUTES) 
      }
    ]
  }
];