
<%@page import="modelo.Categoria"%>
<%@page import="dao.CategoriaDAO"%>
<%
    if (request.getParameter("id") == null) {
        response.sendRedirect("../categoria/list.jsp");
    } else {
        //Buscar o registro(professor) a partir da sua
        //chave primária, nesse caso o SIAPE
      String id = request.getParameter("id");
        Integer iden = Integer.parseInt(id);
        
        CategoriaDAO dao = new CategoriaDAO();
      
        Categoria obj = dao.buscarPorChavePrimaria(iden);
        //verificar se o registro existe, se não existir, volta pra lista
        if (obj == null) {
            response.sendRedirect("../categoria/list.jsp");
            return;

        }
%>

<%@include file="../cabecalho.jsp"%>


<section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text">
            <h4>Categoria - Atualizar</h4>
            <form action="upd-ok.jsp" method="post">
                <!-- 
                    primeira div -- área que ocupará o campo de formulário
                    segunda div -- campo de texto e label 
                -->
                
                <div class="mdl-cell--12-col"> 
                    <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                        <input class="mdl-textfield__input" type="text" required  id="txtId"name="txtId"value="<%=obj.getId()%>" readonly="readonly"/>
                        <label class="mdl-textfield__label" for="txtId">ID</label>
                    </div>
                </div>
                <div class="mdl-cell--12-col"> 
                    <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                        <input class="mdl-textfield__input" type="text" required  id="txtNome"name="txtNome"value="<%=obj.getNome()%>" />
                        <label class="mdl-textfield__label" for="txtNome">Nome</label>
                    </div>
                </div>
                <div class="mdl-cell--12-col">
                    
                    <button type="submit" class="mdl-button mdl-js-button mdl-button--fab mdl-button--mini-fab mdl-button--colored">
                    <i class="material-icons">save</i></button>
                    <button type="reset" class="mdl-button mdl-js-button mdl-button--fab mdl-button--mini-fab mdl-button--colored">
                    <i class="material-icons">clear</i></button>
                    
                    
                </div>
            </form>
        </div>
                         <%
                                }
                        %>

    </div>

</section>

<%@include file="../rodape.jsp"%>


