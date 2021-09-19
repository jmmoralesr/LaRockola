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
public class TOAlbum {

    private int idAlbum;
    private String nombreAlbum;
    private String selloDisco;
    private String agnoAlbum;

    public TOAlbum() {
    }

    public TOAlbum(int idAlbum, String nombreAlbum, String selloDisco, String agnoAlbum) {
        this.idAlbum = idAlbum;
        this.nombreAlbum = nombreAlbum;
        this.selloDisco = selloDisco;
        this.agnoAlbum = agnoAlbum;
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

    

}
