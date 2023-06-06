package ejercicio.editorial;

/**
 *
 * @author Eithel
 */
public class CD extends Publicacion{
    private double tiempoReproduccion;
    public CD(String titulo, double precio, double tiempoReproduccion){
        super(titulo, precio);
        this.tiempoReproduccion = tiempoReproduccion;
    }

    /**
     * @return the tiempoReproduccion
     */
    public double getTiempoReproduccion() {
        return tiempoReproduccion;
    }

    /**
     * @param tiempoReproduccion the tiempoReproduccion to set
     */
    public void setTiempoReproduccion(double tiempoReproduccion) {
        this.tiempoReproduccion = tiempoReproduccion;
    }
    
}
