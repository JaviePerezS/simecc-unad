import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({ providedIn: 'root' })
export class ApiService {

  private base = 'http://localhost:8080/api';

  constructor(private http: HttpClient) {}

  get(url: string) {
    return this.http.get(`${this.base}/${url}`);
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
