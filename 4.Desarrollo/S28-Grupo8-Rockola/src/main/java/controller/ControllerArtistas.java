/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAOArtistas;
import java.util.ArrayList;
import to.TOArtistas;


/**
 *
 * @author Carlos
 */
public class ControllerArtistas {
    DAOArtistas ArtistasDAO = new DAOArtistas();
    
    public int insertarUsuario(TOArtistas ToArtistas){
        return ArtistasDAO.insertarArtistas(ToArtistas);
    }
    
    public boolean actualizarUsuario(TOArtistas ToArtistas){
        return ArtistasDAO.actualizarArtistas(ToArtistas);
    }
    
    public boolean eliminarUsuario(TOArtistas ToArtistas){
        return ArtistasDAO.eliminarArtistas(ToArtistas);
    }
    
    public ArrayList<TOArtistas> listarArtistas(){
        return ArtistasDAO.listarArtistas();
    }
}
