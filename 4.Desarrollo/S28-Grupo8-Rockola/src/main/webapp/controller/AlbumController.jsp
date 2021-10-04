<%-- 
    Document   : AlbumController.jsp
    Created on : 23/09/2021, 10:26:35 p. m.
    Author     : Carlos
--%>
<%@page import="to.TOAlbum"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.google.gson.Gson"%>
<%@page import = "controller.ControllerAlbum"%>
<% ControllerAlbum controladorAlbums = new ControllerAlbum();
String opcion = request.getParameter("opcion");
if("listar".equals(opcion)){
    ArrayList<TOAlbum> albums = controladorAlbums.listarAlbum();
    out.print(new Gson().toJson(albums));
}else if("insertar".equals(opcion)){
    out.println("Opcion Insertar AlbumsController");
}else if("actualizar".equals(opcion)){
    out.println("Opcion Actualizar AlbumsController");
}else if("eliminar".equals(opcion)){
    out.println("Opcion Eliminar AlbumsController");
}else{
    out.println("Opcion no disponible AlbumsController");
}

%>