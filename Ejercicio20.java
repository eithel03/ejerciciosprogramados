import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = input.nextInt();

        int doble = num * 2;
        int triple = num * 3;

        System.out.println("El doble es: " + doble);
        System.out.println("El triple es: " + triple);
    }
}
