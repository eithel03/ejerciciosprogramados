package ejercicio.editorial;

/**
 *
 * @author Eithel
 */
public class Publicacion {
    private String titulo;
    private double precio;
    
    public Publicacion (String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;        
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}

