<%@page import="modelo.Jogador"%>
<%@page import="dao.JogadorDAO"%>
<%
    if(request.getParameter("sair")!=null){
     session.setAttribute("jogador", null);
    }
    String mensagem="";
    if(request.getParameter("txtEntrarLogin")!= null && 
            request.getParameter("txtEntrarSenha")!= null)
    { 
        if(!request.getParameter("txtEntrarLogin").isEmpty() && !request.getParameter("txtEntrarSenha").isEmpty()){    
        JogadorDAO dao = new JogadorDAO();
        Jogador jogador;
        //variável com o usuário logado
        String login = request.getParameter("txtEntrarLogin");
        String senha =  request.getParameter("txtEntrarSenha");
        jogador = dao.realizarLogin(login, senha);
         if(jogador != null ){
             //Crio a sessão do usuário
            session.setAttribute("jogador", jogador);
            //redirecionar para a página inicial
            response.sendRedirect("pergunta.jsp");
        }
        else{
            mensagem ="Dados incorretos";
            
        }
    }
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show do Milhão</title>
        <link rel="stylesheet" href="css/estilo.css"/>
    </head>
    <body>
        <div class="centralizar">
            <img src="img/show.png"/>
        </div>
        <div class="inicialformulario">
            <h4>Entrar</h4>
            <form action="index.jsp" method="post">
                <label>Login:</label>
                <input type="text" name="txtEntrarLogin"
                       /><br/>
                <label>Senha</label>
                <input type="text" name="txtEntrarSenha"
                       /><br/>
                <input type="submit" value="Entrar" />
               <a href="jogo.jsp?jogador=anonimo">Pular login</a>
            </form>
            <div class="centralizar">
                <hr/>
                ou
                <hr/>
            </div>
            <h4>Cadastre-se</h4>
            
            <form action="cadastro_ok.jsp" method="post">
                <label>Login:</label>
                <input type="text" name="txtCadastrarLogin"/><br/>
                <label>Senha</label>
                <input type="text" name="txtCadastrarSenha"/><br/>
                <label>Email</label>
                <input type="text" name="txtCadastrarEmail"/><br/>
                <label>Foto</label>
                <input type="text" name="txtCadastrarFoto"/><br/>
                
                <br/>
                <input type="submit" value="Cadastrar" /> 
            </form>
        </div>
    </body> 
</html>
