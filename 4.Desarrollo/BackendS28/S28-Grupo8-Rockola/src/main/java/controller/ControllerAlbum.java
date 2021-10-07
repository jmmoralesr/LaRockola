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
    
    public int insertarAlbum(TOAlbum ToAlbum){
        return albumDAO.insertarAlbum(ToAlbum);
    }
    
    public boolean actualizarAlbum(TOAlbum ToAlbum){
        return albumDAO.actualizarAlbum(ToAlbum);
    }
    
    public boolean eliminarAlbum(TOAlbum ToAlbum){
        return albumDAO.eliminarAlbum(ToAlbum);
    }
    
    public ArrayList<TOAlbum> listarAlbum(){
        return albumDAO.listarAlbum();
    }
}
