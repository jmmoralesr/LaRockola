<%-- 
    Document   : UsuariosController.jsp
    Created on : 21/09/2021, 5:50:43 p. m.
    Author     : Carlos
--%>
<%@page import="to.TOUsuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.google.gson.Gson"%>
<%@page import = "controller.ControllerUsuarios"%>
<% ControllerUsuarios controladorUsuarios = new ControllerUsuarios();
String opcion = request.getParameter("opcion");
if("listar".equals(opcion)){
    ArrayList<TOUsuario> usuarios = controladorUsuarios.listarUsuarios(); 
    out.print(new Gson().toJson(usuarios));
}else if("insertar".equals(opcion)){
    String usuario = request.getParameter("data");
    TOUsuario usuarioTO = new Gson().fromJson(usuario, TOUsuario.class);
    controladorUsuarios.insertarUsuario(usuarioTO);
}else if("actualizar".equals(opcion)){
    out.println("Opcion Actualizar UsuariosController");
}else if("eliminar".equals(opcion)){
    out.println("Opcion Eliminar UsuariosController");
}else if("login".equals(opcion)){
    String datos = request.getParameter("datos");
    TOUsuario usuarioTO = new Gson().fromJson(datos, TOUsuario.class);
    //System.out.println("Recepcion_UsuarioController.jsp?opcion=login " + "usuario: " + usuarioTO.getUsuario() + " clave: " + usuarioTO.getClave());
    usuarioTO = controladorUsuarios.verificarUsuarios(usuarioTO.getUsuario(), usuarioTO.getClave());
    //System.out.println("ObjetoGson: " + new Gson().toJson(usuarioTO));
    out.println(new Gson().toJson(usuarioTO));
}else{
    out.println("Opcion no disponible UsuariosController");
}
%>