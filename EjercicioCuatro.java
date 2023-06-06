import java.util.Scanner;
public class EjercicioCuatro {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        int num1 = input.nextInt();

        while(num1<=0){
            System.out.print(" Ingerese un numero positivo");
            num1 = input.nextInt();
        }


        System.out.println("Digite el segundo numero: ");
        int num2 = input.nextInt();

        while(num2<=0){
            System.out.println(" Ingrese un numero positivo");
            num2 = input.nextInt();
        }

        //La suma
        int suma = num1 + num2; 
        System.out.println("El resultado de la suma es: " + suma);

        //La resta
        int resta = num1 - num2; 
        System.out.println("El resultado de la resta es: " + resta);

        //La resta
        int multiplicacion = num1 * num2; 
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);

        //La division
        if (num2 != 0) {
        int division = (int ) num1 / num2; 
        System.out.println("El resultado de la division es: " + division);
        } else {
        System.out.println ("No se puede dividir entre cero");

        }     
    }         
}
