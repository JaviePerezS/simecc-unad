import { AUTH_ROUTES } from './auth/auth.routes';

export const routes: Routes = [
  {
    path: '',
    redirectTo: 'auth/login',
    pathMatch: 'full'
  },
  {
    path: 'auth',
    children: AUTH_ROUTES
  }
];
