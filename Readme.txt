**Gestión de Aeropuertos y Vuelos

Este proyecto es una aplicación de consola en Java que gestiona aeropuertos y vuelos utilizando 
Programación Orientada a Objetos (POO). Para el programa se toma la informacion dada en el arvhivo `vuelos.txt` y 
realiza diversas operaciones como mostrar la lista de vuelos de salida y llegada para cada aeropuerto.

## Estructura del Proyecto

El proyecto está organizado en varias clases:

1. Aeropuerto: Representa un aeropuerto con atributos como código, nombre, población, país y GMT.
2. Vuelo: Representa un vuelo con atributos como tipo de vuelo (regular o charter), origen, destino, duración, aerolínea, tipo de avión, capacidad y horarios o información adicional.
3. Compania: Representa una compañía aérea con su nombre.
4. Vuelo_charter: Clase que hace la herencia de vuelo
5. Vuelo_regular: Clase que hace la herencia de vuelo
6. Main: Clase principal que carga los datos desde el archivo `vuelos.txt` y realiza las operaciones solicitadas.

