import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs'; 

@Injectable({ providedIn: 'root' })
export class ApiService {

  private base = 'http://localhost:8080/api';

  constructor(private http: HttpClient) {}

  get<T = any>(url: string): Observable<T> {
    return this.http.get<T>(`${this.base}/${url}`);
  }

  post(url: string, body: any) {
    return this.http.post(`${this.base}/${url}`, body);
  }

  put(url: string, body: any) {
    return this.http.put(`${this.base}/${url}`, body);
  }

  delete(url: string) {
    return this.http.delete(`${this.base}/${url}`);
  }
}