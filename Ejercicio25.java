import java.util.Scanner;
public class Ejercicio25 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int num;

        do {
            
            System.out.print("Ingrese un numero (si desea salir ingrese un numero negativo): ");
            num = input.nextInt();

            if (num >= 0) {

                int cuadrado = num * num;

                System.out.println("El cuadrado de " + num + " es: " + cuadrado);
            }
        } while (num >= 0);
    }
}