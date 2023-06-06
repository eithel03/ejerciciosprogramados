import java.util.Scanner;
public class EjercicioTres {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio");
        double radio = input.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;
        System.out.println ("El resultado de el area es: " + area);
        System.out.println ("El resultado de el perimetro es: " + perimetro);
    } 
}
