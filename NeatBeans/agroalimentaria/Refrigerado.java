
package ejercicio.agroalimentaria;

public class Refrigerado extends Producto {
    private String codigoSupervision;
    public Refrigerado(String fechaCaducidad,int numeroLote, String fechaEnvasado, String paisOrigen,double temperatura,String codigoSupervision){
     super(fechaCaducidad,numeroLote,fechaEnvasado,paisOrigen,temperatura);
     this.codigoSupervision = codigoSupervision;
    }

    /**
     * @return the codigoSupervision
     */
    public String getCodigoSupervision() {
        return codigoSupervision;
    }

    /**
     * @param codigoSupervision the codigoSupervision to set
     */
    public void setCodigoSupervision(String codigoSupervision) {
        this.codigoSupervision = codigoSupervision;
    }
    
    
}
