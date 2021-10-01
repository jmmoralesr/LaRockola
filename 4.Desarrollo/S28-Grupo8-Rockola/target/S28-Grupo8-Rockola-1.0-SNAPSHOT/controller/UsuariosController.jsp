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
    out.println("Opcion Insertar UsuariosController");
}else if("actualizar".equals(opcion)){
    out.println("Opcion Actualizar UsuariosController");
}else if("eliminar".equals(opcion)){
    out.println("Opcion Eliminar UsuariosController");
}else{
    out.println("Opcion no disponible UsuariosController");
}

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>UsuarioController</h1>
    </body>
</html>
