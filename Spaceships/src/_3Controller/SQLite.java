package _3Controller;

import java.io.File;
import java.sql.*;

/**
 *
 * @author ryunezm
 */
public class SQLite {
    public static Connection conn = null;
    public static Statement stmt = null;
    public static ResultSet rs = null;
    public static PreparedStatement pstmt = null;
    public static String url = "jdbc:sqlite:C:/db/naves.db";
    //public static String sqlSTMT1 = "";
    //public static String sqlSTMT2 = "";
    
    //Crear base de datos y tablas si no existen
    public static void crearNuevaBD(){
        url = "jdbc:sqlite:C:/db/naves.db";
        String sqlSTMT1 = "CREATE TABLE IF NOT EXISTS Lanzadera ("
                + "Nombre TEXT NOT NULL PRIMARY KEY, "
                + "Fecha_de_creacion INT NOT NULL, "
                + "Agencias_espaciales TEXT NOT NULL, "
                + "Activo TEXT NOT NULL, "
                + "Fecha_de_retiro INT NOT NULL, "
                + "Peso REAL NOT NULL, "
                + "Combustible TEXT NOT NULL, "
                + "Empuje REAL NOT NULL, "
                + "Capacidad_de_Transporte REAL NOT NULL, "
                + "Altura REAL NOT NULL, "
                + "Potencia REAL NOT NULL, "
                + "Mision TEXT NOT NULL)";
        
        String sqlSTMT2 = "CREATE TABLE IF NOT EXISTS No_tripulado ("
                + "Nombre TEXT NOT NULL PRIMARY KEY, "
                + "Fecha_de_creacion INT NOT NULL, "
                + "Agencias_espaciales TEXT NOT NULL, "
                + "Activo TEXT NOT NULL, "
                + "Fecha_de_retiro INT NOT NULL, "
                + "Peso REAL NOT NULL, "
                + "Combustible TEXT NOT NULL, "
                + "Empuje_principal REAL NOT NULL, "
                + "Empuje_secundario REAL NOT NULL, "
                + "Velocidad REAL NOT NULL, "
                + "Mision TEXT NOT NULL)";
        
        String sqlSTMT3 = "CREATE TABLE IF NOT EXISTS Tripulado ("
                + "Nombre TEXT NOT NULL PRIMARY KEY, "
                + "Fecha_de_creacion INT NOT NULL, "
                + "Agencias_espaciales TEXT NOT NULL, "
                + "Activo TEXT NOT NULL, "
                + "Fecha_de_retiro INT NOT NULL, "
                + "Peso REAL NOT NULL, "
                + "Combustible TEXT NOT NULL, "
                + "Capacidad_de_personas TEXT NOT NULL, "
                + "Mision TEXT NOT NULL)";
        
        String sqlSTMT4 = "CREATE TABLE IF NOT EXISTS Estacion_Espacial ("
                + "Nombre TEXT NOT NULL PRIMARY KEY, "
                + "Fecha_de_creacion INT NOT NULL, "
                + "Agencias_espaciales TEXT NOT NULL, "
                + "Activo TEXT NOT NULL, "
                + "Fecha_de_retiro INT NOT NULL, "
                + "Peso REAL NOT NULL, "
                + "Combustible TEXT NOT NULL, "
                + "Capacidad_de_personas TEXT NOT NULL, "
                + "Distancia_de_orbita REAL NOT NULL, "
                + "Mision TEXT NOT NULL)";
        
        try {
            conn = DriverManager.getConnection(url);
            if(conn != null){
                //DatabaseMetaData meta = conn.getMetaData();
                //System.out.println("El controlador de la base de datos es "+meta);
                //System.out.println("Base de datos creada exitosamente.");
                
                try {
                    stmt = conn.createStatement();
                    stmt.execute(sqlSTMT1);
                    stmt.execute(sqlSTMT2);
                    stmt.execute(sqlSTMT3);
                    stmt.execute(sqlSTMT4);
                } catch (SQLException e) {
                    System.out.println("Error al crear las tablas. Log:\n"+e);
                }
            }
        } catch (SQLException e) {
            System.out.println("No se pudo crear la base de datos. Log:\n"+e);
        }
        
    }
    
    //Comprobar la existencia de la base de datos
    public static boolean existeBD(String rutaArchivo){
        File archivoDB = new File(rutaArchivo);
        return archivoDB.exists();   
    }
    
    //Crear conexión a la base de datos
    public static Connection obtConexion(){
        url = "jdbc:sqlite:C:/db/naves.db";
        conn = null;
        
        if(existeBD(url)){
            try {
                conn = DriverManager.getConnection(url);
                //System.out.println("Conexión exitosa");
            } catch (SQLException e) {
                System.out.println("No se ha podido conectar a la base de datos. Log: "+e);
            }
        } else {
            crearNuevaBD();
            try {
                conn = DriverManager.getConnection(url);
                //System.out.println("Conexión exitosa");
            } catch (SQLException e) {
                System.out.println("No se ha podido conectar a la base de datos. Log: "+e);
            }
        }
        
        return conn;
    }
    
    //Cerrar la conexión a la base de datos
    public static void cerrarConexion(){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("La conexión no se pudo cerrar. Log: "+e);
            }
        }
    }
}
