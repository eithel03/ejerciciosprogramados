import java.util.Scanner;
public class EjercicioNueve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = input.nextInt();

        //Condición
        if (num1 > num2 ) {
        System.out.print(num1 + " Es mayor a: " + num2);
        } else if (num2 > num1) {
            System.out.print(num2 + " Es mayor a: " + num1);

        } else {
            System.out.print( " Los numeros son iguales ");

        }
    }    
}
