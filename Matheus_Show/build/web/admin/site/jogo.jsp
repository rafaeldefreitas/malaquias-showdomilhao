
<%@page import="modelo.Jogador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
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
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show do Milhão</title>
          <link rel="stylesheet" href="css/estilo.css"/>
    </head>
    <body>
        <div class="usuario">
       
        </div>
        <div class="centralizar">
            <img src="img/show.png" alt=""/>
            <br/>
            
            <a href="pergunta.jsp">Iniciar Jogo</a>
            <a href="index.jsp?sair=OK">Sair</a>
            <%
            if(request.getParameter("sair")!=null){
     session.setAttribute("usuarioAdmin", null);
    }
            %>
        </div>
        
    </body>
</html>
