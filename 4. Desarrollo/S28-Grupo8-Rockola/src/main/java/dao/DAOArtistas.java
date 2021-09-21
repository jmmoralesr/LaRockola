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
import to.TOArtistas;

/**
 *
 * @author Carlos
 */
public class DAOArtistas {
    private final ConexionDB con = new ConexionDB();
    private String nombreTabla = "artistas";
    private String [] columnas = {"idArtistas","nombreArtistas","nacionalidadArtistas"};

    public DAOArtistas() {
    }
    
    public int insertarAlbum(TOArtistas ToArtistas){
        String [] valores = {String.valueOf(ToArtistas.getIdArtistas()),ToArtistas.getNombreArtistas(),ToArtistas.getNacionalidadArtistas()};
        return con.insertar(nombreTabla, columnas, valores);
    }
    
    public boolean actualizarAlbum(TOArtistas ToArtistas){
        String [] valores = {String.valueOf(ToArtistas.getIdArtistas()),ToArtistas.getNombreArtistas(),ToArtistas.getNacionalidadArtistas()};
        return con.actualizar(nombreTabla, columnas, valores, ToArtistas.getIdArtistas());
    }
    
    public boolean eliminarArtistas(TOArtistas ToArtistas){
        return con.borrar(nombreTabla,ToArtistas.getIdArtistas());
    }
    
    public ArrayList<TOArtistas> listarArtistas(){
        ArrayList<TOArtistas> artistas = new ArrayList<>();
        TOArtistas artista;
        try {
            ResultSet rs = con.consultarTabla(nombreTabla);
            while(rs.next()){
                artista = new TOArtistas();
                artista.setIdArtistas(rs.getInt("idArtistas"));
                artista.setNombreArtistas(rs.getString("nombreArtistas"));
                artista.setNacionalidadArtistas("nacionalidadArtistas");
                artistas.add(artista);
            }
            return artistas;
        } catch (SQLException ex) {
            Logger.getLogger(DAOArtistas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
