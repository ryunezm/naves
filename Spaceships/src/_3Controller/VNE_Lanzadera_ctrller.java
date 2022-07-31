package _3Controller;

import java.sql.*;

/**
 *
 * @author ryunezm
 */
public class VNE_Lanzadera_ctrller {
    
    //Insertar datos en la base de datos
    public static void insertarDatos(String nombre, int anoCreacion, String AgenciaPart,
                    boolean estaActivo, int anoRetiro, double peso,
                    String combustible, double empuje, double capacidadTransporte,
                    double altura, double potencia, String Mision){
        String sqlQuery = "INSERT INTO Lanzadera ("
                                                + "Nombre, "
                                                + "Fecha_de_creacion, "
                                                + "Agencias_espaciales,"
                                                + "Activo, "
                                                + "Fecha_de_retiro, "
                                                + "Peso, "
                                                + "Combustible, "
                                                + "Empuje, "
                                                + "Capacidad_de_Transporte, "
                                                + "Altura, "
                                                + "Potencia, "
                                                + "Mision"
                                                + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            Connection conn = SQLite.obtConexion();
            PreparedStatement ptst;
            ptst = conn.prepareStatement(sqlQuery);
            ptst.setString(1, nombre);
            ptst.setInt(2, anoCreacion);
            ptst.setString(3, AgenciaPart);
            ptst.setString(4, Boolean.toString(estaActivo));
            ptst.setInt(5, anoRetiro);
            ptst.setDouble(6, peso);
            ptst.setString(7, combustible);
            ptst.setDouble(8, empuje);
            ptst.setDouble(9, capacidadTransporte);
            ptst.setDouble(10, altura);
            ptst.setDouble(11, potencia);
            ptst.setString(12, Mision);
            ptst.executeUpdate();
            System.out.println("Los datos han sido guardados correctamente en la tabla Lanzadera de la base de datos");
            
        } catch (SQLException e) {
            System.out.println("Error al insertar datos en la tabla Lanzadera. Log: "+e);
        }
        
    };

    //Consultar por nombre
    public static void consultarNombre(String nombre){
        String sqlQuery = "SELECT * FROM Lanzadera WHERE Nombre = ? ";
        
        try {
            Connection conn = SQLite.obtConexion();
            PreparedStatement ptst;
            ResultSet rs;
            ptst = conn.prepareStatement(sqlQuery);
            ptst.setString(1, nombre);
            rs = ptst.executeQuery();
            
            while(rs.next()){
                System.out.println(rs.getString("Nombre")+"\t\t"+
                                   rs.getInt("Fecha_de_creacion")+"\t\t"+
                                   rs.getString("Agencias_espaciales")+"\t\t"+
                                   rs.getString("Activo"));
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta de datos. Log:"+e);
        }
    }
    
    public static void listarTodos(){
        String sqlQuery = "SELECT * FROM Lanzadera";
        
        try {
            Connection conn = SQLite.obtConexion();
            PreparedStatement ptst;
            ResultSet rs;
            ptst = conn.prepareStatement(sqlQuery);
            rs = ptst.executeQuery();
            
            while(rs.next()){
                System.out.println(rs.getString("Nombre")+"\t\t"+
                                   rs.getInt("Fecha_de_creacion")+"\t\t"+
                                   rs.getString("Agencias_espaciales")+"\t\t"+
                                   rs.getString("Activo"));
            }
            
        } catch (SQLException e) {
            System.out.println("Error en la consulta de datos. Log:"+e);
        }
    }
    
    //Buscar una parte de la palabra
    public static void consultaAvanzada(String cadena){
        String sqlQuery = "SELECT * FROM Lanzadera WHERE ((Nombre+Fecha_de_creacion+Agencias_espaciales+Activo+Fecha_de_retiro+Peso+Combustible+Empuje+Capacidad_de_Transporte+Altura+Potencia+Mision) LIKE ?)";
        
        try {
            Connection conn = SQLite.obtConexion();
            PreparedStatement ptst;
            ResultSet rs;
            ptst = conn.prepareStatement(sqlQuery);
            ptst.setString(1, "%"+cadena+"%");
            rs = ptst.executeQuery();
            
            while(rs.next()){
                System.out.println(rs.getString("Nombre")+"\t\t"+
                                   rs.getInt("Fecha_de_creacion")+"\t\t"+
                                   rs.getString("Agencias_espaciales")+"\t\t"+
                                   rs.getString("Activo"));
            }
            
        } catch (SQLException e) {
            System.out.println("Error en la consulta de datos. Log:"+e);
        }
    }
}