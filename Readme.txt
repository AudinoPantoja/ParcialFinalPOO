**Gestión de Aeropuertos y Vuelos

Este proyecto es una aplicación de consola en Java que gestiona aeropuertos y vuelos utilizando 
Programación Orientada a Objetos (POO). Para el programa se toma la informacion dada en el arvhivo `vuelos.txt` y 
realiza diversas operaciones como mostrar la lista de vuelos de salida y llegada para cada aeropuerto.

## Estructura del Proyecto

El proyecto está organizado en varias clases:

1. Aeropuerto: Representa un aeropuerto con atributos como código, nombre, población, país y GMT.
2. Vuelos: Clase abstracta que representa un vuelo con atributos comunes a todos los vuelos.
3. Vuelo_regular: Extiende la clase `Vuelos` para representar un vuelo regular con un horario de salida.
4. Vuelo_charter: Extiende la clase `Vuelos` para representar un vuelo chárter con un cliente y fecha y hora de salida específicas.
5. Compania: Representa una compañía aérea con su nombre.
6. Main: Clase principal que crea listas de aeropuertos y vuelos, y muestra los vuelos de salida y llegada.
