<%-- 
    Document   : CancionesController.jsp
    Created on : 22/09/2021, 9:33:27 p. m.
    Author     : Carlos
--%>

<%@page import="to.TOCanciones"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.google.gson.Gson"%>
<%@page import = "controller.ControllerCanciones"%>
<% ControllerCanciones controladorCanciones = new ControllerCanciones();
String opcion = request.getParameter("opcion");
if("listar".equals(opcion)){
    ArrayList<TOCanciones> canciones = controladorCanciones.listarCanciones(); 
    out.print(new Gson().toJson(canciones));
}else if("insertar".equals(opcion)){
    
}else if("actualizar".equals(opcion)){
    
}else if("eliminar".equals(opcion)){
    
}else{
    out.println("Opcion no disponible CancionesController");
}

%>