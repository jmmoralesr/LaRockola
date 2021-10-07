/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAOCancionesLista;
import java.util.ArrayList;
import to.TOCancionesLista;

/**
 *
 * @author Carlos
 */
public class ControllerCancionesLista {
    DAOCancionesLista CancionesListaDAO = new DAOCancionesLista();
    
    public int insertarUsuario(TOCancionesLista ToCancionesLista){
        return CancionesListaDAO.insertarCancionesLista(ToCancionesLista);
    }
    
    public boolean actualizarUsuario(TOCancionesLista ToCancionesLista){
        return CancionesListaDAO.actualizarCancionesLista(ToCancionesLista);
    }
    
    public boolean eliminarUsuario(TOCancionesLista ToCancionesLista){
        return CancionesListaDAO.eliminarCancionesLista(ToCancionesLista);
    }
    
    public ArrayList<TOCancionesLista> listarCancionesLista(){
        return CancionesListaDAO.listarCancionesLista();
    }
}
