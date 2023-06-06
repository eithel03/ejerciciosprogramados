import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 0;
        int num;

        do {
            System.out.print("Ingrese un número (si desea salir ingrese un número negativo): ");
            num = input.nextInt();
            
            if (num >= 0) {
                contador++;
            }
        } while (num >= 0);

        System.out.println("Se han introducido " + contador + " números");
    }
}