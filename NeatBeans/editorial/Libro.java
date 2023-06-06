package ejercicio.editorial;

/**
 *
 * @author Eithel
 */
public class Libro extends Publicacion {
    private int numeroPaginas;
    public Libro(String titulo, double precio, int numeroPaginas) {
        super(titulo,precio);
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * @return the numeroPaginas
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    /**
     * @param numeroPaginas the numeroPaginas to set
     */
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
}
