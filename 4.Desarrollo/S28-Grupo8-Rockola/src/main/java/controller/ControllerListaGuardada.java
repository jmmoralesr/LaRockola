/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAOListaGuardada;
import java.util.ArrayList;
import to.TOListaGuardada;

/**
 *
 * @author Carlos
 */
public class ControllerListaGuardada {
    DAOListaGuardada ListaGuardadaDAO = new DAOListaGuardada();
    
    /*public int insertarUsuario(TOListaGuardada ToListaGuardada){
        return ListaGuardadaDAO.insertarListaGuardada(ToListaGuardada);
    }
    
    public boolean actualizarUsuario(TOListaGuardada ToListaGuardada){
        return ListaGuardadaDAO.actualizarListaGuardada(ToListaGuardada);
    }
    
    public boolean eliminarUsuario(TOListaGuardada ToListaGuardada){
        return ListaGuardadaDAO.eliminarListaGuardada(ToListaGuardada);
    }
    
    public ArrayList<TOListaGuardada> listarListaGuardada(){
        return ListaGuardadaDAO.listarListaGuardada();
    }*/
}
