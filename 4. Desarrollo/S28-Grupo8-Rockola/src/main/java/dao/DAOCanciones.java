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
import to.TOCanciones;

/**
 *
 * @author Carlos
 */
public class DAOCanciones {
    private final ConexionDB con = new ConexionDB();
    private String nombreTabla = "canciones";
    private String nombreVista = "vistacanciones";
    private String [] columnas = {"idCanciones","tituloCanciones","agnoCanciones","idArtistas","idAlbum","idGenero"};

    public DAOCanciones() {
    }
    
    public int insertarCanciones(TOCanciones ToCanciones){
        String [] valores = {String.valueOf(ToCanciones.getIdCanciones()),ToCanciones.getTituloCanciones(),ToCanciones.getAgnoCanciones(),String.valueOf(ToCanciones.getIdArtistas()),String.valueOf(ToCanciones.getIdAlbum()),String.valueOf(ToCanciones.getIdGenero())};
        return con.insertar(nombreTabla, columnas, valores);
    }
    
    public boolean actualizarCanciones(TOCanciones ToCanciones){
        String [] valores = {String.valueOf(ToCanciones.getIdCanciones()),ToCanciones.getTituloCanciones(),ToCanciones.getAgnoCanciones(),String.valueOf(ToCanciones.getIdArtistas()),String.valueOf(ToCanciones.getIdAlbum()),String.valueOf(ToCanciones.getIdGenero())};
        return con.actualizar(nombreTabla, columnas, valores, ToCanciones.getIdCanciones());
    }
    
    public boolean eliminarCanciones(TOCanciones ToCanciones){
        return con.borrar(nombreTabla,ToCanciones.getIdCanciones());
    }
    
    public ArrayList<TOCanciones> listarCanciones(){
        ArrayList<TOCanciones> canciones = new ArrayList<>();
        TOCanciones cancion;
        try {
            ResultSet rs = con.consultarVista(nombreVista);
            while(rs.next()){
                cancion = new TOCanciones();
                cancion.setIdArtistas(rs.getInt("idCanciones"));
                cancion.setNombreArtistas(rs.getString("tituloCanciones"));
                cancion.setNacionalidadArtistas("agnoCanciones");
                cancion.setIdArtistas(rs.getInt("idArtistas"));
                cancion.setNombreArtistas(rs.getString("nombreArtistas"));
                cancion.setNacionalidadArtistas(rs.getString("nacionalidadArtistas"));
                cancion.setIdAlbum(rs.getInt("idAlbum"));
                cancion.setNombreAlbum(rs.getString("nombreAlbum"));
                cancion.setSelloDisco(rs.getString("selloDisco"));
                cancion.setAgnoAlbum(rs.getString("agnoAlbum"));
                cancion.setIdGenero(rs.getInt("idGenero"));
                cancion.setNombreGenero(rs.getString("nombreGenero"));
                canciones.add(cancion);
            }
            return canciones;
        } catch (SQLException ex) {
            Logger.getLogger(DAOCanciones.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
