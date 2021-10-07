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
public class TOListaReproduccion {

    private int idListaReproduccion;

    private int idUsuario;
    private String usuario;
    //private String clave;
    //private String rolUsuario;
    private String nombres;
    //private String email;

    private int idCancionesLista;

    private int idCanciones;
    private String tituloCanciones;
    private String agnoCanciones;

    private int favoritaCancion;

    private Date fechaUltimaReproduccion;

    public TOListaReproduccion() {
    }

    public TOListaReproduccion(int idListaReproduccion, int idUsuario, String usuario, String nombres, int idCancionesLista, int idCanciones, String tituloCanciones, String agnoCanciones, int favoritaCancion, Date fechaUltimaReproduccion) {
        this.idListaReproduccion = idListaReproduccion;
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.nombres = nombres;
        this.idCancionesLista = idCancionesLista;
        this.idCanciones = idCanciones;
        this.tituloCanciones = tituloCanciones;
        this.agnoCanciones = agnoCanciones;
        this.favoritaCancion = favoritaCancion;
        this.fechaUltimaReproduccion = fechaUltimaReproduccion;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getIdCancionesLista() {
        return idCancionesLista;
    }

    public void setIdCancionesLista(int idCancionesLista) {
        this.idCancionesLista = idCancionesLista;
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

    public int getFavoritaCancion() {
        return favoritaCancion;
    }

    public void setFavoritaCancion(int favoritaCancion) {
        this.favoritaCancion = favoritaCancion;
    }

    public Date getFechaUltimaReproduccion() {
        return fechaUltimaReproduccion;
    }

    public void setFechaUltimaReproduccion(Date fechaUltimaReproduccion) {
        this.fechaUltimaReproduccion = fechaUltimaReproduccion;
    }
    
    

}
