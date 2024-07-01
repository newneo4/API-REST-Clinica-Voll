CREATE TABLE medicos (
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    documento VARCHAR(50) NOT NULL UNIQUE,
    especialidad VARCHAR(255) NOT NULL,
    calle VARCHAR(255) NOT NULL,
    distrito VARCHAR(255) NOT NULL,
    ciudad VARCHAR(255),
    numero VARCHAR(10),
    complemento VARCHAR(255)
);
