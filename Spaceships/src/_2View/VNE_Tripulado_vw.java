package _2View;

import _1Model.*;
import _3Controller.VNE_Tripulado_ctrller;
import java.util.Scanner;

/**
 *
 * @author ryunezm
 */
public class VNE_Tripulado_vw {
    public static void nuevoTripulado(){
        
        VNE_Tripulado tripulado = new VNE_Tripulado();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("INGRESE DATOS DE LA NAVE NO TRIPUALADA: ");

        System.out.println("Nombre: ");
        tripulado.setNombre(entrada.nextLine());
        
        System.out.println("Año de creación: ");
        tripulado.setAnoCreacion(entrada.nextInt());
        entrada.nextLine();
        
        System.out.println("Agencias espaciales involucradas: ");
        tripulado.setAgenciaPart(entrada.nextLine());
        
        System.out.println("Activo (true/false): ");
        tripulado.setEstaActivo(entrada.nextBoolean());
        
        if (tripulado.isEstaActivo()==false){               
                System.out.println("Año de retiro: ");
                tripulado.setAnoRetiro(entrada.nextInt());
                entrada.nextLine();
        } else {
            tripulado.setAnoRetiro(3000);
        }
            
        System.out.println("Peso: ");
        tripulado.setPeso(entrada.nextDouble());
        entrada.nextLine();
        
        System.out.println("Combustible: ");
        tripulado.setCombustible(entrada.nextLine());
        
        System.out.println("Velocidad (km/s): ");
        tripulado.setCapacidadPersonas(entrada.nextInt());
        entrada.nextLine();
        
        System.out.println("Misión: ");
        tripulado.setMision(entrada.nextLine());
        
        
        VNE_Tripulado_ctrller.insertarDatos(
                tripulado.getNombre(),
                tripulado.getAnoCreacion(),
                tripulado.getAgenciaPart(),
                tripulado.isEstaActivo(),
                tripulado.getAnoRetiro(),
                tripulado.getPeso(),
                tripulado.getCombustible(),
                tripulado.getCapacidadPersonas(),
                tripulado.getMision());
    }
    
    //Función para buscar por nombre
    public static void buscarLanzadera(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nombre de la nave tripulada que busca: ");
        VNE_Tripulado_ctrller.consultarNombre(entrada.nextLine());
    }
    
    //Función para mostrar todos los registros
    public static void mostrarTodos(){
        VNE_Tripulado_ctrller.listarTodos();
    }
}
