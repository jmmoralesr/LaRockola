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
import to.TOCancionesLista;

/**
 *
 * @author Carlos
 */
public class DAOCancionesLista {
    private final ConexionDB con = new ConexionDB();
    private String nombreTabla = "cancioneslista";
    private String nombreVista = "vistacancioneslista";
    private String [] columnas = {"idCancionesLista","idListaReproduccion","idCanciones","favoritaCancion"};

    public DAOCancionesLista() {
    }
    
    public int insertarCancionesLista(TOCancionesLista ToCancionesLista){
        String [] valores = {String.valueOf(ToCancionesLista.getIdListaReproduccion()),String.valueOf(ToCancionesLista.getIdCanciones()),String.valueOf(ToCancionesLista.getFavoritaCancion())};
        return con.insertar(nombreTabla, columnas, valores);
    }
    
    public boolean actualizarCancionesLista(TOCancionesLista ToCancionesLista){
        String [] valores = {String.valueOf(ToCancionesLista.getIdCancionesLista()),String.valueOf(ToCancionesLista.getIdListaReproduccion()),String.valueOf(ToCancionesLista.getIdCanciones()),String.valueOf(ToCancionesLista.getFavoritaCancion())};
        return con.actualizar(nombreTabla, columnas, valores, ToCancionesLista.getIdCancionesLista());
    }
    
    public boolean eliminarCancionesLista(TOCancionesLista ToCancionesLista){
        return con.borrar(nombreTabla,ToCancionesLista.getIdCancionesLista());
    }
    
    public ArrayList<TOCancionesLista> listarCancionesLista(){
        ArrayList<TOCancionesLista> cancionesLista = new ArrayList<>();
        TOCancionesLista cancionLista;
        try {
            ResultSet rs = con.consultarVista(nombreVista);
            while(rs.next()){
                cancionLista = new TOCancionesLista();
                cancionLista.setIdCancionesLista(rs.getInt("idCancionesLista"));
                cancionLista.setIdListaReproduccion(rs.getInt("idListaReproduccion"));
                cancionLista.setIdUsuario(rs.getInt("idUsuario"));
                cancionLista.setIdCanciones(rs.getInt("idCanciones"));
                cancionLista.setNombreArtistas(rs.getString("tituloCanciones"));
                cancionLista.setNacionalidadArtistas("agnoCanciones");
                cancionLista.setIdArtistas(rs.getInt("idArtistas"));
                cancionLista.setNombreArtistas(rs.getString("nombreArtistas"));
                cancionLista.setNacionalidadArtistas(rs.getString("nacionalidadArtistas"));
                cancionLista.setIdAlbum(rs.getInt("idAlbum"));
                cancionLista.setNombreAlbum(rs.getString("nombreAlbum"));
                cancionLista.setSelloDisco(rs.getString("selloDisco"));
                cancionLista.setAgnoAlbum(rs.getString("agnoAlbum"));
                cancionLista.setIdGenero(rs.getInt("idGenero"));
                cancionLista.setNombreGenero(rs.getString("nombreGenero"));
                cancionLista.setFavoritaCancion(rs.getInt("favoritaCancion"));
                cancionesLista.add(cancionLista);
            }
            return cancionesLista;
        } catch (SQLException ex) {
            Logger.getLogger(DAOCancionesLista.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
