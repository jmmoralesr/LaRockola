/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import to.TOListaGuardada;

/**
 *
 * @author Carlos
 */
public class DAOListaGuardada {
    private final ConexionDB con = new ConexionDB();
    private String nombreTabla = "listaguardada";
    private String [] columnas = {"idListaGuardada","nombreLista","idUsuario"};

    public DAOListaGuardada() {
    }
    
    
}
