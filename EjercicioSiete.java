import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = input.nextInt();

        if (num >= 0) {
            System.out.println("El numero ingresado es positivo.");
        } else if (num < 0) {
            System.out.println("El numero ingresado es negativo.");
        } 
    }
}
