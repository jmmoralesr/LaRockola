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
public class TOArtistas {

    private int idArtistas;
    private String nombreArtistas;
    private String nacionalidadArtistas;

    public TOArtistas() {
    }

    public TOArtistas(int idArtistas, String nombreArtistas, String nacionalidadArtistas) {
        this.idArtistas = idArtistas;
        this.nombreArtistas = nombreArtistas;
        this.nacionalidadArtistas = nacionalidadArtistas;
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

    @Override
    public String toString() {
        return "TOArtistas{" + "idArtistas=" + idArtistas + ", nombreArtistas=" + nombreArtistas + ", nacionalidadArtistas=" + nacionalidadArtistas + '}';
    }

    
    
}
