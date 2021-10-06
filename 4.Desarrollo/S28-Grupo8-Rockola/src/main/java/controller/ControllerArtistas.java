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
    
    public int insertarArtistas(TOArtistas ToArtistas){
        return ArtistasDAO.insertarArtistas(ToArtistas);
    }
    
    public boolean actualizarArtistas(TOArtistas ToArtistas){
        return ArtistasDAO.actualizarArtistas(ToArtistas);
    }
    
    public boolean eliminarArtistas(TOArtistas ToArtistas){
        return ArtistasDAO.eliminarArtistas(ToArtistas);
    }
    
    public ArrayList<TOArtistas> listarArtistas(){
        return ArtistasDAO.listarArtistas();
    }
}
