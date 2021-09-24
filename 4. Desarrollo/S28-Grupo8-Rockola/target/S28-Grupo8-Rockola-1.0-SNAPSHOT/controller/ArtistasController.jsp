<%-- 
    Document   : ArtistasController
    Created on : 23/09/2021, 10:27:15 p. m.
    Author     : Carlos
--%>
<%@page import="to.TOArtistas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.google.gson.Gson"%>
<%@page import = "controller.ControllerArtistas"%>
<% ControllerArtistas controladorArtistas = new ControllerArtistas();
String opcion = request.getParameter("opcion");
if("listar".equals(opcion)){
    ArrayList<TOArtistas> artistas = controladorArtistas.listarArtistas();
    out.print(new Gson().toJson(artistas));
}else if("insertar".equals(opcion)){
    out.println("Opcion Insertar ArtistasController");
}else if("actualizar".equals(opcion)){
    out.println("Opcion Actualizar ArtistasController");
}else if("eliminar".equals(opcion)){
    out.println("Opcion Eliminar ArtistasController");
}else{
    out.println("Opcion no disponible ArtistasController");
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
        <h1>ArtistasController</h1>
    </body>
</html>
