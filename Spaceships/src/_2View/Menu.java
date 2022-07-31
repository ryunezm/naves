package _2View;

import java.util.Scanner;

/**
 *
 * @author ryunezm
 */
public class Menu {
    //private int opcion;
    //private Scanner entMenu = new Scanner(System.in);
    
    public static int pedirOpcion(){
        int opcion;
        Scanner entMenu = new Scanner(System.in);
        
        System.out.println("\n\tIngrese opción: ");
        opcion = entMenu.nextInt();
        
        return opcion;
    }
    
    public static String pedirDato(){
        String dato;
        Scanner entMenu = new Scanner(System.in);
    
        System.out.println("\n\tIngrese palabra:");
        dato = entMenu.nextLine();
        return dato;
    }
    
    //Menu principal
    public static void menuPrincipal(){
        System.out.println("\n\n\t\tBASE DE DATOS DE NAVES ESPACIALES");
        System.out.println("\t1. Mostrar naves registradas");
        System.out.println("\t2. Registrar naves");
        System.out.println("\t3. Consultar naves");
        System.out.println("\t4. Salir");
    }
    
    //Menu 1.
    public static void m1MostrarRegistroNE(){
        System.out.println("\n\n\tNAVES REGISTRADAS");
        System.out.println("\t1. Mostrar todas las naves registradas");
        System.out.println("\t2. Mostrar solo Lanzaderas");
        System.out.println("\t3. Mostrar solo no tripuladas");
        System.out.println("\t4. Mostrar solo tripulados");
        System.out.println("\t5. Mostrar solo estaciones espaciales");
        System.out.println("\t6. Regresar al menu principal");
    }
    
    //Menu 2.
    public static void m2RegistrarNE(){
        System.out.println("\n\n\tREGISTRO DE NAVES");
        System.out.println("\tIngrese el tipo tipo de nave desea registrar:");
        System.out.println("\t1. Lanzadera");
        System.out.println("\t2. No Tripulada");
        System.out.println("\t3. Tripulada");
        System.out.println("\t4. Estación espacial");
        System.out.println("\t5. Regresar al menu principal");
    }

    
    //Menu 3.
    public static void m3ConsultarNE(){
        System.out.println("CONSULTA DE NAVES");
        System.out.println("1. Consultar por nombre");
        System.out.println("2. Consultar avanzado");
        System.out.println("3. Regresar al menu principal");
    }
}
