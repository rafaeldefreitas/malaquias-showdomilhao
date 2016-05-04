<%@page import="modelo.Categoria"%>
<%@page import="dao.CategoriaDAO"%>
<%
    String msg = "";
    if(request.getParameter("txtId")== null)
    {
        response.sendRedirect("../categoria/list.jsp");
        return;
    }
   

        String nome = request.getParameter("txtNome");
        String id = request.getParameter("txtId");
       
        CategoriaDAO dao = new CategoriaDAO();
        Categoria obj = dao.buscarPorChavePrimaria(Integer.parseInt(id));
//Se não encontrou o registro volta pra lista
if(obj == null)
{
    response.sendRedirect("list.jsp");
    return;
}
//Atualizar as demais informações enviadas
obj.setNome(nome);
obj.setId(Integer.parseInt(id));
dao.alterar(obj);



%>
<%@include file="../cabecalho.jsp"%>


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

