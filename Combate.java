package Tp1;
import java.util.Scanner;
import java.util.Random;

// Maneja las peleas entre el jugador y el enemigo
public class Combate {

    public void iniciarCombate(Jugador jugador, Enemigo enemigo) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Aparecio " + enemigo.nombre);

        // El usuario elige el modo de combate
        while (jugador.vida > 0 && enemigo.vida > 0) {
            System.out.println("\nTurno del jugador: ");
            System.out.println("Elige un ataque: ");
            System.out.println("1. Ataque simple (daño medio con riesgo bajo)");
            System.out.println("2. Ataque fuerte (daño alto con riesgo alto");
            System.out.println("Opcion: ");

            String opcion = sc.nextLine();

            int danioJugador = 0;
            int danioEnemigo = 0;

            if (opcion.equals("1")) {
                // Daño aleatorio entre 5 y 15
                danioJugador = random.nextInt(11) + 5;
                // El enemigo responde con un daño aleatorio entre 1 y 8
                danioEnemigo = random.nextInt(8) + 1;
            } else if (opcion.equals("2")) {
                // Daño aleatorio entre 10 y 25
                danioJugador = random.nextInt(16) + 10;
                // El enemigo responde con mas daño (5 a 15)
                danioEnemigo = random.nextInt(11) + 5;
            } else {
                System.out.println(("Opcion invalida, pierdes el turno."));
            }

            enemigo.vida = enemigo.vida - danioJugador;
            if (enemigo.vida < 0) {
                enemigo.vida = 0;
            }

            jugador.vida = jugador.vida - danioEnemigo;
            if (jugador.vida < 0) {
                jugador.vida = 0;
            }

            // Mostrar estado
            System.out.println("\n>> " + jugador.nombre + " hizo " + danioJugador + "de daño.");
            System.out.println(">> " + enemigo.nombre + " hizo " + danioEnemigo + " de daño.");
            System.out.println("Vida de " + jugador.nombre + ": " + jugador.vida);
            System.out.println("Vida de " + enemigo.nombre + ": " + enemigo.vida);
        }

        // Resultado final
        if (jugador.vida <= 0) {
            System.out.println("\n" + jugador.nombre + " fue derrotado...");
        } else {
            System.out.println("\n" + jugador.nombre + " derroto a " + enemigo.nombre + "!");
        }
    }
}
