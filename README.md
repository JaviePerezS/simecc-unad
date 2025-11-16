# 📌 SIMECC – Backend (Spring Boot 3 + Java 17)

Este proyecto corresponde al **backend del sistema SIMECC**, una plataforma diseñada para gestionar usuarios, roles, actividades, cursos, multas, redenciones y certificados.  
Fue desarrollado con **Spring Boot 3**, **Java 17**, **JPA/Hibernate** y **H2 en memoria** para pruebas rápidas durante el desarrollo.

---

## 🚀 Tecnologías utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Web**
- **Spring Data JPA**
- **Spring Security** (configurado como `permitAll` en desarrollo)
- **H2 Database** (modo pruebas)
- **PostgreSQL** (modo producción)
- **Lombok**
- **Maven**

---

## 📂 Estructura del proyecto

backend/
├── controller/ # Controladores REST (CRUD)
├── entity/ # Entidades JPA
├── repository/ # Repositorios usando JpaRepository
├── service/ # Interfaces de servicio
├── service/impl/ # Implementaciones de servicio
├── config/ # Configuraciones (seguridad, CORS)
└── resources/
├── application.yml
├── static/
└── templates/

---

## 🗄 Base de datos

En fase de desarrollo se utiliza **H2 en memoria**.

**Consola H2:**  
`http://localhost:8080/h2-console`

**Datos de conexión:**

- **JDBC URL:** `jdbc:h2:mem:simeccdb`  
- **User:** `sa`  
- **Password:** *(vacío)*

Para entornos reales se usará **PostgreSQL** reemplazando la configuración en `application.yml`.

---

---

## 📡 Endpoints principales (CRUD)

| Módulo        | Endpoint base            |
|---------------|---------------------------|
| Usuarios      | `/api/usuarios`          |
| Roles         | `/api/roles`             |
| Actividades   | `/api/actividades`       |
| Cursos        | `/api/cursos`            |
| Multas        | `/api/multas`            |
| Redenciones   | `/api/redenciones`       |
| Certificados  | `/api/certificados`      |

Cada módulo incluye operaciones:

- `GET /` → listar  
- `GET /{id}` → obtener por ID  
- `POST /` → crear  
- `PUT /{id}` → actualizar  
- `DELETE /{id}` → eliminar  

---

## 🛡 Seguridad

El backend incluye **Spring Security**, pero para desarrollo está configurado como permitAll()
