package _1Model;

/**
 *
 * @author ryunezm
 */
public class VNE_TripuladoEE extends VNE_Tripulado{
    private double distanciaOrbita;

    //Constructor vacío
    public VNE_TripuladoEE() {}

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
     * @param distanciaOrbita
     * @param mision
     */
    public VNE_TripuladoEE(String nombre, int anoCreacion, String AgenciaPart,
                            boolean estaActivo, int anoRetiro, double peso,
                            String combustible, int capacidadPersonas, double distanciaOrbita, String mision) {
        super(nombre, anoCreacion, AgenciaPart, estaActivo, anoRetiro, peso, combustible, capacidadPersonas, mision);
        this.distanciaOrbita = distanciaOrbita;
    }

    
    //Getters y Setters
    public double getDistanciaOrbita() {return distanciaOrbita;}
    public void setDistanciaOrbita(double distanciaOrbita) {this.distanciaOrbita = distanciaOrbita;}
    
    @Override
    public void volverALaTierra(){
        System.out.println("Me toca quedarme en el espacio, pero cerca de ti.");
    }
}
