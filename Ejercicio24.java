import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la hora: ");
        int hora = input.nextInt();
        while (hora <= 0 || hora > 24) {
            System.out.print("Hora incorrecta, ingrese otra: ");
            hora = input.nextInt();
        }

        System.out.print("Ingrese los minutos: ");
        int minutos = input.nextInt();
        while (minutos <= 0 || minutos >= 60) {
            System.out.print("Minutos incorrectos, ingrese otros: ");
            minutos = input.nextInt();
        }

        System.out.print("Ingrese los segundos: ");
        int segundos = input.nextInt();
        while (segundos <= 0 || segundos >= 60) {
            System.out.print("Segundos incorrectos, ingrese otros: ");
            segundos = input.nextInt();
        }

        System.out.println("La hora " + hora + ":" + minutos + ":" + segundos + " es correcta");
    }
}