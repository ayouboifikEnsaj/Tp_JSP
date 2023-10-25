package org.apache.jsp.css;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entities.Salle;
import services.SalleService;

public final class salle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <!-- Inclure Bootstrap JavaScript (jQuery requis) -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            /* Styles CSS personnalisés pour votre page */\n");
      out.write("            /* Ajoutez vos styles personnalisés ici */\n");
      out.write("            body {\n");
      out.write("                background-color: #f4f4f4;\n");
      out.write("            }\n");
      out.write("            .container {\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            .center-align {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            fieldset{\n");
      out.write("                font-family: arial;\n");
      out.write("                border:2px solid black;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                margin-bottom: 80px;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            legend{\n");
      out.write("\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"modal fade\" id=\"confirmDeleteModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"confirmDeleteModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered \"  role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header bg-danger text-white\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"confirmDeleteModalLabel\">Confirmation de la suppression</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        Êtes-vous sûr de vouloir supprimer ce produit ?\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"bg-red-500 hover:bg-red-700 text-white font-bold py-2 px-4 rounded\" id=\"confirmDeleteBtn\">Confirmer la suppression</button>\n");
      out.write("                        <button type=\"button\" class=\"bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded\" data-dismiss=\"modal\">Annuler</button>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"SalleController\" method=\"GET\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend class=\"center-align\" >Informations sur la salle</legend>\n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group row mb-3\">\n");
      out.write("                                <label for=\"salle\" class=\"col-sm-2 col-form-label\">Salle code :</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"salle\" value=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group form-inline justify-content-center text-center\">\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-primary mr-2\" value=\"Ajouter\" />\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </fieldset>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <fieldset>\n");
      out.write("                <legend class=\"center-align\">Liste des salles</legend>\n");
      out.write("                <table class=\"table table-striped\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>code salle</th>\n");
      out.write("\n");
      out.write("                            <th>Modifier</th>\n");
      out.write("                            <th>Supprimer</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                            SalleService ss = new SalleService();
                            for (Salle s : ss.findAll()) {
                        
      out.write("      \n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(s.getId());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(s.getCode());
      out.write("</td>\n");
      out.write("\n");
      out.write("                            <td><a href=\"SalleController?operation=update&id=");
      out.print( s.getId());
      out.write("\" class=\"btn btn-primary\" data-toggle=\"modal\">Modifier</a></td>\n");
      out.write("                            <td><button type=\"button\" class=\"btn btn-primary bg-blue-500 text-white\" class=\"btn btn-danger\" data-toggle=\"modal\" data-target=\"#confirmDeleteModal\" data-id=\"");
      out.print(s.getId());
      out.write("\">Supprimer</button></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </fieldset>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            // Gestionnaire d'événements lorsque le bouton de suppression est cliqué\n");
      out.write("            $('button[data-toggle=\"modal\"][data-target=\"#confirmDeleteModal\"]').on('click', function () {\n");
      out.write("// Récupérer l'ID du produit à supprimer à partir de l'attribut data-id\n");
      out.write("                var productId = $(this).data('id');\n");
      out.write("\n");
      out.write("// Configurer le bouton \"Confirmer la suppression\" dans la modal pour rediriger vers la suppression réelle\n");
      out.write("                $('#confirmDeleteBtn').on('click', function () {\n");
      out.write("                    window.location.href = \"SalleController?operation=delete&id=\" + productId;\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
