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
import to.TOAlbum;

/**
 *
 * @author Carlos
 */
public class DAOAlbum {
    private final ConexionDB con = new ConexionDB();
    private String nombreTabla = "album";
    private String [] columnas = {"nombreAlbum","selloDisco","agnoAlbum"};

    public DAOAlbum() {
    }
    
    public int insertarAlbum(TOAlbum ToAlbum){
        String [] valores = {ToAlbum.getNombreAlbum(),ToAlbum.getSelloDisco(), ToAlbum.getAgnoAlbum()};
        return con.insertar(nombreTabla, columnas, valores);
    }
    
    public boolean actualizarAlbum(TOAlbum ToAlbum){
        String [] valores = {String.valueOf(ToAlbum.getIdAlbum()),ToAlbum.getNombreAlbum(),ToAlbum.getSelloDisco(), ToAlbum.getAgnoAlbum()};
        return con.actualizar(nombreTabla, columnas, valores, ToAlbum.getIdAlbum());
    }
    
    public boolean eliminarAlbum(TOAlbum ToAlbum){
        return con.borrar(nombreTabla,ToAlbum.getIdAlbum());
    }
    
    public ArrayList<TOAlbum> listarAlbum(){
        ArrayList<TOAlbum> albums = new ArrayList<>();
        TOAlbum album;
        try {
            ResultSet rs = con.consultarTabla(nombreTabla);
            while(rs.next()){
                album = new TOAlbum();
                album.setIdAlbum(rs.getInt("idAlbum"));
                album.setNombreAlbum(rs.getString("nombreAlbum"));
                album.setSelloDisco("selloDisco");
                album.setAgnoAlbum("agnoAlbum");
                albums.add(album);
            }
            return albums;
        } catch (SQLException ex) {
            Logger.getLogger(DAOAlbum.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
