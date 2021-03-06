/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ESTADISTICA
 */
public class ConexionDB {

    private String DB_driver = "";
    private String url = "";
    private String db = "";
    private String host = "";
    private String username = "";
    private String password = "";
    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public ConexionDB() {
        DB_driver = "com.mysql.cj.jdbc.Driver";
        host = "localhost:3306";
        db = "c3s28grupo8";
        url = "jdbc:mysql://" + host + "/" + db;
        //username = "root"; // username BD CarlosBurgs
        //password = "admin"; // password BD CarlosBurgos
        username = "c3s28grupo8"; // username BD Servidor UIS
        password = "hW5ynlLf"; // password BD Servidor UIS

        try { // Asignacion del driver
            Class.forName(DB_driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        try { // Realizar conexion
            con = DriverManager.getConnection(url, username, password);
            con.setTransactionIsolation(8); // Hasta el nivel 8
            System.out.println("Conectado");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Connection getConnection() {
        try {
            con.setAutoCommit(true);
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void closeConnection(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean setAutoCommitDB(boolean param) {
        try {
            con.setAutoCommit(param);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean commitDB() {
        try {
            con.commit();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean rollbackDB() {
        try {
            con.rollback();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public ResultSet consultarTabla(String nombreTabla) {
        String query = "SELECT * FROM " + nombreTabla;
        System.out.println("ConexionDB_consultarTabla: "+ query);
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            System.out.println("ConexionDB_consultarTabla exception: "+ex.getMessage());
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (RuntimeException ex) {
            System.out.println("ConexionDB_consultarTabla exception: "+ex.getMessage());
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (Exception ex) {
            System.out.println("ConexionDB_consultarTabla exception: "+ex.getMessage());
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ResultSet consultarWhere(String nombreTabla, String condicion) {
        String query = "SELECT * FROM " + nombreTabla + " WHERE " + condicion;
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (RuntimeException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet consultarVista(String nombreTabla) {
        String query = "SELECT * FROM " + nombreTabla;
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (RuntimeException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int insertar(String nombreTabla, String[] columnas, String[] valores) {
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO ");
        query.append(nombreTabla);
        query.append(" (");
        for (int i = 0; i < columnas.length; i++) {
            query.append(columnas[i]);
            if (i < columnas.length - 1) {
                query.append(",");
            }
        }
        query.append(") VALUES (");
        for (int i = 0; i < valores.length; i++) {
            query.append("'");
            query.append(valores[i]);
            query.append("'");
            if (i < valores.length - 1) {
                query.append(",");
            }
        }
        query.append(")");
        System.out.println("ConexionDB_insertar: "+ query.toString());
        try {
            stmt = con.createStatement();
            int columnasAfectadas = stmt.executeUpdate(query.toString(),Statement.RETURN_GENERATED_KEYS);
            if (columnasAfectadas == 0){
                throw new SQLException("No se pudo guardar el registro");
            }
            ResultSet idsGenerados = stmt.getGeneratedKeys();
            if(idsGenerados.next()){
                return idsGenerados.getInt(1);
            }else{
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } catch (RuntimeException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public boolean actualizar(String nombreTabla, String[] valores, int id) {
        ArrayList<String> columnas = getColumns(nombreTabla);
        StringBuilder query = new StringBuilder("UPDATE ");
        query.append(nombreTabla);
        query.append(" SET ");
        for (int i = 0; i < valores.length; i++) {
            query.append(columnas.get(i));
            query.append(" = '");
            query.append(valores[i]);
            query.append("'");
            if (i < valores.length - 1) {
                query.append(", ");
            }
        }
        query.append(" WHERE id");
        query.append(nombreTabla);
        query.append(" = ");
        query.append(id);
        
        System.out.println("ConexionDB_actualizar: "+ query.toString());
        try {
            stmt = con.createStatement();
            return stmt.execute(query.toString());
        } catch (SQLException ex) {
            System.out.println("Error en ConexionDB.actualizar: " + ex.getMessage());
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (RuntimeException ex) {
            System.out.println("Error en ConexionDB.actualizar: " + ex.getMessage());
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            System.out.println("Error en ConexionDB.actualizar: " + ex.getMessage());
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean borrar(String nombreTabla, int id) {
        StringBuilder query = new StringBuilder("DELETE FROM ");
        query.append(nombreTabla);
        query.append(" WHERE id");
        query.append(nombreTabla);
        query.append(" = ");
        query.append(id);
        System.out.println("ConexionDB_borrar: "+ query.toString());
        try {
            stmt = con.createStatement();
            return stmt.execute(query.toString());
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (RuntimeException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public ArrayList<String> getColumns(String nombreTabla){
        ArrayList<String> columnas = new ArrayList<>();
        switch(nombreTabla){
            case "usuario":
                 String [] u = {"idUsuario","usuario","clave","rolUsuario","nombres","email"};
                 columnas.addAll(Arrays.asList(u));
                 break;
            case "genero":
                 String [] g = {"idGenero","nombreGenero"};
                 columnas.addAll(Arrays.asList(g));
                 break;
            case "album":
                 String [] al = {"idAlbum","nombreAlbum","selloDisco","agnoAlbum"};
                 columnas.addAll(Arrays.asList(al));
                 break;
            case "canciones":
                 String [] ca = {"idCanciones","tituloCanciones","agnoCanciones","idArtistas","nombreArtistas","nacionalidadArtistas",
                 "idAlbum","nombreAlbum","selloDisco","agnoAlbum","idGenero","nombreGenero"};
                 columnas.addAll(Arrays.asList(ca));
                 break;
            case "artistas":
                 String [] ar = {"idArtistas","nombreArtistas","nacionalidadArtistas"};
                 columnas.addAll(Arrays.asList(ar));
                 break;
             
        }
        return  columnas;
    }
}
