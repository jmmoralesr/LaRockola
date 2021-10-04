<%-- 
    Document   : GeneroController
    Created on : 23/09/2021, 10:34:19 p. m.
    Author     : Carlos
--%>
<%@page import="to.TOGenero"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.google.gson.Gson"%>
<%@page import = "controller.ControllerGenero"%>
<% ControllerGenero controladorGenero = new ControllerGenero();
String opcion = request.getParameter("opcion");
if("listar".equals(opcion)){
    ArrayList<TOGenero> generos = controladorGenero.listarGenero();
    out.print(new Gson().toJson(generos));
}else if("insertar".equals(opcion)){
    out.println("Opcion Insertar GeneroController");
}else if("actualizar".equals(opcion)){
    out.println("Opcion Actualizar GeneroController");
}else if("eliminar".equals(opcion)){
    out.println("Opcion Eliminar GeneroController");
}else{
    out.println("Opcion no disponible GeneroController");
}

%>