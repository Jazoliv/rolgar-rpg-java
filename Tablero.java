package Tp1;

// Representa a grilla la juego donde se mueve el jugador y los enemigos
public class Tablero {
    int filas;
    int columnas;
    char[][] grilla;

    // Crea un tablero de NxM
    public Tablero(int filasIngresadas, int columnasIngresadas) {
        filas = filasIngresadas;
        columnas = columnasIngresadas;

        grilla = new char[filas][columnas];
        limpiar();
    }

    // Llena las casillas vacias del tablero por '.'
    public void limpiar() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                grilla[i][j] = '.';
            }
        }
    }

    public int getCentroX() { return filas / 2; } // Retorna la posicion central en X
    public int getCentroY() { return columnas / 2; } // Retorna la posicion central en Y

    // Coloca a el jugador y a los enemigos en el tablero
    public void actualizar(Jugador jugador, Enemigo[] enemigos) {
        limpiar();
        grilla[jugador.posX][jugador.posY] = 'P';
        for (Enemigo e : enemigos) {
            if (e.vida > 0) {
                grilla[e.posX][e.posY] = 'E';
            }
        }
    }

    // Muestra solo una parte del tablero, no lo imprime completo
    public void imprimir(Jugador jugador, Enemigo[] enemigos) {
        int empezarX = jugador.posX - 1;
        int terminarX = jugador.posX + 1;
        int empezarY = jugador.posY - 1;
        int terminarY = jugador.posY + 1;

        for (int i = empezarX; i <= terminarX; i++) {
            for (int j = empezarY; j <= terminarY; j++) {
                char c = '.';

                if (i == jugador.posX && j == jugador.posY) {
                    c = 'P';
                } else {
                    for (Enemigo e : enemigos) {
                        if (e.vida > 0 && e.posX == i && e.posY == j) {
                            c = 'E';
                            break;
                        }
                    }
                }

                if (i >= 0 && i < filas && j >= 0 && j < columnas) {
                    System.out.print(c + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
