import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese los números del 100 al 0 de 7 en 7:");

        for (int i = 100; i >= 0; i -= 7) {
            System.out.print(i + " ");
            input.nextLine(); // Espera a que el usuario presione Enter
        }
    }
}