import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int num = input.nextInt();
        
        boolean adivino = false;
        
        while (!adivino) {
            System.out.print("Ingrese un número: ");
            int num2 = input.nextInt();
            
            if (num2 == num) {
                System.out.println("Lo adivinaste");
                adivino = true;
            } else if (num2 < num) {
                System.out.println("El número es mayor");
            } else {
                System.out.println("El número es menor");
            }
        }
    }
}