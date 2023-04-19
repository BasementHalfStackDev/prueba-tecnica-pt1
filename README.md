# Prueba Tecnica 1
Prueba Tecnica EX 1 realizada el 2023-04-19 en el BootCamp de T-Systems.

# API Spring

Se crea una API para una aplicación LFG donde los usuarios pueden crear e unirse a diferentes parties de videojuegos para poder chatear entre ellos, para ello se crean las siguientes entidades y endpoints.

- Games: Se guarda toda la información de los juegos. Endpoints para poder ver todos los juegos o buscar por id, crear, borrar y modificar los juegos actuales.

- Users: Se guarda información de nombre de usuario, contraseña, email, usuario de steam... Endpoints para listar/buscar por id, crear, borrar y modificar usuarios.

- Parties: Se guarda información referente las parties: El titulo, descripcion, juego y el usuario creador. Endpoints para listar todas, listar por id de juego, buscar por id de party, crear, borrar y modificar parties

- Messages: Se guarda información referente los mensajes: El texto en si, un timestamp de cuando se envió, usuario que lo envió y la party que pertenece. Endpoints para listar todos, listar por party id, buscar por id de mensaje, crear y borrar mensajes.

- Party_User: Se guardan las asignaciones de usuarios por party. Endpoints para listar todo, listar usuarios por party, parties por usuario, buscar por id de asignacion, crear y borrar asignacion.
