import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cant_salario = 10;
        double sum_salario = 0;
        int cont_mayor = 0;

        for (int i = 1; i <= cant_salario; i++) {
            System.out.print("Ingrese el salario número" + i + ": ");
            double salario = input.nextDouble();
            sum_salario += salario;
            
            if (salario > 10000) {
                cont_mayor++;
            }
        }

        System.out.println("La suma total de los salarios es de: " + sum_salario);
        System.out.println("Hay " + cont_mayor + " salarios mayores a 10.000 colones");
    }
}