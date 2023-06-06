import java.util.Scanner;
public class EjercicioDiez {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = input.nextInt();
        while(num1<=0){
            System.out.print("Numero incorrecto ingrese otro: ");
            num1 = input.nextInt();
        }
        System.out.print("Ingrese el segundo numero: ");
        int num2 = input.nextInt();
        while(num2<= 0){
            System.out.print("Numero incorrecto ingrese otro: ");
            num2= input.nextInt();
        }
        System.out.print("Ingrese el tercer numero: ");
        int num3 = input.nextInt();
        while(num3<=0){
            System.out.print("Numero incorrecto ingrese otro: ");
            num3= input.nextInt();
        }
    if (num1>num2 && num1>num3){
        if (num2>num3) {
            System.out.print("Asi quedan ordenados: " + num1+", " +num2+", " +num3);
        }else{
            System.out.print("Asi quedan ordenados: " + num1+", " +num3+", " +num2);
        }
    }else if (num2>num1 && num2>num3){
        if (num1>num3){
            System.out.print("Asi quedan ordenados: " + num2+", " +num1+", " +num3);    
        }else{
            System.out.print("Asi quedan ordenados: " + num2+", " +num3+", " +num1);
        }
    }else if (num3>num1 && num3>num2){
        if (num1 > num2)
            System.out.print("Asi quedan ordenados: " + num3+", " +num1+", " +num2);
        }else{
            System.out.print("Asi quedan ordenados: " + num3+", " +num2+", " +num1);
        }
    }
}

