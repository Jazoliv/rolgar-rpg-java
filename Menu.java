package Tp1;
import java.util.Scanner;

public class Menu {
    public String nombreJugador;

    // Muestras las instrucciones y solicita el ingreso del nombre del jugador
    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a Rolgar!!");
        System.out.println("Instrucciones: Utiliza W para moverte hacia arriba");
        System.out.println("S para moverte hacia abajo");
        System.out.println("A para moverte hacia la izquierda");
        System.out.println("D para moverte hacia la derecha.");
        System.out.println("Debes eliminar a tus 3 enemigos para ganar el juego.");
        System.out.print("Ingresa el nombre de tu personaje: ");
        nombreJugador = sc.nextLine();
    }
}
