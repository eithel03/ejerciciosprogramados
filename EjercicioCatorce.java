import java.util.Scanner;
  public class EjercicioCatorce {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int num;
        do {
            System.out.println("Digite un numero, si desea salir del programa digite 0");
            num = input.nextInt();
            if (num > 0)
            System.out.println("El numero ingresado es positivo");
            else if (num < 0){
                System.out.println("El numero ingresado es negativo");
            }

        } while (num != 0);
        System.out.println("Fin del programa");

    }
}
