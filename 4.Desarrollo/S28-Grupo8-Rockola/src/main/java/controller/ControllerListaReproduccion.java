/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAOListaReproduccion;
import java.util.ArrayList;
import to.TOListaReproduccion;

/**
 *
 * @author Carlos
 */
public class ControllerListaReproduccion {
    DAOListaReproduccion ListaReproduccionDAO = new DAOListaReproduccion();
    
    public int insertarUsuario(TOListaReproduccion ToListaReproduccion){
        return ListaReproduccionDAO.insertarListaReproduccion(ToListaReproduccion);
    }
    
    public boolean actualizarUsuario(TOListaReproduccion ToListaReproduccion){
        return ListaReproduccionDAO.actualizarListaReproduccion(ToListaReproduccion);
    }
    
    public boolean eliminarUsuario(TOListaReproduccion ToListaReproduccion){
        return ListaReproduccionDAO.eliminarListaReproduccion(ToListaReproduccion);
    }
    
    public ArrayList<TOListaReproduccion> listarListaReproduccion(){
        return ListaReproduccionDAO.listarListaReproduccion();
    }
}
