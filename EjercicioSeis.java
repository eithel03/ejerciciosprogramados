import java.util.Scanner;
public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            int multiplicacion = num * i;
            System.out.println(num + " x " + i + " = " + multiplicacion);
        }
    }
}