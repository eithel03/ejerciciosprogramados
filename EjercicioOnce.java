import java.util.Scanner;

public class EjercicioOnce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite un numero entre 1 y 9999: ");
        int num = input.nextInt();
        
        while(num <= 0 || num > 9999) {
            System.out.print("El numero debe estar entre 1 y 9999: ");
            num = input.nextInt();
        }
        
        if (num >= 0 && num <= 9) {
            System.out.println("El numero es de un solo digito");
        }
        else if (num >= 10 && num <= 99) {
            System.out.println("El numero es de dos digitos");
        }
        else if (num >= 100 && num <= 999) {
            System.out.println("El numero es de tres digitos");
        }
        else {
            System.out.println("El numero es de cuatro digitos");
        }
    }
}

