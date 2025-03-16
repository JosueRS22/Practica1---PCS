# Practica1---PCS

## Se aplicaron las siguientes técnicas de refactorización:
- Inline Class:
Se valoró que la interfaz implementada no contaba con grandes responsabilidades y/o acciones, por lo cual las funcionalidades las implementará la clase superior.
- Remove Middle Man:
La clase main es obligada a llamar directamente a la clase ConsoleBasedFizzBuzz, evitando delegaciones innecesarias.
- Pull Up Field:
El método implementado en la interfaz FizzBuzz contaba con los mismos parametros que la clase superior. Por lo cual se optó por eliminarlo.
- Collapse Hierarchy:
La interfaz era prácticamente igual, por lo tanto innecesaria. Se decidió fusionarlas.
