<%@page import="util.Upload"%>
<%@page import="modelo.Jogador"%>
<%@page import="dao.JogadorDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
    if(session.getAttribute("jogador")==null){
     response.sendRedirect("index.jsp");
   }
      if(request.getParameter("txtCadastrarLogin")== null){
          response.sendRedirect("index.jsp");
      }
        String login = request.getParameter("txtCadastrarLogin");
        String senha = request.getParameter("txtCadastrarSenha");
        String email = request.getParameter("txtCadastrarEmail");
        String foto = request.getParameter("txtCadastrarFoto");
        JogadorDAO dao = new JogadorDAO();
        Jogador obj = new Jogador();
       
        obj.setLogin(login);
        obj.setSenha(senha);
        obj.setEmail(email);
        obj.setFoto(foto);
        
        
       
        
            dao.incluir(obj);
         
  
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show do Milhão</title>
        <link rel="stylesheet" href="css/estilo.css"/>
    </head>
    <body>
        <h1>Cadastro realizado com sucesso !</h1>
          <a href="index.jsp">Voltar a tela inicial</a>
        
    </body>
</html>
    