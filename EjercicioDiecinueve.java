import java.util.Scanner;
public class EjercicioDiecinueve {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Ingrese el primer numero: ");
        int num1 = input.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = input.nextInt();

        if (num1 < num2 || num1 > num2) {
            System.out.print("Los numeros son diferentes");
        } else {
                System.out.print("Los numeros son iguales");

            }




        }
    }

