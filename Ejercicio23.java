import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double millas;
        do {
            System.out.print("Digite las millas o 0 para salir: ");
            millas = input.nextDouble();
            double km = millas * 1.6093;
            if (millas > 0) {
                System.out.println(millas + " millas equivale a " + km + " kilómetros.");
            }
        } while (millas != 0);
    }
}