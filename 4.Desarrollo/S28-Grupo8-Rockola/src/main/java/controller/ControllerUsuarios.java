/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAOUsuario;
import java.util.ArrayList;
import to.TOUsuario;

/**
 *
 * @author Carlos
 */
public class ControllerUsuarios {
    DAOUsuario usuarioDAO = new DAOUsuario();

    public ControllerUsuarios() {
    }
    
    public int insertarUsuario(TOUsuario ToUsuario){
        return usuarioDAO.insertarUsuario(ToUsuario);
    }
    
    public boolean actualizarUsuario(TOUsuario ToUsuario){
        return usuarioDAO.actualizarUsuario(ToUsuario);
    }
    
    public boolean eliminarUsuario(TOUsuario ToUsuario){
        return usuarioDAO.eliminarUsuario(ToUsuario);
    }
    
    public ArrayList<TOUsuario> listarUsuarios(){
        return usuarioDAO.listarUsuario();
    }
    
    public TOUsuario verificarUsuarios(String usuario, String clave){
        return usuarioDAO.verificarUsuario(usuario, clave);
    }
}
