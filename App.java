import java.util.Scanner;

/**
 * Una aplicacion Java muy sencilla
 * 
 * @author Miguel Bayon 
 * @version 0.1
 */
public class App
{
    /**
     * Metodo main
     */
    public static void main(String[] params)
    {
        System.out.println("Esta es una aplicacion Java muy sencilla!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre);
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Te quedan " + (100 - edad) + " años para cumplir 100!!");
        System.out.println("¿Eres un chico? (true/false)");
        boolean esChico = scanner.nextBoolean();
        if (esChico) {
            System.out.println("Hola, me encanta hablar con un chico!");
        }
        else 
        {
            System.out.println("Hola, me apasiona charlar con una chica!");
        }
            
    }
}
