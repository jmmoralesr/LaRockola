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
public class TOUsuario {

    private int idUsuario;
    private String usuario;
    private String clave;
    private String rolUsuario;
    private String nombres;
    private String email;

    public TOUsuario() {
    }

    public TOUsuario(int idUsuario, String usuario, String clave, String rolUsuario, String nombres, String email) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.clave = clave;
        this.rolUsuario = rolUsuario;
        this.nombres = nombres;
        this.email = email;
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
