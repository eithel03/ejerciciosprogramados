
package ejercicio.agroalimentaria;

public class Producto {
    private String fechaCaducidad;
    private int numeroLote;
    private String fechaEnvasado;
    private String paisOrigen;
    private double temperatura;
    
    public Producto(String fechaCaducidad,int numeroLote, String fechaEnvasado, String paisOrigen,double temperatura){
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.paisOrigen = paisOrigen;
        this.temperatura = temperatura;
    }
    
    public Producto(String fechaCaducidad,int numeroLote, String fechaEnvasado, String paisOrigen){
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.paisOrigen = paisOrigen;
    }

    /**
     * @return the fechaCaducidad
     */
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * @param fechaCaducidad the fechaCaducidad to set
     */
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * @return the numeroLote
     */
    public int getNumeroLote() {
        return numeroLote;
    }

    /**
     * @param numeroLote the numeroLote to set
     */
    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    /**
     * @return the fechaEnvasado
     */
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    /**
     * @param fechaEnvasado the fechaEnvasado to set
     */
    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    /**
     * @return the paisOrigen
     */
    public String getPaisOrigen() {
        return paisOrigen;
    }

    /**
     * @param paisOrigen the paisOrigen to set
     */
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    /**
     * @return the temperatura
     */
    public double getTemperatura() {
        return temperatura;
    }

    /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
    



    
    
}
