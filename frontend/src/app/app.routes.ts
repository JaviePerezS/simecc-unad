import { Routes } from '@angular/router';

export const routes: Routes = [

  // AUTH
  {
    path: 'auth',
    loadChildren: () =>
      import('./auth/auth.routes').then(m => m.AUTH_ROUTES)
  },

  // ADMIN
  {
    path: 'admin',
    loadChildren: () =>
      import('./admin/admin.routes').then(m => m.ADMIN_ROUTES)
  },
  // INFRACTOR
  {
    path: 'infractor',
    loadChildren: () =>
      import('./infractor/infractor.routes').then(m => m.INFRACTOR_ROUTES)
  },

  // Redirect inicial
  { path: '', redirectTo: 'auth/login', pathMatch: 'full' },

  // 404
  { path: '**', redirectTo: 'auth/login' }
];
