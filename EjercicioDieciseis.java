import java.util.Scanner;

public class EjercicioDieciseis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int suma = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Ingrese un numero: " + i + ": ");
            int num = input.nextInt();
            suma += num;
        }

        System.out.println("El total de la suma es: " + suma);
    }
}