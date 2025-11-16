---------------------------------------------------------
-- TABLA: ROLES
---------------------------------------------------------
CREATE TABLE t_simecc_co_rol (
    id_rol SERIAL PRIMARY KEY,
    nombre_rol VARCHAR(50) NOT NULL,
    descripcion VARCHAR(200)
);

---------------------------------------------------------
-- TABLA: USUARIOS
---------------------------------------------------------
CREATE TABLE t_simecc_co_usuario (
    id_usuario SERIAL PRIMARY KEY,
    nombre VARCHAR(80) NOT NULL,
    documento VARCHAR(20) NOT NULL,
    correo VARCHAR(100) NOT NULL UNIQUE,
    contraseña VARCHAR(200) NOT NULL,
    telefono VARCHAR(20),
    id_rol INT NOT NULL,
    estado BOOLEAN DEFAULT TRUE,

    CONSTRAINT fk_usuario_rol
        FOREIGN KEY (id_rol) REFERENCES t_simecc_co_rol(id_rol)
);

---------------------------------------------------------
-- TABLA: MULTA
---------------------------------------------------------
CREATE TABLE t_simecc_co_multa (
    id_multa SERIAL PRIMARY KEY,
    id_usuario INT NOT NULL,
    valor INT NOT NULL,
    fecha DATE NOT NULL,
    descripcion VARCHAR(200),

    CONSTRAINT fk_multa_usuario
        FOREIGN KEY (id_usuario)
            REFERENCES t_simecc_co_usuario(id_usuario)
);

---------------------------------------------------------
-- TABLA: ACTIVIDAD
---------------------------------------------------------
CREATE TABLE t_simecc_co_actividad (
    id_actividad SERIAL PRIMARY KEY,
    nombre_actividad VARCHAR(100) NOT NULL,
    puntos INT NOT NULL,
    tipo VARCHAR(50) NOT NULL
);

---------------------------------------------------------
-- TABLA: REDENCION
---------------------------------------------------------
CREATE TABLE t_simecc_co_redencion (
    id_redencion SERIAL PRIMARY KEY,
    id_usuario INT NOT NULL,
    id_actividad INT NOT NULL,
    fecha DATE NOT NULL,

    CONSTRAINT fk_redencion_usuario
        FOREIGN KEY (id_usuario)
            REFERENCES t_simecc_co_usuario(id_usuario),

    CONSTRAINT fk_redencion_actividad
        FOREIGN KEY (id_actividad)
            REFERENCES t_simecc_co_actividad(id_actividad)
);

---------------------------------------------------------
-- TABLA: CURSO
---------------------------------------------------------
CREATE TABLE t_simecc_co_curso (
    id_curso SERIAL PRIMARY KEY,
    nombre_curso VARCHAR(100) NOT NULL,
    horas INT NOT NULL,
    puntos_equivalentes INT NOT NULL,
    estado VARCHAR(20) DEFAULT 'activo'
);

---------------------------------------------------------
-- TABLA: CERTIFICADO
---------------------------------------------------------
CREATE TABLE t_simecc_co_certificado (
    id_certificado SERIAL PRIMARY KEY,
    id_usuario INT NOT NULL,
    id_redencion INT NOT NULL,
    fecha_emision DATE NOT NULL,
    url_certificado VARCHAR(200),

    CONSTRAINT fk_cert_usuario
        FOREIGN KEY (id_usuario)
            REFERENCES t_simecc_co_usuario(id_usuario),

    CONSTRAINT fk_cert_redencion
        FOREIGN KEY (id_redencion)
            REFERENCES t_simecc_co_redencion(id_redencion)
);
