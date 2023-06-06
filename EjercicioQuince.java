import java.util.Scanner;
public class EjercicioQuince {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int num;
        int suma = 0;
        do {
            System.out.println("Ingrese un numero, si desea salir del programa digite  y ver el resultado de la suma digite 0");
            num = input.nextInt();
            suma += num;

        } while (num != 0);
        System.out.println(" La suma total es: " + suma);


    }
}
