<%-- 
    Document   : machine
    Created on : 24 oct. 2023, 18:27:27
    Author     : PC
--%>

<%@page import="entities.Salle"%>
<%@page import="services.SalleService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <!-- Inclure Bootstrap JavaScript (jQuery requis) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <style>
            /* Styles CSS personnalisés pour votre page */
            /* Ajoutez vos styles personnalisés ici */
            body {
                background-color: #f4f4f4;
            }
            .container {
                padding: 20px;
            }
            .center-align {
                text-align: center;
            }

            fieldset{
                font-family: arial;
                border:2px solid black;
                border-radius: 8px;
                margin-bottom: 80px;
                padding: 20px;
            }
            legend{

                margin-bottom: 30px;
            }

        </style>
    </head>
    <body>
        <div class="modal fade" id="confirmDeleteModal" tabindex="-1" role="dialog" aria-labelledby="confirmDeleteModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered "  role="document">
                <div class="modal-content">
                    <div class="modal-header bg-danger text-white">
                        <h5 class="modal-title" id="confirmDeleteModalLabel">Confirmation de la suppression</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        Êtes-vous sûr de vouloir supprimer ce produit ?
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="bg-red-500 hover:bg-red-700 text-white font-bold py-2 px-4 rounded" id="confirmDeleteBtn">Confirmer la suppression</button>
                        <button type="button" class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded" data-dismiss="modal">Annuler</button>

                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <form action="SalleController" method="GET">
                <fieldset>
                    <legend class="center-align" >Informations sur la salle</legend>
                    <div class="row justify-content-center">
                        <div class="col-md-6">


                            <div class="form-group row mb-3">
                                <label for="salle" class="col-sm-2 col-form-label">Salle code :</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="salle" id="salle" value="">
                                </div>
                            </div>
                            <div class="form-group form-inline justify-content-center text-center">
                                <input type="submit" class="btn btn-primary mr-2" value="Ajouter" />

                            </div>
                        </div>
                    </div>
                </fieldset>
            </form>




            <fieldset>
                <legend class="center-align">Liste des salles</legend>
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>code salle</th>

                            <th>Modifier</th>
                            <th>Supprimer</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            SalleService ss = new SalleService();
                            for (Salle s : ss.findAll()) {
                        %>      
                        <tr>
                            <td><%=s.getId()%></td>
                            <td><%=s.getCode()%></td>

                            <td><a href="SalleController?operation=delete&id=<%= s.getId()%>" class="btn btn-primary" data-toggle="modal">Modifier</a></td>
                            <td><button type="button" class="btn btn-primary bg-blue-500 text-white" class="btn btn-danger" data-toggle="modal" data-target="#confirmDeleteModal" data-id="<%=s.getId()%>">Supprimer</button></td>
                        </tr>
                        <% }%>
                    </tbody>
                </table>
            </fieldset>
        </div>
        <script>
            // Gestionnaire d'événements lorsque le bouton de suppression est cliqué
            $('button[data-toggle="modal"][data-target="#confirmDeleteModal"]').on('click', function () {
// Récupérer l'ID du produit à supprimer à partir de l'attribut data-id
                var productId = $(this).data('id');

// Configurer le bouton "Confirmer la suppression" dans la modal pour rediriger vers la suppression réelle
                $('#confirmDeleteBtn').on('click', function () {
                    window.location.href = "SalleController?operation=delete&id=" + productId;
                });
            });
        </script>
    </body>
</html>
