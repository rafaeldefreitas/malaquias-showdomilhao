package org.apache.jsp.admin.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Jogador;
import dao.JogadorDAO;

public final class cadastro_005fok_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String msg="";
    if(request.getParameter("txtCadastrarLogin") == null || request.getParameter("txtCadastrarSenha") == null || request.getParameter("txtCadastrarEmail") == null){
        response.sendRedirect("index.jsp");
    }
    else{
        String login = request.getParameter("txtCadastrarLogin");
        String senha = request.getParameter("txtCadastrarSenha");
        String email = request.getParameter("txtCadastrarEmail");
        JogadorDAO dao = new JogadorDAO();
        Jogador obj = new Jogador();
        
        obj.setLogin(login);
        obj.setSenha(senha);
        obj.setEmail(email);
        try{
            dao.incluir(obj);
            msg="Registro realizado com sucesso!";
        }
        catch(Exception ex){
            msg="ERRO AO CADASTRAR";
        }
    }

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Show do Milhão</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>");
      out.print(msg);
      out.write("</h1>\n");
      out.write("          <a href=\"pergunta.jsp\">Iniciar Jogo</a>\n");
      out.write("          <a href=\"index.jsp\">Sair</a>\n");
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
