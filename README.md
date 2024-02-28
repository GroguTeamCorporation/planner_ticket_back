# TicketPlanner

## Descripción del proyecto

Este proyecto se centra en el desarrollo de una API REST en el backend utilizando Spring Boot, destinada a gestionar los eventos de la página web. La API incluye endpoints específicos para la manipulación de datos relacionados con usuarios y la gestión de incidencias asociadas.

Por otor lado, de frontend se utilizo VUE para crear la interfaz de usuario el cual interactua con el backend.


## Recursos

El proyecto esta creado con las siguientes tecnologías:

| Plugin               | URL                       |
| -------------------- | ------------------------- |
| Spring Web           | https://start.spring.io/  |
| Spring Data JPA      | https://start.spring.io/  |
| H2 Database          | https://start.spring.io/  |
| Spring BootDev Tools | https://start.spring.io/  |
| MySQL Drive          | https://start.spring.io/  |


## Instalación del proyecto

Clonar el repositorio

```sh
https://github.com/GroguTeamCorporation/planner_ticket_front
```

Iniciar backend

```sh
mvn spring-boot:run
```

## Uso en Postman

### endpoints Imagen

### POST Añadir Imagen 

```sh
http://localhost:8080/api/v1/images
```
Hay que insertar una imagen para esta petición.

```sh
Body / form-data:
KEY: file - File
Value: adjuntar img
```

#### GET Imagen

```sh
http://localhost:8080/api/v1/images
```

### Eventos


#### POST (crear Evento )

```sh
http://localhost:8080/api/v1/employee
```

Hay que insertar un JSON para esta petición.

```json
{
    "title": "Helloween",
    "description": "Evento Helloween lalalalalaa imagen con la ruta images / imagen agregado con foto??",
    "location": "Gijon",
    "capacity":  200,
    "date": "2024-02-20",
    "time": "22:00:00",
    "image": "images/HElloween.jpg"
}
```

#### GET (ver Evento)

```sh
GET http://localhost:8080/api/v1/events
```
#### GET (ver EventoID)

```sh
GET http://localhost:8080/api/v1/events/2
```

#### GET (Logout)

```sh
localhost:8080/api/v1/logout
```

#### GET (login)

```sh
localhost:8080/api/v1/login
```

#### POST (Crear usuario)
```sh
 http://localhost:8080/api/v1/users
```


## Modelo base de datos

![img.png](./frontend/src/assets/img/readme/DATA%20BASE%20MODEL.svg)
