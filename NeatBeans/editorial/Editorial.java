package ejercicio.editorial;

public class Editorial {

    public static void main(String[] args) {
       Libro libro1 = new Libro ("Señor de los anillos", 12500, 500);
       CD cd1 = new CD ("Michael", 54500,34);
       System.out.println (libro1.getTitulo());
       System.out.println (cd1.getPrecio());
    }
}
