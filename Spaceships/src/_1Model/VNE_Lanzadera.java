package _1Model;

/**
 *
 * @author ryunezm
 */
public class VNE_Lanzadera extends VNaveEspacial{
    private double empuje;
    private double capacidadTransporte;
    private double altura;
    private double potencia;

    //Constructor vacío
    public VNE_Lanzadera() {}

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
     * @param empuje
     * @param capacidadTransporte
     * @param altura
     * @param potencia
     * @param mision
     */
    public VNE_Lanzadera(String nombre, int anoCreacion, String AgenciaPart,
                    boolean estaActivo, int anoRetiro, double peso,
                    String combustible, double empuje, double capacidadTransporte,
                    double altura, double potencia, String mision) {
        
        super(nombre, anoCreacion, AgenciaPart, estaActivo, anoRetiro, peso, combustible, mision);
        this.empuje = empuje;
        this.capacidadTransporte = capacidadTransporte;
        this.altura = altura;
        this.potencia = potencia;
    }
  
    //Getters y Setters
    public double getEmpuje() {return empuje;}
    public void setEmpuje(double empuje) {this.empuje = empuje;}
    public double getCapacidadTransporte() {return capacidadTransporte;}
    public void setCapacidadTransporte(double capacidadTransporte) {this.capacidadTransporte = capacidadTransporte;}
    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}
    public double getPotencia() {return potencia;}
    public void setPotencia(double potencia) {this.potencia = potencia;}
    
    
    //Métodos
    @Override
    public void volverALaTierra(){
        System.out.println("Tenlo por seguro que no me quedaré en el espacio");
    }
}
