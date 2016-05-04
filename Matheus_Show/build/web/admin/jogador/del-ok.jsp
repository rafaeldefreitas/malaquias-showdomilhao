<%@page import="dao.JogadorDAO"%>
<%@page import="modelo.Jogador"%>
<%@include file="../cabecalho.jsp"%>

<%
    String msg = "";
    if(request.getParameter("login")== null)
    {
        response.sendRedirect("../jogador/list.jsp");
    }
    else
    {
        String login = request.getParameter("login");
        
        JogadorDAO dao = new JogadorDAO();
        //buscar o registro pela chave prim�ria
        Jogador obj = dao.buscarPorChavePrimaria(login);
        if(obj!=null)
        {
            dao.excluir(obj);
            msg = "Registro exclu�do com sucesso";
        }
        else
        {
            msg = "Registro n�o encontrado. Verifique.";
        }
        
    }
%>


<section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text ">
            <h4>Categoria - Excluir</h4>
            <p>Registro exclu�do com sucesso.</p>
            <a href="list.jsp"><i class="material-icons">list</i></a>
            
        </div>

    </div>

</section>

<%@include file="../rodape.jsp"%>

