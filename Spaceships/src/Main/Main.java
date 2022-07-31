package Main;

import _2View.*;
import _3Controller.*;

/**
 *
 * @author ryunezm
 */
public class Main {
    public static void main(String[] args){
        
        //Conectar a la base de datos al inicio del programa
        SQLite.obtConexion();
        
        //Menu
        String dato;
        int opcionMP, opcion1, opcion2, opcion3;
        
        do {
            Menu.menuPrincipal();            
            opcionMP = Menu.pedirOpcion();
        
            switch (opcionMP) {
                case 1 -> {
                    do {
                        Menu.m1MostrarRegistroNE();
                        opcion1 = Menu.pedirOpcion();
                        
                        switch (opcion1) {
                            case 1 -> {
                                System.out.println("Nombre\tAño de creación\tPaises/Agencias\tActivo");
                                VNE_Lanzadera_vw.mostrarTodos();
                                VNE_NoTripulado_vw.mostrarTodos();
                                VNE_Tripulado_vw.mostrarTodos();
                                VNE_TripuladoEE_vw.mostrarTodos();
                            }
                            case 2 -> VNE_Lanzadera_vw.mostrarTodos();
                            case 3 -> VNE_NoTripulado_vw.mostrarTodos();
                            case 4 -> VNE_Tripulado_vw.mostrarTodos();
                            case 5 -> VNE_TripuladoEE_vw.mostrarTodos();
                            case 6 -> {}
                            default -> {
                                System.out.println("Digite una opción válida, por favor");
                                //throw new AssertionError();
                            }
                        }
                    }while (opcion1!=6);    
                }
                
                case 2 -> {
                    do {
                        Menu.m2RegistrarNE();
                        opcion2 = Menu.pedirOpcion();
                    
                        switch (opcion2) {
                            case 1 -> VNE_Lanzadera_vw.nuevoLanzadera();
                            case 2 -> VNE_NoTripulado_vw.nuevoNoTripulado();
                            case 3 -> VNE_Tripulado_vw.nuevoTripulado();
                            case 4 -> VNE_TripuladoEE_vw.nuevoTripuladoEstacionEspacial();
                            case 5 -> {}
                            default -> {
                                System.out.println("Digite una opción válida, por favor");
                                //throw new AssertionError();
                            }
                        }
                    } while (opcion2!=5);
                }
                
                case 3 -> {
                    do {
                        Menu.m3ConsultarNE();
                        opcion3 = Menu.pedirOpcion();
                        
                        switch (opcion3) {
                            case 1 -> {
                                System.out.println("Consulta por nombre");
                                dato = Menu.pedirDato();
                                VNE_Lanzadera_ctrller.consultarNombre(dato);
                                VNE_NoTripulado_ctrller.consultarNombre(dato);
                                VNE_Tripulado_ctrller.consultarNombre(dato);
                                VNE_TripuladoEE_ctrller.consultarNombre(dato);
                            }
                            case 2 -> {
                                System.out.println("Consulta avanzada. Escriba lo que quiera buscar: ");
                                dato = Menu.pedirDato();
                                VNE_Lanzadera_ctrller.consultaAvanzada(dato);
                                VNE_NoTripulado_ctrller.consultaAvanzada(dato);
                                VNE_Tripulado_ctrller.consultaAvanzada(dato);
                                VNE_TripuladoEE_ctrller.consultaAvanzada(dato);
                            }
                            case 3 -> {}
                            default -> {
                                System.out.println("Digite una opción válida, por favor");
                                //throw new AssertionError();
                            }
                        }
                    } while (opcion3!=3);
                }
                
                case 4 -> {}
                
                default -> {
                    System.out.println("¡Digite una opción válida, por favor!");
                    //throw new AssertionError();
                }
            }
        } while (opcionMP!=4);   
    }
}
