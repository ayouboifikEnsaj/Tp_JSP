<%-- 
    Document   : machine
    Created on : 24 oct. 2023, 18:27:27
    Author     : PC
--%>

<%@page import="entities.Machine"%>
<%@page import="services.MachineService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        
        <form action="MachineController" method="GET">
            <fieldset>
                <legend>
                informations machine    
                </legend>
                <table border="0">
                   
                    <tbody>
                        <tr>
                            <td>Réference : </td>
                            <td><input type="text" name="ref" value="" /></td>
                        </tr>
                        <tr>
                            <td>Marque :</td>
                            <td><input type="text" name="marque" value="" /></td>
                        </tr>
                        <tr>
                            <td>Prix : </td>
                            <td><input type="text" name="prix" value="" /></td>
                        </tr>
                        <tr>
                            <td>Salle code : </td>
                            <td><input type="text" name="salle" value="" /></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input type="submit" value="ajouter" /><input type="submit" value="annuler" /></td>
                        </tr>
                    <fieldset>
                        <legend>Liste des machines</legend>
                        <table border="1">
                            <thead>
                                <tr>
                                    <th>id</th>
                                    <th>reference</th>
                                    <th>marque</th>
                                    <th>Prix</th>
                                    <th>Modifier</th>
                                    <th>supprimer</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                 
                                  MachineService ms = new MachineService();
                                  for(Machine m: ms.findAll() ){
                                      
                                  
                              %>      
                                <tr>
                                    <td><%=m.getId() %></td>
                                    <td><%=m.getRef()%></td>
                                    <td><%=m.getMarque()%></td>
                                    <td><%=m.getPrix()%></td>
                                    <td><a href="MachineController?operation=update&id=<%= m.getId()%>">Modifier</a></td>
                                    <td><a href="MachineController?operation=delete&id=<%= m.getId()%>">Suprrimer</a></td>
                                </tr>
                             <% }%>
                            </tbody>
                        </table>

                        
                    </fieldset>
                    </tbody>
                </table>

            </fieldset>
        </form>
    </body>
</html>
