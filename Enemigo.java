package Tp1;

public class Enemigo {
    // Atributos del enemigo
    String nombre;
    int vida;
    int posX;
    int posY;

    // Crea un enemigo con un nombre, una vida inicial y una posicion inicial(aleatoria)
    public Enemigo(String nombreEnemigo, int vidaInicial, int x, int y) {
        nombre = nombreEnemigo;
        vida = vidaInicial;
        posX = x;
        posY = y;
    }

    // Muestra la informacion del enemigo
    public void mostrarInfo() {
        System.out.println("---- Informacion del Enemigo! ----");
        System.out.println("El nombre del enemigo es: " + nombre);
        System.out.println("La vida actual del enemigo es: " + vida);
    }
}
