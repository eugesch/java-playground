package mooc.part01;
import java.util.Scanner;

public class LecturaScanner {
    public static void main (String[] args){
        //Generar herramienta para leer entradas del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba un mensaje: ");

        String mensaje = scanner.nextLine();

        System.out.println(mensaje);
    }
}