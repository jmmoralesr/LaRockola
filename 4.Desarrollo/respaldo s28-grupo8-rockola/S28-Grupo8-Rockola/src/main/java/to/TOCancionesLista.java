/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package to;

import java.util.Date;

/**
 *
 * @author Carlos
 */
public class TOCancionesLista {
    private int idCancionesLista;
    
    private int idListaReproduccion;    
    private int idUsuario;
    //private String usuario;
    //private String clave;
    //private String rolUsuario;
    //private String nombres;
    //private String email;
    //private Date fechaUltimaReproduccion;
    
    
    private int idCanciones;
    private String tituloCanciones;
    private String agnoCanciones;
    
    private int idArtistas;
    private String nombreArtistas;
    private String nacionalidadArtistas;

    private int idAlbum;
    private String nombreAlbum;
    private String selloDisco;
    private String agnoAlbum;

    private int idGenero;
    private String nombreGenero;
    
    private int favoritaCancion; 

    public TOCancionesLista() {
    }

    public TOCancionesLista(int idCancionesLista, int idListaReproduccion, int idUsuario, int idCanciones, String tituloCanciones, String agnoCanciones, int idArtistas, String nombreArtistas, String nacionalidadArtistas, int idAlbum, String nombreAlbum, String selloDisco, String agnoAlbum, int idGenero, String nombreGenero, int favoritaCancion) {
        this.idCancionesLista = idCancionesLista;
        this.idListaReproduccion = idListaReproduccion;
        this.idUsuario = idUsuario;
        this.idCanciones = idCanciones;
        this.tituloCanciones = tituloCanciones;
        this.agnoCanciones = agnoCanciones;
        this.idArtistas = idArtistas;
        this.nombreArtistas = nombreArtistas;
        this.nacionalidadArtistas = nacionalidadArtistas;
        this.idAlbum = idAlbum;
        this.nombreAlbum = nombreAlbum;
        this.selloDisco = selloDisco;
        this.agnoAlbum = agnoAlbum;
        this.idGenero = idGenero;
        this.nombreGenero = nombreGenero;
        this.favoritaCancion = favoritaCancion;
    }

    public int getIdCancionesLista() {
        return idCancionesLista;
    }

    public void setIdCancionesLista(int idCancionesLista) {
        this.idCancionesLista = idCancionesLista;
    }

    public int getIdListaReproduccion() {
        return idListaReproduccion;
    }

    public void setIdListaReproduccion(int idListaReproduccion) {
        this.idListaReproduccion = idListaReproduccion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdCanciones() {
        return idCanciones;
    }

    public void setIdCanciones(int idCanciones) {
        this.idCanciones = idCanciones;
    }

    public String getTituloCanciones() {
        return tituloCanciones;
    }

    public void setTituloCanciones(String tituloCanciones) {
        this.tituloCanciones = tituloCanciones;
    }

    public String getAgnoCanciones() {
        return agnoCanciones;
    }

    public void setAgnoCanciones(String agnoCanciones) {
        this.agnoCanciones = agnoCanciones;
    }

    public int getIdArtistas() {
        return idArtistas;
    }

    public void setIdArtistas(int idArtistas) {
        this.idArtistas = idArtistas;
    }

    public String getNombreArtistas() {
        return nombreArtistas;
    }

    public void setNombreArtistas(String nombreArtistas) {
        this.nombreArtistas = nombreArtistas;
    }

    public String getNacionalidadArtistas() {
        return nacionalidadArtistas;
    }

    public void setNacionalidadArtistas(String nacionalidadArtistas) {
        this.nacionalidadArtistas = nacionalidadArtistas;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public String getSelloDisco() {
        return selloDisco;
    }

    public void setSelloDisco(String selloDisco) {
        this.selloDisco = selloDisco;
    }

    public String getAgnoAlbum() {
        return agnoAlbum;
    }

    public void setAgnoAlbum(String agnoAlbum) {
        this.agnoAlbum = agnoAlbum;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    public int getFavoritaCancion() {
        return favoritaCancion;
    }

    public void setFavoritaCancion(int favoritaCancion) {
        this.favoritaCancion = favoritaCancion;
    }
    
    
    

    
    
    
    
}
