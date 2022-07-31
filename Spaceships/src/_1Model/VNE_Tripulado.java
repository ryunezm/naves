package _1Model;

/**
 *
 * @author ryunezm
 */
public class VNE_Tripulado extends VNaveEspacial{
    private int capacidadPersonas;

    //Constructor vacío
    public VNE_Tripulado() {}

    //Constructor
    /**
     *
     * @param nombre
     * @param anoCreacion
     * @param AgenciaPart
     * @param estaActivo
     * @param anoRetiro
     * @param peso
     * @param combustible
     * @param capacidadPersonas
     * @param mision
     */
    public VNE_Tripulado(String nombre, int anoCreacion, String AgenciaPart,
                    boolean estaActivo, int anoRetiro, double peso,
                    String combustible, int capacidadPersonas, String mision) {
        super(nombre, anoCreacion, AgenciaPart, estaActivo, anoRetiro, peso, combustible, mision);
        this.capacidadPersonas = capacidadPersonas;
    }

    //Getters y Setters
    public int getCapacidadPersonas() {return capacidadPersonas;}
    public void setCapacidadPersonas(int capacidadPersonas) {this.capacidadPersonas = capacidadPersonas;}
    
    @Override
    public void volverALaTierra(){
        System.out.println("Me demoro un rato, pero vuelvo, así que tranquilo");
    }
    
}
