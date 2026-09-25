# Rolgar RPG — Juego de Consola en Java

Juego de rol interactivo por consola enfocado en la exploración de un tablero y combates por turnos. Desarrollado en Java como proyecto académico individual para la materia **Algoritmos y Estructuras de Datos** de la **Universidad de Buenos Aires (UBA)**.

## 🕹️ Características del Juego

* **Mapa y renderizado dinámico:** Grilla lógica de 10x10 en memoria con renderizado de visión 3x3 centrado en la posición actual del personaje.
* **Control de movimiento:** Desplazamiento interactivo por teclado (`W/A/S/D`) con lógica de límites del mapa y curación automática incremental por movimiento.
* **Sistema de combate por turnos:** Mecánica de combate con decisiones de riesgo/recompensa calculadas dinámicamente mediante eventos aleatorios.
* **Generación aleatoria de entidades:** Algoritmos para distribución de enemigos y prevención de superposición con el jugador.
* **Telemetría de partida:** Registro y cálculo en tiempo real de la duración de la sesión utilizando la API `java.time`.

## 🛠️ Tecnologías y Conceptos

* **Lenguaje:** Java 8+
* **Paradigma:** Programación Orientada a Objetos (POO), Modularización y Encapsulamiento
* **Conceptos:** Manejo de matrices bidimensionales (Grillas), Algoritmos de combate, Entrada/Salida por consola (`Scanner`), Manejo de eventos con `java.util.Random` y métricas de tiempo con `java.time`.

## 📁 Estructura del Código

* `Juego.java`: Bucle principal de control, condición de victoria/derrota y temporizador.
* `Tablero.java`: Matriz bidimensional y algoritmo de renderizado parcial 3x3.
* `Combate.java`: Mecánica de combate por turnos y cálculo de daño.
* `ControlJugadores.java` / `ControlEnemigos.java`: Controladores de lógica de movimiento y spawner aleatorio.
* `Jugador.java` / `Enemigo.java`: Modelado de clases y estadísticas de entidades.

## 🚀 Cómo ejecutarlo

1. Clonar el repositorio:
   ```bash
   git clone [https://github.com/Jazoliv/rolgar-rpg-java.git](https://github.com/Jazoliv/rolgar-rpg-java.git)
