/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAOCanciones;
import java.util.ArrayList;
import to.TOCanciones;

/**
 *
 * @author Carlos
 */
public class ControllerCanciones {
    DAOCanciones CancionesDAO = new DAOCanciones();

    public ControllerCanciones() {
    }
    
    
    
    public int insertarUsuario(TOCanciones ToCanciones){
        return CancionesDAO.insertarCanciones(ToCanciones);
    }
    
    public boolean actualizarUsuario(TOCanciones ToCanciones){
        return CancionesDAO.actualizarCanciones(ToCanciones);
    }
    
    public boolean eliminarUsuario(TOCanciones ToCanciones){
        return CancionesDAO.eliminarCanciones(ToCanciones);
    }
    
    public ArrayList<TOCanciones> listarCanciones(){
        return CancionesDAO.listarCanciones();
    }
}
