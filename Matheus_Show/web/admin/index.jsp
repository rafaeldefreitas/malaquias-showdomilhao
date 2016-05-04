
<%
    // sair
    if(request.getParameter("sair")!=null){
     session.setAttribute("usuarioAdmin", null);
    }
    
    //Como fazer um login
    String msg="";
 if(request.getParameter("txtLogin")!=null &&
         request.getParameter("txtSenha")!=null)
 {
   msg ="Tentou fazer o login";
   String login = request.getParameter("txtLogin").toString();
   String senha = request.getParameter("txtSenha").toString();
   if(login.equals("Admin") && senha.equals("Admin"))
   {
       //crio a sessão do usuário Admin
  session.setAttribute("usuarioAdmin",login);
  //rediriciono para a pagn inicial
  response.sendRedirect("home/index_logado.jsp");
   }
   else{
       msg="Errou";
   }
 }
%>
<%@include file="cabecalho-index.jsp"%>


       
        
        <section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text">
         
            
   
          <form action="index.jsp" method="post">
              
                <div>
                <%=msg%>
                </div>
                <div class="mdl-cell--12-col"> 
                    <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                        <input class="mdl-textfield__input" type="text" required  id="txtlogin" name="txtLogin"/>
                        <label class="mdl-textfield__label" for="txtlogin">Login</label>
                    </div>
                </div>
                 <div class="mdl-cell--12-col"> 
                    <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                        <input class="mdl-textfield__input" type="password" required  id="txtsenha" name="txtSenha"/>
                        <label class="mdl-textfield__label" for="txtsenha">Senha</label>
                    </div>
                </div>
               
                
                
                <div class="mdl-cell--12-col">
                    
                    <button type="submit" class="mdl-button mdl-js-button mdl-button--accent" > OK </button>



    </div>
            </form>
</section>

<%@include file="rodape-index.jsp"%>
