package _1Model;

/**
 *
 * @author ryunezm
 */
public class VNE_NoTripulado extends VNaveEspacial{
    private double empujePrincipal;
    private double empujeSecundario;
    private double velocidad;

    //Constructor vacío
    public VNE_NoTripulado() {}

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
     * @param empujePrincipal
     * @param empujeSecundario
     * @param velocidad
     * @param mision
     */
    public VNE_NoTripulado(String nombre, int anoCreacion, String AgenciaPart,
                        boolean estaActivo, int anoRetiro, double peso,
                        String combustible, double empujePrincipal,
                        double empujeSecundario, double velocidad, String mision) {
        super(nombre, anoCreacion, AgenciaPart, estaActivo, anoRetiro, peso, combustible, mision);
        this.empujePrincipal = empujePrincipal;
        this.empujeSecundario = empujeSecundario;
        this.velocidad = velocidad;
    }

    
    //Getters y Setters
    public double getEmpujePrincipal() {return empujePrincipal;}
    public void setEmpujePrincipal(double empujePrincipal) {this.empujePrincipal = empujePrincipal;}
    public double getEmpujeSecundario() {return empujeSecundario;}
    public void setEmpujeSecundario(double empujeSecundario) {this.empujeSecundario = empujeSecundario;}
    public double getVelocidad() {return velocidad;}
    public void setVelocidad(double velocidad) {this.velocidad = velocidad;}
    
    @Override
    public void volverALaTierra(){
        System.out.println("Lo siento, no volveré, mi destino está allá afuera");
    }
}
