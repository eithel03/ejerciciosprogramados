import java.util.Scanner;
public class EjercicioDos{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("ingrese un numero en celsius");
        int celsius = input.nextInt();
        double fahrenheit = (9.0/5)*celsius + 32;
        System.out.println("el resultado es:" + fahrenheit);
    }
}