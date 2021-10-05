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
import to.TOListaReproduccion;

/**
 *
 * @author Carlos
 */
public class DAOListaReproduccion {
    private final ConexionDB con = new ConexionDB();
    private String nombreTabla = "listareproduccion";
    private String nombreVista = "vistalistareproduccion";
    private String [] columnas = {"idListaReproduccion","idUsuario","idListaReproduccionLista","fechaUltimReprod"};

    public DAOListaReproduccion() {
    }
    
    public int insertarListaReproduccion(TOListaReproduccion ToListaReproduccion){
        String [] valores = {String.valueOf(ToListaReproduccion.getIdListaReproduccion()),String.valueOf(ToListaReproduccion.getIdUsuario()),String.valueOf(ToListaReproduccion.getIdCancionesLista()),String.valueOf(ToListaReproduccion.getFechaUltimaReproduccion())};
        return con.insertar(nombreTabla, columnas, valores);
    }
    
    public boolean actualizarListaReproduccion(TOListaReproduccion ToListaReproduccion){
        String [] valores = {String.valueOf(ToListaReproduccion.getIdListaReproduccion()),String.valueOf(ToListaReproduccion.getIdUsuario()),String.valueOf(ToListaReproduccion.getIdCancionesLista()),String.valueOf(ToListaReproduccion.getFechaUltimaReproduccion())};
        return con.actualizar(nombreTabla, valores, ToListaReproduccion.getIdListaReproduccion());
    }
    
    public boolean eliminarListaReproduccion(TOListaReproduccion ToListaReproduccion){
        return con.borrar(nombreTabla,ToListaReproduccion.getIdListaReproduccion());
    }
    
    public ArrayList<TOListaReproduccion> listarListaReproduccion(){
        ArrayList<TOListaReproduccion> lista = new ArrayList<>();
        TOListaReproduccion item;
        try {
            ResultSet rs = con.consultarVista(nombreVista);
            while(rs.next()){
                item = new TOListaReproduccion();
                item.setIdListaReproduccion(rs.getInt("idListaReproduccion"));
                item.setIdUsuario(rs.getInt("idUsuario"));
                item.setUsuario(rs.getString("usuario"));
                item.setNombres(rs.getString("nombres"));
                item.setIdCancionesLista(rs.getInt("idCancionesLista"));
                item.setIdCanciones(rs.getInt("idCanciones"));
                item.setTituloCanciones(rs.getString("tituloCanciones"));
                item.setAgnoCanciones(rs.getString("agnoCanciones"));
                item.setFavoritaCancion(rs.getInt("favoritaCancion"));
                item.setFechaUltimaReproduccion(rs.getDate("fechaUltimReprod"));
                lista.add(item);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(DAOListaReproduccion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
