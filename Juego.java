package Tp1;

import java.time.LocalDate;
import java.time.Duration;
import java.time.LocalDateTime;

public class Juego {
    public static void main(String[] args) {
        // Guardamos la hora de inicio
        LocalDateTime inicio = LocalDateTime.now();

        // Menú
        Menu menu = new Menu();
        menu.mostrarMenu();
        String nombreJugador = menu.nombreJugador;

        // Crear tablero y jugador
        Tablero tablero = new Tablero(10, 10);
        Jugador jugador = new Jugador(menu.nombreJugador, 100, tablero.getCentroX(), tablero.getCentroY());

        // Control de movimiento
        ControlJugadores controlJugadores = new ControlJugadores();
        controlJugadores.iniciarJugador(jugador, tablero);

        // Crear enemigo
        ControlEnemigos controlEnemigos = new ControlEnemigos();
        Enemigo[] enemigos= controlEnemigos.generarEnemigos(3, tablero.filas, tablero.columnas, jugador);

        // Combate
        Combate combate = new Combate();

        boolean jugando = true;
        while (jugando) {
            tablero.actualizar(jugador, enemigos);
            tablero.imprimir(jugador, enemigos);

            controlJugadores.moverJugador(jugador, tablero);
            jugador.recuperacionDeVida();
            jugador.mostrarInfo();

            // Revisar si jugador cayó sobre un enemigo
            for (int i = 0; i < enemigos.length; i++) {
                if (enemigos[i].vida > 0 && jugador.posX == enemigos[i].posX && jugador.posY == enemigos[i].posY) {
                    combate.iniciarCombate(jugador, enemigos[i]);
                }
            }

            // Verificar derrota
            if (jugador.vida <= 0) {
                System.out.println("Perdiste!");
                jugando = false;
            }

            // Verificar vidtoria
            boolean enemigosVivos = false;
            for (Enemigo e : enemigos) {
                if (e.vida > 0) {
                    enemigosVivos = true;
                }
            }
            if (!enemigosVivos) {
                System.out.println("Ganaste!");
                jugando = false;
            }
        }

        // Guardamos la hora en la que finalizo la partida
        LocalDateTime fin = LocalDateTime.now();

        Duration duracion = Duration.between(inicio, fin);
        long segundos = duracion.getSeconds();

        System.out.println("El tiempo total de partida fueron: " + segundos + " segundos.");
    }
}
