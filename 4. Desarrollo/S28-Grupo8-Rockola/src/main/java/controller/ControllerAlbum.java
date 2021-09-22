/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAOAlbum;
import java.util.ArrayList;
import to.TOAlbum;

/**
 *
 * @author Carlos
 */
public class ControllerAlbum {
    DAOAlbum albumDAO = new DAOAlbum();
    
    public int insertarUsuario(TOAlbum ToAlbum){
        return albumDAO.insertarAlbum(ToAlbum);
    }
    
    public boolean actualizarUsuario(TOAlbum ToAlbum){
        return albumDAO.actualizarAlbum(ToAlbum);
    }
    
    public boolean eliminarUsuario(TOAlbum ToAlbum){
        return albumDAO.eliminarAlbum(ToAlbum);
    }
    
    public ArrayList<TOAlbum> listarAlbum(){
        return albumDAO.listarAlbum();
    }
}
