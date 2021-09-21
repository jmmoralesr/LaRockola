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
import to.TOCanciones;

/**
 *
 * @author Carlos
 */
public class DAOListaReproduccion {
    private final ConexionDB con = new ConexionDB();
    private String nombreTabla = "listareproduccion";
    private String nombreVista = "vistalistareproduccion";
    private String [] columnas = {"idListaReproduccion","idUsuario","idCancionesLista","fechaUltimaReproduccion"};

    public DAOListaReproduccion() {
    }
    
}
