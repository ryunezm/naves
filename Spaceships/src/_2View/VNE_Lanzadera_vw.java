package _2View;

import _1Model.VNE_Lanzadera;
import _3Controller.VNE_Lanzadera_ctrller;
import java.util.Scanner;

/**
 *
 * @author ryunezm
 */
public class VNE_Lanzadera_vw {
    
   //Función para pedir datos de nueva lanzadera
    public static void nuevoLanzadera(){
        
        VNE_Lanzadera lanzadera = new VNE_Lanzadera();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("INGRESE DATOS DE LA LANZADERA: ");

        System.out.println("Nombre: ");
        lanzadera.setNombre(entrada.nextLine());
        
        System.out.println("Año de creación: ");
        lanzadera.setAnoCreacion(entrada.nextInt());
        entrada.nextLine();
        
        System.out.println("Agencias espaciales involucradas: ");
        lanzadera.setAgenciaPart(entrada.nextLine());
        
        System.out.println("Activo (true/false): ");
        lanzadera.setEstaActivo(entrada.nextBoolean());
        
        if (lanzadera.isEstaActivo()==false){               
                System.out.println("Año de retiro: ");
                lanzadera.setAnoRetiro(entrada.nextInt());
                entrada.nextLine();
        } else {
            lanzadera.setAnoRetiro(3000);
        }
            
        System.out.println("Peso: ");
        lanzadera.setPeso(entrada.nextDouble());
        entrada.nextLine();
        
        System.out.println("Combustible: ");
        lanzadera.setCombustible(entrada.nextLine());
        
        System.out.println("Empuje (kilogramos): ");
        lanzadera.setEmpuje(entrada.nextDouble());
        
        System.out.println("Capacidad de transporte: ");
        lanzadera.setCapacidadTransporte(entrada.nextDouble());
        
        System.out.println("Altura (metros): ");
        lanzadera.setAltura(entrada.nextDouble());
        
        System.out.println("Potencia (caballos de fuerza): ");
        lanzadera.setPotencia(entrada.nextDouble());
        entrada.nextLine();
        
        System.out.println("Misión: ");
        lanzadera.setMision(entrada.nextLine());
        
        
        VNE_Lanzadera_ctrller.insertarDatos(
                lanzadera.getNombre(),
                lanzadera.getAnoCreacion(),
                lanzadera.getAgenciaPart(),
                lanzadera.isEstaActivo(),
                lanzadera.getAnoRetiro(),
                lanzadera.getPeso(),
                lanzadera.getCombustible(), 
                lanzadera.getEmpuje(), 
                lanzadera.getCapacidadTransporte(), 
                lanzadera.getAltura(),
                lanzadera.getPotencia(),
                lanzadera.getMision());
    }
    
    //Función para buscar por nombre
    public static void buscarLanzadera(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nombre de la Lanzadera que busca: ");
        VNE_Lanzadera_ctrller.consultarNombre(entrada.nextLine());
    }
    //Función para mostrar todos los registros
    public static void mostrarTodos(){
        VNE_Lanzadera_ctrller.listarTodos();
    }
    
}
