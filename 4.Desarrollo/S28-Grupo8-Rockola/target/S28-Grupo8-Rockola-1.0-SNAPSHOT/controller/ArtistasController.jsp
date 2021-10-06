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
    String datos = request.getParameter("data");
    TOArtistas ArtistaTO = new Gson().fromJson(datos, TOArtistas.class);
    controladorArtistas.insertarArtistas(ArtistaTO);
}else if("actualizar".equals(opcion)){
    String datos = request.getParameter("data");
    System.out.println("ArtistasControler.jsp?opcion=actualizar: "+datos);
    TOArtistas ArtistaTO = new Gson().fromJson(datos, TOArtistas.class);
    System.out.println("ArtistasControler.jsp?opcion=actualizar: "+ArtistaTO.toString());
    controladorArtistas.actualizarArtistas(ArtistaTO);
}else if("eliminar".equals(opcion)){
    String datos = request.getParameter("data");
    TOArtistas ArtistaTO = new Gson().fromJson(datos, TOArtistas.class);
    controladorArtistas.eliminarArtistas(ArtistaTO);
}else{
    out.println("Opcion no disponible ArtistasController");
}
%>