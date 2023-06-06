import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el año: ");
        int year = input.nextInt();
        while (year <=0) {
            System.out.print("Año incorrecto, ingrese otro: ");
             year = input.nextInt();
        }
        if (year % 4 ==0){
            System.out.print("El año es bisiesto: ");
        } else if (year % 100 !=0 || year %400 !=0){
            System.out.print("El año no es bisiesto: ");
        }
}
}