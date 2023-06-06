import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int num = input.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println( num + " es multiplo de tres y de cinco");
        } else {
            System.out.println(num + " no es multiplo de tres y de cinco.");
        }
    }
}





