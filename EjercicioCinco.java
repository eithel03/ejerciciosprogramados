import java.util.Scanner;
public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = input.nextInt();
        while(num<=0){
            System.out.print(" Ingerese un numero positivo: ");
            num = input.nextInt();
        }
        int factorial = calcularFactorial(num);
        System.out.println("El factorial de " + num + " es: " + factorial);
    }

    public static int calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}