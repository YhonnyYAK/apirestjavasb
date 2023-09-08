# API Rest con Spring Boot
Java 11 - War - MySQL 8.0 - By YhonnyYAK

---

### Rquisitos

- Java 11
- Maven 3.9.2
- MySQL 8.0.23
- Port: 8080 Disponible

### Instalación

Requiere instalar la base de datos en MySQL, el script de creación de Base de Datos puede encontrarlo en la siguiente ruta del repositorio:

```sh
https://github.com/YhonnyYAK/apirestjavasb/tree/master/script
```

### Uso

La API Rest esta expuesta en el Puerto: 8080, asi mismo, cuenta con Swagger UI 2.0.3.

```sh
http://localhost:8080/app/v1/customers
```

#### Lista de Cliente - Get
```sh
http://localhost:8080/app/v1/customers
```
#### Crearción de Cliente - Post
```sh
http://localhost:8080/app/v1/customers
```
#### Consultar de Cliente por DNI - Get
```sh
http://localhost:8080/app/v1/customers/dni/{valor}
```
#### Consultar de Cliente por Correo - Get
```sh
http://localhost:8080/app/v1/customers/email/{valor}
```

### Swagger UI 2.0.3.

La API Rest cuenta con Swagger UI 2.0.3.

```sh
http://localhost:8080/swagger-ui/index.html
```

### Colección de Postman

Puede usar la colleccion de postman.json, ubicado en la siguiente ruta del repositorio

```sh
https://github.com/YhonnyYAK/apirestjavasb/tree/master/postman
```
---
### Gracias


