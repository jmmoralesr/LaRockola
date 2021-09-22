<%-- 
    Document   : UsuariosController.jsp
    Created on : 21/09/2021, 5:50:43 p. m.
    Author     : Carlos
--%>
<%@page import="to.TOUsuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import = "controller.ControllerUsuarios"%>
<% ControllerUsuarios controladorUsuarios = new ControllerUsuarios();
String opcion = request.getParameter("opcion");
switch(opcion){
    case "listar":
        ArrayList<TOUsuario> usuarios = controladorUsuarios.listarUsuarios(); 
        break;
    case "insertar":
        
        break;
    case "actualizar":
        
        break;
    case "eliminar":
        
        break;
    default:
        System.out.println("Opcion no disponible");
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
        <h1>Hello World!</h1>
    </body>
</html>
