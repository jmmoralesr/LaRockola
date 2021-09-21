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
import to.TOUsuario;

/**
 *
 * @author Carlos
 */
public class DAOUsuario {
    private final ConexionDB con = new ConexionDB();
    private String nombreTabla = "usuario";
    private String [] columnas = {"idUsuario","usuario","clave","rolUsuario","nombres","email"};

    public DAOUsuario() {
    }
    
    public int insertarUsuario(TOUsuario ToUsuario){
        String [] valores = {String.valueOf(ToUsuario.getIdUsuario()),ToUsuario.getUsuario(),ToUsuario.getClave(), ToUsuario.getRolUsuario(),ToUsuario.getNombres(),ToUsuario.getEmail()};
        return con.insertar(nombreTabla, columnas, valores);
    }
    
    public boolean actualizarUsuario(TOUsuario ToUsuario){
        String [] valores = {String.valueOf(ToUsuario.getIdUsuario()),ToUsuario.getUsuario(),ToUsuario.getClave(), ToUsuario.getRolUsuario(),ToUsuario.getNombres(),ToUsuario.getEmail()};
        return con.actualizar(nombreTabla, columnas, valores, ToUsuario.getIdUsuario());
    }
    
    public boolean eliminarUsuario(TOUsuario ToUsuario){
        return con.borrar(nombreTabla,ToUsuario.getIdUsuario());
    }
    
    public ArrayList<TOUsuario> listarUsuario(){
        ArrayList<TOUsuario> usuarios = new ArrayList<>();
        TOUsuario usuario;
        try {
            ResultSet rs = con.consultarTabla(nombreTabla);
            while(rs.next()){
                usuario = new TOUsuario();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setClave(rs.getString("clave"));
                usuario.setRolUsuario("rolUsuario");
                usuario.setNombres(rs.getString("nombres"));                
                usuario.setEmail(rs.getString("email"));                
                usuarios.add(usuario);
            }
            return usuarios;
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
