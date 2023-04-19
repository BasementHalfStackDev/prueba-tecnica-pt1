# Prueba Tecnica 1
Prueba Tecnica EX 1 realizada el 2023-04-19 en el BootCamp de T-Systems.

# API Spring

Se crea una API para una aplicación LFG donde los usuarios pueden crear e unirse a diferentes parties de videojuegos para poder chatear entre ellos, para ello se crean las siguientes entidades y endpoints.

# Requisitos
La empresa quiere dar un impulso a la manera que tienen los trabajadores de relacionarse, permitiendo que contacten entre ellos creando grupos de interés. 

Una primera fase de este proyecto es crear una aplicación web LFG, que permita que los  empleados  puedan  contactar  con  otros  compañeros  para formar grupos para jugar a un videojuego, con el objetivo de poder compartir un rato de ocio afterwork. 

Los requisitos funcionales de la aplicación son los siguientes: 

- Los   usuarios  tienen  que  poder  crear  Partídas  (grupos)  para  un determinado videojuego.
- Los  usuarios  tienen  que  poder  buscar  Partídas  seleccionando  un videojuego
- Los usuarios pueden entrar y salir de una Party. 
- Los  usuarios  tienen  que  poder  enviar  mensajes  a  la  Party. Estos mensajes tienen que poder ser editados y borrados por su usuario creador. 
- Los mensajes que existan en una Party se tienen que visualizar como un chat común. 
- Los usuarios pueden introducir y modiﬁcar sus datos de perﬁl, por ejemplo, su usuario de Steam. 

## Games
Se guarda toda la información de los juegos. Endpoints para poder ver todos los juegos o buscar por id, crear, borrar y modificar los juegos actuales.
### Endpoints
**GET**

/api/games - Lista todos los juegos

/api/games/{id} - Muestra el juego con x id

**POST**

/api/games - Agrega juego con sus atributos

**PUT**

/api/games/{id} - Modifica juego con x id

**DELETE**

/api/games{id} - Elimina juego con x id

## Users
Se guarda información de nombre de usuario, contraseña, email, usuario de steam... Endpoints para listar/buscar por id, crear, borrar y modificar usuarios.
### Endpoints
**GET**

/api/users - Lista todos los usuarios

/api/users/{id} - Muestra el usuario con x id

**POST**

/api/users - Agrega usuario con sus atributos

**PUT**

/api/users/{id} - Modifica usuario con x id

**DELETE**

/api/users{id} - Elimina usuario con x id

## Parties
Se guarda información referente las parties: El titulo, descripcion, juego y el usuario creador. Endpoints para listar todas, listar por id de juego, buscar por id de party, crear, borrar y modificar parties
### Endpoints
**GET**

/api/parties - Lista todos los grupos

/api/parties/{id} - Muestra el grupo con x id

/api/parties/game/{gameId} - Lista todos los grupos dedicados a x juego por id

**POST**

/api/parties - Agrega grupo con sus atributos

**PUT**

/api/parties/{id} - Modifica grupo con x id

**DELETE**

/api/parties{id} - Elimina grupo con x id

## Messages
Se guarda información referente los mensajes: El texto en si, un timestamp de cuando se envió, usuario que lo envió y la party que pertenece. Endpoints para listar todos, listar por party id, buscar por id de mensaje, crear y borrar mensajes.
### Endpoints
**GET**

/api/messages - Lista todos los mensajes

/api/messages/{id} - Muestra el mensaje con x id

/api/messages/party/{partyId} - Lista todos los mensajes enviados a x grupo por id

**POST**

/api/messages - Agrega mensaje con sus atributos

**DELETE**

/api/messages{id} - Elimina mensaje con x id

## Party_User
Se guardan las asignaciones de usuarios por party. Endpoints para listar todo, listar usuarios por party, parties por usuario, buscar por id de asignacion, crear y borrar asignacion.
### Endpoints
**GET**

/api/party_members - Lista todas las asignaciones entre grupo y usuario

/api/party_members/{id} - Muestra la asignación por x id

/api/party_members/user/{userId} - Lista todos los grupos en los que participa el usuario con x id

/api/party_members/party/{partyId} - Lista todos los usuarios que participan en x grupo por id

**POST**

/api/party_members - Agrega asignacion de usuario a grupo

**DELETE**

/api/party_members/{id} - Elimina asignacion con x id
