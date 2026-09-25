package Tp1;

public class Jugador {
    // Atributos del jugador
    String nombre;
    int vida;
    int posX;
    int posY;

    // Crea un jugador con un nombre, una vida inicial y una posicion inicial(aleatoria)
    public Jugador(String nombreJugador, int vidaInicial, int x, int y) {
        nombre = nombreJugador;
        vida = vidaInicial;
        posX = x;
        posY = y;
    }

    // Metodo para mostrar la informacion del jugador
    public void mostrarInfo() {
        System.out.println("---- Informacion del personaje! ----");
        System.out.println("El nombre del personaje es: " + nombre);
        System.out.println("La vida actual del personaje es: " + vida);
        System.out.println("La posicion del personaje es: (" + posX + ", " + posY + ")");
    }

    // Metodo para recuperar un porcentaje de vida en cada movimiento
    public void recuperacionDeVida() {
        int recuperacion = (vida * 7) / 100;
        vida = vida + recuperacion;

        if (vida > 100) {
            vida = 100;
        }
    }
}
