/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.ConexionDB;

/**
 *
 * @author Carlos
 */
public class DAOCancionesLista {
    private final ConexionDB con = new ConexionDB();
    private String nombreTabla = "cancioneslista";
    private String [] columnas = {"idCancionesLista","idListaReproduccion","idCanciones","idAlbum","favoritaCancion"};
}
