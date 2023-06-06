/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio.agroalimentaria;

/**
 *
 * @author Estudiante
 */
public class Agroalimentaria {

    public static void main(String[] args) {
        Fresco fresco1 = new Fresco("05/06/2023",23456,"23/03/2023","Costa Rica");
        Congelado congelado1 = new Congelado("05/06/2023",23456,"23/03/2023","Costa Rica",12.5);
        Refrigerado refrigerado1 = new Refrigerado("05/06/2023",23456,"23/03/2023","Costa Rica",12.5,"abc-123");
        System.out.println(fresco1.getFechaCaducidad());
        System.out.println(congelado1.getPaisOrigen());
        System.out.println(refrigerado1.toString());
        
    }
}
