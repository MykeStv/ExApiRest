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

- getUsuarios : Obtiene todos los usuarios--> [GET] localhost:8080/usuarios
- gerUsuarioById : Obtiene el usuario con el id especificado --> [GET] localhost:8080/usuarios/"id"
- saveUsuario : Guarda un usuario mediante --> [POST] localhost:8080/usuarios
- getUsuarioByPrioridad : Obtiene los usuarios según el número de prioridad --> [GET] localhost:8080/usuarios/query?prioridad="number"
- deleteUsuario : Elimina el usuario de la base de datos por id especificado --> [DELETE] localhost:8080/usuarios/"id"

### Mejoras

- Adicion del metodo getByName : permite obtener el usuario por el nombre ingresado --> [GET] localhost:8080/usuarios/name?nombre="name"
- Se agregó el atributo edad al Entity usuario.
- Se añadio el metodo getAgeOver18 : permite obtener los usuarios mayores o iguales a 18 años --> [GET] localhost:8080/usuarios/mayor-edad
- Se añadio el metodo getAgeDown18 : permite obtener los usuarios menores a 18 años --> [GET] localhost:8080/usuarios/menos-edad
