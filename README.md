_Maycol Steven Rincon_

# Api rest ejercicio - SofkaU

## Documentacion

path: localhost:8080/usuarios

Api que implementa los metodos CRUD en una base de datos en mySQL con una tabla usuarios.

### Packages

- Controllers
- Services
- Repositories
- Models

### Methods

- getUsuarios : Obtiene todos los usuarios--> [GET]  localhost:8080/usuarios
- gerUsuarioById : Obtiene el usuario con el id especificado --> [GET]  localhost:8080/usuarios/"id"
- saveUsuario : Guarda un usuario mediante --> [POST]  localhost:8080/usuarios
- getUsuarioByPrioridad : Obtiene los usuarios según el número de prioridad --> [GET]  localhost:8080/usuarios/query?prioridad="number"
- deleteUsuario : Elimina el usuario de la base de datos por id especificado --> [DELETE]  localhost:8080/usuarios/"id"
