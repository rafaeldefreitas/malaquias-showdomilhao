package org.apache.jsp.admin.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Jogador;

public final class jogo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");

    if(session.getAttribute("jogador")==null){
     response.sendRedirect("index.jsp");
   }
    
    Jogador jogador = new Jogador();
    if(session.getAttribute("jogador") == null)
    {
        if(request.getParameter("jogador") != null)
        {
             jogador = new Jogador();
            jogador.setLogin("anônimo");
            session.setAttribute("jogador", jogador);
        }
    }
    else
    {
         jogador = (Jogador)session.getAttribute("jogador");
    }
    
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Show do Milhão</title>\n");
      out.write("          <link rel=\"stylesheet\" href=\"css/estilo.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"usuario\">\n");
      out.write("       \n");
      out.write("        </div>\n");
      out.write("        <div class=\"centralizar\">\n");
      out.write("            <img src=\"img/show.png\" alt=\"\"/>\n");
      out.write("            <br/>\n");
      out.write("            \n");
      out.write("            <a href=\"pergunta.jsp\">Iniciar Jogo</a>\n");
      out.write("            <a href=\"index.jsp?sair=OK\">Sair</a>\n");
      out.write("            ");

            if(request.getParameter("sair")!=null){
     session.setAttribute("usuarioAdmin", null);
    }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
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
