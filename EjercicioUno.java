import java.util.Scanner;
public class EjercicioUno {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int valor= input.nextInt();
        if(valor%2==0){
            System.out.println("El numero es par: " + valor);
         }else{
            System.out.println("El numero es impar: " + valor);
        }
     }
}



