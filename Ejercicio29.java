import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = input.nextInt();
        System.out.println("Los números del 1 al " + num + " son:");

        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }


        
    }
}
