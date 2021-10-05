/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import to.TOGenero;

/**
 *
 * @author Carlos
 */
public class DAOGenero {
    private final ConexionDB con = new ConexionDB();
    private String nombreTabla = "genero";
    private String [] columnas = {"idGenero","nombreGenero"};

    public DAOGenero() {
    }
    
    public int insertarGenero(TOGenero ToGenero){
        String [] valores = {String.valueOf(ToGenero.getIdGenero()),ToGenero.getNombreGenero()};
        return con.insertar(nombreTabla, columnas, valores);
    }
    
    public boolean actualizarGenero(TOGenero ToGenero){
        String [] valores = {String.valueOf(ToGenero.getIdGenero()),ToGenero.getNombreGenero()};
        return con.actualizar(nombreTabla, valores, ToGenero.getIdGenero());
    }
    
    public boolean eliminarGenero(TOGenero ToGenero){
        return con.borrar(nombreTabla,ToGenero.getIdGenero());
    }
    
    public ArrayList<TOGenero> listarGenero(){
        ArrayList<TOGenero> generos = new ArrayList<>();
        TOGenero genero;
        try {
            ResultSet rs = con.consultarTabla(nombreTabla);
            while(rs.next()){
                genero = new TOGenero();
                genero.setIdGenero(rs.getInt("idGenero"));
                genero.setNombreGenero(rs.getString("nombreGenero"));
                generos.add(genero);
            }
            return generos;
        } catch (SQLException ex) {
            Logger.getLogger(DAOGenero.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
