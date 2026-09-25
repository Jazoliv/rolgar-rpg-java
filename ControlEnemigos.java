package Tp1;
import java.util.Random;

// Se encarga de generar enemigos en posiciones aleatorias
public class ControlEnemigos {

    // Genera una cantidad especifica de enemigos colocados en el tablero de forma aleatoria
    public Enemigo[] generarEnemigos(int cantidad, int filas, int columnas, Jugador jugador) {
        Random random = new Random();
        Enemigo[] enemigos = new Enemigo[cantidad];

        for (int i = 0; i < cantidad; i++) {
            int x, y;
            do {
                x = random.nextInt(filas);
                y = random.nextInt(columnas);
            } while (x == jugador.posX && y == jugador.posY);

            enemigos[i] = new Enemigo("Enemigo" + (i + 1), 75, x, y);
            enemigos[i].mostrarInfo();
        }
        return enemigos;
    }
}
