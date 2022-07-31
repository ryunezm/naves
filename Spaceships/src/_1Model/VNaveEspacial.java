package _1Model;

/**
 *
 * @author ryunezm
 */
public abstract class VNaveEspacial implements Vehiculo {
    private String nombre;
    private int anoCreacion;
    private String AgenciaPart;
    private boolean estaActivo;
    private int anoRetiro;
    private double peso;
    private String combustible;
    private String mision;

    //Constructor vacío
    public VNaveEspacial() {}

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
     * @param mision
     */
    public VNaveEspacial(String nombre, int anoCreacion, String AgenciaPart,
            boolean estaActivo, int anoRetiro, double peso, String combustible, String mision) {
        this.nombre = nombre;
        this.anoCreacion = anoCreacion;
        this.AgenciaPart = AgenciaPart;
        this.estaActivo = estaActivo;
        this.anoRetiro = anoRetiro;
        this.peso = peso;
        this.combustible = combustible;
        this.mision = mision;
    }


    
    //Getters y Setters
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getAnoCreacion() {return anoCreacion;}
    public void setAnoCreacion(int anoCreacion) {this.anoCreacion = anoCreacion;}
    public String getAgenciaPart() {return AgenciaPart;}
    public void setAgenciaPart(String AgenciaPart) {this.AgenciaPart = AgenciaPart;}
    public boolean isEstaActivo() {return estaActivo;}
    public void setEstaActivo(boolean estaActivo) {this.estaActivo = estaActivo;}
    public int getAnoRetiro() {return anoRetiro;}
    public void setAnoRetiro(int anoRetiro) {this.anoRetiro = anoRetiro;}
    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}
    public String getCombustible() {return combustible;}
    public void setCombustible(String combustible) {this.combustible = combustible;}
    public String getMision() {return mision;}
    public void setMision(String mision) {this.mision = mision;}
    
    //Métodos
    @Override
    public void volverALaTierra(){
        System.out.println("No sé si pueda.");
    }
    
}
