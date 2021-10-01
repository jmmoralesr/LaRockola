/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAOGenero;
import java.util.ArrayList;
import to.TOGenero;

/**
 *
 * @author Carlos
 */
public class ControllerGenero {
    DAOGenero GeneroDAO = new DAOGenero();
    
    public int insertarUsuario(TOGenero ToGenero){
        return GeneroDAO.insertarGenero(ToGenero);
    }
    
    public boolean actualizarUsuario(TOGenero ToGenero){
        return GeneroDAO.actualizarGenero(ToGenero);
    }
    
    public boolean eliminarUsuario(TOGenero ToGenero){
        return GeneroDAO.eliminarGenero(ToGenero);
    }
    
    public ArrayList<TOGenero> listarGenero(){
        return GeneroDAO.listarGenero();
    }
}
