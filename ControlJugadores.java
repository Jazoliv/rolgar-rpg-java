package Tp1;
import java.util.Scanner;

// Maneja las acciones de los jugadores
public class ControlJugadores {

    // Coloca el jugador en el centro del tablero
    public void iniciarJugador(Jugador jugador, Tablero tablero) {
        jugador.posX = tablero.getCentroX();
        jugador.posY = tablero.getCentroY();
    }

    // Permite mover el jugador por el tablero segun la tecla ingresada
    public void moverJugador(Jugador jugador, Tablero tablero) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Movimiento A/W/S/D: ");
        String movimiento = sc.nextLine();

        // Modifica la ubicacacion del personaje segun la letra incresada
        if (movimiento.equals("w") || movimiento.equals("W")) { // Hacia arriba
            if (jugador.posX > 0) {
                jugador.posX = jugador.posX - 1;
            }
        } else if (movimiento.equals("s") || movimiento.equals("S")) { // Hacia abajo
            if (jugador.posX < tablero.filas - 1) {
                jugador.posX = jugador.posX + 1;
            }
        } else if (movimiento.equals("a") || movimiento.equals("A")) { // Hacia la izquierda
            if (jugador.posY > 0) {
                jugador.posY = jugador.posY - 1;
            }
        } else if (movimiento.equals("d") || movimiento.equals("D")) { // Hacia la derecha
            if (jugador.posY < tablero.columnas - 1) {
                jugador.posY = jugador.posY + 1;
            }
        } else {
            System.out.println("Movimiento invalido.");
        }
    }
}
