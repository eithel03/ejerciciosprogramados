import java.util.Scanner;
public class EjercicioDoce {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Ingrese el dia: ");
        int dia = input.nextInt();
        while(dia<=0 || dia>31){
            System.out.print("dia incorrecto,ingrese otro: ");
            dia = input.nextInt();
        }
        System.out.print("Ingrese el mes: ");
        int mes = input.nextInt();
        while(mes<=0 || mes>12){
            System.out.print("mes incorrecto, ingrese otro: ");
            mes = input.nextInt();
        }
        System.out.print("Ingrese el año: ");
        int year = input.nextInt();
        while(year<=0 || year>3000){
            System.out.print("Año incorrecto, ingrese otro: ");
            year = input.nextInt();
        }
        System.out.print("La fecha "+dia+"/"+mes+"/"+year+ " es correcta");
    }
}