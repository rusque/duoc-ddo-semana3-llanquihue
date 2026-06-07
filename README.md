# Sistema de Gestión de Personas - Llanquihue Tour

## 📋 Descripción del Proyecto
Este proyecto consiste en el diseño e implementación de un prototipo de software orientado a objetos para la agencia de turismo *Llanquihue Tour*, ubicada en la comuna de Llanquihue, Región de Los Lagos. El sistema resuelve la problemática de la gestión manual y desorganizada de la información de colaboradores mediante principios fundamentales de la Programación Orientada a Objetos (POO) como el encapsulamiento, la herencia y la composición.

## 🛠️ Tecnologías y Herramientas
* **Lenguaje:** Java (JDK 17 o superior)
* **IDE:** Visual Studio Code (VS Code)
* **Control de Versiones:** Git & GitHub

## 📁 Estructura del Proyecto
El proyecto se encuentra organizado modularmente en los siguientes paquetes y clases:
* **`package app;`**
  * `Main.java`: Clase principal que contiene el punto de entrada del programa, instancia los objetos de prueba y valida la funcionalidad en la consola.
* **`package model;`**
  * `Persona.java`: Clase base general que unifica los atributos comunes (Nombre, RUT) y contiene la relación de composición.
  * `Direccion.java`: Clase componente que representa los datos de ubicación y es utilizada por la clase Persona.
  * `GuiaTuristico.java`: Subclase especializada que hereda de Persona y añade el atributo específico de Especialidad.

## 🚀 Instrucciones de Compilación y Ejecución
Para ejecutar este proyecto de forma local utilizando la terminal, sigue estos pasos:
1. **Clonar el repositorio:**
   ```bash
   git clone <https://github.com/rusque/duoc-ddo-semana3-llanquihue.git>
