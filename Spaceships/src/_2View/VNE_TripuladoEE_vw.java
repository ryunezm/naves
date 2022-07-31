package _2View;

import _1Model.VNE_TripuladoEE;
import _3Controller.VNE_TripuladoEE_ctrller;
import java.util.Scanner;

/**
 *
 * @author ryunezm
 */
public class VNE_TripuladoEE_vw {
    public static void nuevoTripuladoEstacionEspacial(){
        VNE_TripuladoEE tripuladoEE = new VNE_TripuladoEE();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("INGRESE DATOS DE LA NAVE NO TRIPUALADA: ");

        System.out.println("Nombre: ");
        tripuladoEE.setNombre(entrada.nextLine());
        
        System.out.println("Año de creación: ");
        tripuladoEE.setAnoCreacion(entrada.nextInt());
        entrada.nextLine();
        
        System.out.println("Agencias espaciales involucradas: ");
        tripuladoEE.setAgenciaPart(entrada.nextLine());
        
        System.out.println("Activo (true/false): ");
        tripuladoEE.setEstaActivo(entrada.nextBoolean());
        
        if (tripuladoEE.isEstaActivo()==false){               
                System.out.println("Año de retiro: ");
                tripuladoEE.setAnoRetiro(entrada.nextInt());
                entrada.nextLine();
        } else {
            tripuladoEE.setAnoRetiro(3000);
        }
            
        System.out.println("Peso (kg): ");
        tripuladoEE.setPeso(entrada.nextDouble());
        entrada.nextLine();
        
        System.out.println("Combustible: ");
        tripuladoEE.setCombustible(entrada.nextLine());
        
        System.out.println("Capacidad de personas:: ");
        tripuladoEE.setCapacidadPersonas(entrada.nextInt());
        entrada.nextLine();
        
        System.out.println("Distancia orbital (km): ");
        tripuladoEE.setDistanciaOrbita(entrada.nextDouble());
        entrada.nextLine();
        
        System.out.println("Misión: ");
        tripuladoEE.setMision(entrada.nextLine());
        
        
        VNE_TripuladoEE_ctrller.insertarDatos(
                tripuladoEE.getNombre(),
                tripuladoEE.getAnoCreacion(),
                tripuladoEE.getAgenciaPart(),
                tripuladoEE.isEstaActivo(),
                tripuladoEE.getAnoRetiro(),
                tripuladoEE.getPeso(),
                tripuladoEE.getCombustible(),
                tripuladoEE.getCapacidadPersonas(),
                tripuladoEE.getDistanciaOrbita(),
                tripuladoEE.getMision());
    }
    
    //Función para buscar por nombre
    public static void buscarLanzadera(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nombre de la estación espacial que busca: ");
        VNE_TripuladoEE_ctrller.consultarNombre(entrada.nextLine());
    }
    
    //Función para mostrar todos los registros
    public static void mostrarTodos(){
        VNE_TripuladoEE_ctrller.listarTodos();
    }
}
