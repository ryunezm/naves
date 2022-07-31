package _2View;

import _1Model.*;
import _3Controller.*;
import java.util.Scanner;

/**
 *
 * @author ryunezm
 */
public class VNE_NoTripulado_vw {
    
    //Función para pedir datos de nuevo Tripulado
    public static void nuevoNoTripulado(){
        
        VNE_NoTripulado notripulado = new VNE_NoTripulado();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("INGRESE DATOS DE LA NAVE NO TRIPUALADA: ");

        System.out.println("Nombre: ");
        notripulado.setNombre(entrada.nextLine());
        
        System.out.println("Año de creación: ");
        notripulado.setAnoCreacion(entrada.nextInt());
        entrada.nextLine();
        
        System.out.println("Agencias espaciales involucradas: ");
        notripulado.setAgenciaPart(entrada.nextLine());
        
        System.out.println("Activo (true/false): ");
        notripulado.setEstaActivo(entrada.nextBoolean());
        
        if (notripulado.isEstaActivo()==false){               
                System.out.println("Año de retiro: ");
                notripulado.setAnoRetiro(entrada.nextInt());
                entrada.nextLine();
        } else {
            notripulado.setAnoRetiro(3000);
        }
            
        System.out.println("Peso (kg): ");
        notripulado.setPeso(entrada.nextDouble());
        entrada.nextLine();
        
        System.out.println("Combustible: ");
        notripulado.setCombustible(entrada.nextLine());
        
        System.out.println("Empuje principal (kilogramos): ");
        notripulado.setEmpujePrincipal(entrada.nextDouble());
        
        System.out.println("Empuje secundario (kilogramos): ");
        notripulado.setEmpujeSecundario(entrada.nextDouble());
        
        System.out.println("Velocidad (km/s): ");
        notripulado.setVelocidad(entrada.nextDouble());
        entrada.nextLine();
        
        System.out.println("Misión: ");
        notripulado.setMision(entrada.nextLine());
        
        
        VNE_NoTripulado_ctrller.insertarDatos(
                notripulado.getNombre(),
                notripulado.getAnoCreacion(),
                notripulado.getAgenciaPart(),
                notripulado.isEstaActivo(),
                notripulado.getAnoRetiro(),
                notripulado.getPeso(),
                notripulado.getCombustible(), 
                notripulado.getEmpujePrincipal(), 
                notripulado.getEmpujeSecundario(),
                notripulado.getVelocidad(),
                notripulado.getMision());
    }
    
    //Función para buscar por nombre
    public static void buscarNoTripulado(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nombre de la nave no tripulada que busca: ");
        VNE_NoTripulado_ctrller.consultarNombre(entrada.nextLine());
    }
    
    //Función para mostrar todos los registros
    public static void mostrarTodos(){
        VNE_NoTripulado_ctrller.listarTodos();
    }
    
}
    
