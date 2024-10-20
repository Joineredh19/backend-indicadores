# API REST de Indicadores con Spring Boot

Este proyecto es una API REST desarrollada con Spring Boot para la gestión de indicadores. Proporciona operaciones CRUD (Crear, Leer, Actualizar y Eliminar) para la entidad indicadores.

## 🛠 Tecnologías Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Maven

## 📋 Prerequisitos

- Java JDK 17 o superior
- Maven 3.6.x o superior
- Tu IDE favorito (IntelliJ IDEA, Eclipse, VS Code)

## 🚀 Instalación y Configuración

1. Clona el repositorio:
```bash
https://github.com/Joineredh19/backend-indicadores.git
```

2. Navega al directorio del proyecto:
```bash
cd backend-indicadores
```

3. Compila el proyecto:
```bash
mvn clean install
```

4. Ejecuta la aplicación:
```bash
mvn spring-boot:run
```

## 📁 Estructura del Proyecto

```
src/
├── main/
│   ├── java/
│   │   └── com/equinorte/indicadores/
│   │       ├── controller/
│   │       │   └── IndicadoresController.java
│   │       ├── entities/
│   │       │   └── Indicador.java
│   │       ├── repositories/
│   │       │   └── IndicadoresRepository.java
│   │       ├── services/
│   │       │   └── IndicadoresService.java
│   │       └── IndicadoresApplication.java
│   └── resources/
│       └── application.properties
└── 
```

## 🔄 Endpoints de la API

### Producto Controller

| Método HTTP | Endpoint | Descripción |
|------------|----------|-------------|
| GET | `/indicadores` | Obtiene todos los indicadores |
| GET | `/indicadores/{id}` | Obtiene un producto por ID |
| POST | `/indicadores` | Crea un nuevo producto |
| PUT | `/indicadores/{id}` | Actualiza un producto existente |
| DELETE | `/indicadores/{id}` | Elimina un producto por ID |

### Ejemplos de Uso

#### Obtener todos los indicadores
```bash
GET http://localhost:8080/indicadores
```

#### Obtener producto por ID
```bash
GET http://localhost:8080/indicadores/1
```


## 🚦 Estado de los Códigos de Respuesta

| Código | Descripción |
|--------|-------------|
| 200 | Operación exitosa |
| 201 | Recurso creado exitosamente |
| 400 | Solicitud incorrecta |
| 404 | Recurso no encontrado |
| 500 | Error interno del servidor |
