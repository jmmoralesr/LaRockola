/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package to;

/**
 *
 * @author Carlos
 */
public class TOListaGuardada {
    private int idListaGuardada;
    private String nombreLista;
    
    private int idUsuario;
    private String nombres;

    public TOListaGuardada() {
    }

    public TOListaGuardada(int idListaGuardada, String nombreLista, int idUsuario, String nombres) {
        this.idListaGuardada = idListaGuardada;
        this.nombreLista = nombreLista;
        this.idUsuario = idUsuario;
        this.nombres = nombres;
    }

    public int getIdListaGuardada() {
        return idListaGuardada;
    }

    public void setIdListaGuardada(int idListaGuardada) {
        this.idListaGuardada = idListaGuardada;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    
    
    
}
