# Práctica 02 - Clase Usuario y Programa Principal

## Objetivo
Implementar un programa en Java que modele un sistema básico de usuarios, aplicando principios de encapsulamiento, validación de datos y organización de proyectos en directorios.

## Descripción
Esta práctica consiste en crear una clase `Usuario` con atributos privados (nombre, correo y rol), constructores, métodos de acceso y modificación, así como un método `equals` para comparar usuarios.  
Además, se desarrolla una clase `Main` que permite al usuario ingresar sus datos por consola, seleccionar un rol válido (Empleado o Administrador), validar el correo electrónico y mostrar la información del objeto creado.

La práctica refuerza:
- Organización de proyectos en directorios (`src`, `modulos`).
- Uso de constructores y encapsulamiento.
- Validación de entradas por consola.
- Interacción básica con el usuario.

## Tecnologías utilizadas
- Java
- Eclipse IDE 

## Instrucciones de ejecución
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/KevinAlanTC/Practica02.git
   ```
2. Abrir el proyecto en tu IDE (IntelliJ IDEA, Android Studio, VS Code).

Verificar la estructura de directorios:
```
Proyecto/
├── src/
│   ├── Main.java
│   └── modulos/
│       └── Usuario.java
└── README.txt
```
3. Compilar el código:

```bash
javac src/modulos/Usuario.java src/Main.java
```
4. Ejecutar el programa:

```bash
java src/Main
```
Seguir las instrucciones en consola para ingresar nombre, correo y rol.
