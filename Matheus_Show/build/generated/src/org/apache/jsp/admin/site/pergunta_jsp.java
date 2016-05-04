package org.apache.jsp.admin.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Jogador;
import dao.JogadorDAO;
import modelo.Jogo;
import java.util.ArrayList;
import modelo.Pergunta;
import java.util.List;
import dao.PerguntaDAO;

public final class pergunta_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

   Jogo jogo = new Jogo();
   PerguntaDAO dao = new PerguntaDAO();
   List<Pergunta> lista =dao.listar();
   jogo.setListapergunta(lista);
   session.setAttribute("jogo", jogo);
   Pergunta pergunta = jogo.getListapergunta().get(0);
   Jogador jogador = (Jogador)session.getAttribute("jogador");
   JogadorDAO jogdao = new JogadorDAO();
   

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Show do Milhão</title>\n");
      out.write("          <link rel=\"stylesheet\" href=\"css/estilo.css\"/>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"pergunta\">\n");
      out.write("            <h4 class=\"enunciado\">");
      out.print(pergunta);
      out.write("</h4>\n");
      out.write("            <div class=\"opcoes\">\n");
      out.write("                <form action=\"fim.jsp\" method=\"post\">\n");
      out.write("                    <input type=\"radio\" value=\"A\" name=\"rdoPergunta\" />\n");
      out.write("                    ");
      out.print(pergunta.getA());
      out.write("<br/>\n");
      out.write("                    <input type=\"radio\" value=\"B\" name=\"rdoPergunta\" />\n");
      out.write("                    ");
      out.print(pergunta.getB());
      out.write("<br/>\n");
      out.write("                    <input type=\"radio\" value=\"C\" name=\"rdoPergunta\" />\n");
      out.write("                    ");
      out.print(pergunta.getC());
      out.write("<br/>\n");
      out.write("                    <input type=\"radio\" value=\"D\" name=\"rdoPergunta\" />\n");
      out.write("                    ");
      out.print(pergunta.getD());
      out.write("<br/>\n");
      out.write("                    <hr/>\n");
      out.write("                    <input type=\"submit\" value=\"confirmar\" />\n");
      out.write("                     <input type=\"submit\" value=\"pular\" />(");
      out.print(jogo.getPulos());
      out.write(")\n");
      out.write("                      <input type=\"submit\" value=\"parar\" />\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"painelUsuario\">\n");
      out.write("            ");
      out.print(jogador.getLogin());
      out.write("<br />\n");
      out.write("            ");
      out.print(jogo.getErro());
      out.write(" errar<br/>\n");
      out.write("            ");
      out.print(jogo.getPontuacao());
      out.write(" parar<br/>\n");
      out.write("            ");
      out.print(jogo.getAcerto());
      out.write(" acertar<br/>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" ");
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
