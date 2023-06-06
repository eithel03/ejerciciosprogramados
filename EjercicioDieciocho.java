import java.util.Scanner;

public class EjercicioDieciocho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean num_negativo = false;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int num = input.nextInt();

            if (num < 0) {
                num_negativo = true;
            }
        }

        if (num_negativo) {
            System.out.println("Se han ingresado numeros negativos");
        } else {
            System.out.println("No se han ingresado numeros negativos");
        }
    }
}