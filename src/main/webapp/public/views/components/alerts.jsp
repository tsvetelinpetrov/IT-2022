<%--
  Created by IntelliJ IDEA.
  User: Tsetso
  Date: 19.4.2022 г.
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%if(session.getAttribute("successMessage") != null) {%>
    <div class="alert alert-success">
        <%= session.getAttribute("successMessage") %>
    </div>
    <%session.removeAttribute("successMessage");%>
<%}%>

<%if(session.getAttribute("errorMessage") != null) {%>
    <div class="alert alert-danger">
        <%= session.getAttribute("errorMessage") %>
    </div>
    <%session.removeAttribute("errorMessage");%>
<%}%>


