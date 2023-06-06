import java.util.Scanner;
public class EjercicioDiecisiete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de sueldos: ");
        int num = input.nextInt();

        int sueldoMax = 0;

        for (int i = 1; i <= num; i++) {
            System.out.print("Ingrese el sueldo " + i + ": ");
            int sueldo = input.nextInt();

            if (sueldo > sueldoMax) {
                sueldoMax = sueldo;
            }
        }

        System.out.println("El sueldo maximo es: " + sueldoMax);
    }
}