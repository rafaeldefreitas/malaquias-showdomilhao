<%@page import="modelo.Jogador"%>
<%@page import="dao.JogadorDAO"%>
<%@include file="../cabecalho.jsp"%>

<%
    String msg = "";
    if(request.getParameter("txtLogin")== null)
    {
        response.sendRedirect("../jogador/list.jsp");
    }
   


String login = request.getParameter("txtLogin");
String email = request.getParameter("txtEmail");
String senha = request.getParameter("txtSenha");
String foto = request.getParameter("txtFoto");

//Buscar o registro pela chave primária
//Alterar os demais valores (nesse caso apenas Nome)
//mandar alterar
JogadorDAO dao = new JogadorDAO();
//busquei o professor pelo siape (registro pela C.Primária)
Jogador obj = dao.buscarPorChavePrimaria(login);
//Se não encontrou o registro volta pra lista
if(obj == null)
{
    response.sendRedirect("list.jsp");
    return;
}
//Atualizar as demais informações enviadas
obj.setLogin(login);
obj.setEmail(email);
obj.setSenha(senha);
obj.setFoto(foto);

dao.alterar(obj);



%>


<section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text ">
            <h4>Atualizar</h4>
            <p>Registro atualizado com sucesso.</p>
            <a href="list.jsp"><i class="material-icons">list</i></a>
            
        </div>

    </div>

</section>

<%@include file="../rodape.jsp"%>

