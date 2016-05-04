package org.apache.jsp.admin.pergunta;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Categoria;
import dao.CategoriaDAO;
import java.util.List;
import modelo.Jogador;
import dao.JogadorDAO;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/pergunta/../cabecalho.jsp");
    _jspx_dependants.add("/admin/pergunta/../rodape.jsp");
  }

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
      response.setContentType("text/html");
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
      out.write("<!doctype html>\n");

   
   if(session.getAttribute("usuarioAdmin")==null){
     response.sendRedirect("../index.jsp");
   }

      out.write("\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"description\" content=\"A front-end template that helps you build fast, modern mobile web apps.\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!-- Add to homescreen for Chrome on Android -->\n");
      out.write("        <meta name=\"mobile-web-app-capable\" content=\"yes\">\n");
      out.write("        <link rel=\"icon\" sizes=\"192x192\" href=\"../images/touch/chrome-touch-icon-192x192.png\">\n");
      out.write("\n");
      out.write("        <!-- Add to homescreen for Safari on iOS -->\n");
      out.write("        <meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\n");
      out.write("        <meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\n");
      out.write("        <meta name=\"apple-mobile-web-app-title\" content=\"Material Design Lite\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"../apple-touch-icon-precomposed.png\">\n");
      out.write("\n");
      out.write("        <!-- Tile icon for Win8 (144x144 + tile color) -->\n");
      out.write("        <meta name=\"msapplication-TileImage\" content=\"images/touch/ms-touch-icon-144x144-precomposed.png\">\n");
      out.write("        <meta name=\"msapplication-TileColor\" content=\"#3372DF\">\n");
      out.write("\n");
      out.write("        <!-- SEO: If your mobile URL is different from the desktop URL, add a canonical link to the desktop page https://developers.google.com/webmasters/smartphone-sites/feature-phones -->\n");
      out.write("        <!--\n");
      out.write("        <link rel=\"canonical\" href=\"../http://www.example.com/\">\n");
      out.write("        -->\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../mdl/material.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../mdl/styles.css\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("<body class=\"mdl-demo mdl-color--grey-100 mdl-color-text--grey-700 mdl-base\">\n");
      out.write("    <div class=\"mdl-layout mdl-js-layout mdl-layout--fixed-header\">\n");
      out.write("      <header class=\"mdl-layout__header mdl-layout__header--scroll mdl-color--primary\">\n");
      out.write("        <div class=\"mdl-layout__header-row\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-layout--large-screen-only mdl-layout__header-row\">\n");
      out.write("          <h3>Área Administrativa</h3>\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("        <div class=\"mdl-layout--large-screen-only mdl-layout__header-row\">\n");
      out.write("            <p>Admin - <a href=\"../index.jsp?sair=OK\">Sair</a></p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\" mdl-js-ripple-effect mdl-color--primary-dark\">\n");
      out.write("          <a href=\"../index.jsp\" class=\"mdl-layout__tab\">Inicial</a>\n");
      out.write("          <a href=\"../categoria/list.jsp\" class=\"mdl-layout__tab\">Categoria</a>\n");
      out.write("          <a href=\"../jogador/list.jsp\" class=\"mdl-layout__tab\">Jogador</a>\n");
      out.write("          <a href=\"../pergunta/list.jsp\" class=\"mdl-layout__tab\">Pergunta</a>\n");
      out.write("        </div>\n");
      out.write("      </header>\n");
      out.write("      <main class=\"mdl-layout__content\">\n");
      out.write("        <div class=\"mdl-layout__tab-panel is-active\" id=\"overview\">\n");
      out.write('\n');


    CategoriaDAO cdao = new CategoriaDAO();
    List<Categoria> clista = cdao.listar();


      out.write("\n");
      out.write("<section class=\"section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp\">\n");
      out.write("    <div class=\"mdl-card mdl-cell mdl-cell--12-col\">\n");
      out.write("        <div class=\"mdl-card__supporting-text\">\n");
      out.write("            <h4>Perguntar - Cadastrar</h4>\n");
      out.write("            <form action=\"add-ok.jsp\" method=\"post\">\n");
      out.write("                <!-- \n");
      out.write("                    primeira div -- área que ocupará o campo de formulário\n");
      out.write("                    segunda div -- campo de texto e label \n");
      out.write("                -->\n");
      out.write("                <div class=\"mdl-cell--12-col\"> \n");
      out.write("                    <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                        <input class=\"mdl-textfield__input\" type=\"text\" required  id=\"txtEnunciado\" name=\"txtEnunciado\" />\n");
      out.write("                        <label class=\"mdl-textfield__label\" for=\"txtEnunciado\">Enunciado</label>\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"mdl-cell--12-col\"> \n");
      out.write("                    <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                        <input class=\"mdl-textfield__input\" type=\"text\" required  id=\"txtEnunciado\" name=\"txtNivel\" />\n");
      out.write("                        <label class=\"mdl-textfield__label\" for=\"txtNivel\">Nível</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"mdl-cell--12-col\"> \n");
      out.write("                    <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                        <input class=\"mdl-textfield__input\" type=\"text\" required  id=\"txtA\" name=\"txtA\" />\n");
      out.write("                        <label class=\"mdl-textfield__label\" for=\"txtA\">A</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mdl-cell--12-col\"> \n");
      out.write("                    <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                        <input class=\"mdl-textfield__input\" type=\"text\" required  id=\"txtB\" name=\"txtB\" />\n");
      out.write("                        <label class=\"mdl-textfield__label\" for=\"txtB\">B</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mdl-cell--12-col\"> \n");
      out.write("                    <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                        <input class=\"mdl-textfield__input\" type=\"text\" required  id=\"txtC\" name=\"txtC\" />\n");
      out.write("                        <label class=\"mdl-textfield__label\" for=\"txtC\">C</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mdl-cell--12-col\"> \n");
      out.write("                    <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                        <input class=\"mdl-textfield__input\" type=\"text\" required  id=\"txtD\" name=\"txtD\" />\n");
      out.write("                        <label class=\"mdl-textfield__label\" for=\"txtD\">D</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mdl-cell--12-col\"> \n");
      out.write("                    <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                        <input class=\"mdl-textfield__input\" type=\"text\" required  id=\"txtCerta\" name=\"txtCerta\" />\n");
      out.write("                        <label class=\"mdl-textfield__label\" for=\"txtCerta\">Certa</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mdl-cell--12-col\">\n");
      out.write("                    <div class=\"mdl-select mdl-js-select mdl-select--floating-label\">\n");
      out.write("                        <select class=\"mdl-select__input\" id=\"txtCerta\" name=\"txtCategoria\" name=\"txtCategoria\">\n");
      out.write("                            <option value=\"\"></option>\n");
      out.write("                            ");
                                for (Categoria c : clista) {
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(c.getId());
      out.write('"');
      out.write('>');
      out.print(c);
      out.write("</option>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                        <label class=\"mdl-select__label\" for=\"txtCerta\">Selecione a categoria</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                      \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"mdl-cell--12-col\">\n");
      out.write("\n");
      out.write("                    <button type=\"submit\" class=\"mdl-button mdl-js-button mdl-button--fab mdl-button--mini-fab mdl-button--colored\">\n");
      out.write("                        <i class=\"material-icons\">save</i></button>\n");
      out.write("                    <button type=\"reset\" class=\"mdl-button mdl-js-button mdl-button--fab mdl-button--mini-fab mdl-button--colored\">\n");
      out.write("                        <i class=\"material-icons\">clear</i></button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write(" \n");
      out.write("<section class=\"section--footer mdl-color--white mdl-grid\">\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("</div>\n");
      out.write("<div class=\"mdl-layout__tab-panel\" id=\"features\">\n");
      out.write("    <section class=\"section--center mdl-grid mdl-grid--no-spacing\">\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer class=\"mdl-mega-footer\">\n");
      out.write("    <div class=\"mdl-mega-footer--middle-section\">\n");
      out.write("        bla bla blá\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("</main>\n");
      out.write("</div>\n");
      out.write("<script src=\"../mdl/material.min.js\"></script>\n");
      out.write("<script src=\"../mdl/jquery-2.1.4.min.js\"></script>\n");
      out.write("<script src=\"../mdl/complemento.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
