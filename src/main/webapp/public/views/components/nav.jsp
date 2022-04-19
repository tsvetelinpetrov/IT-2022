<%--
  Created by IntelliJ IDEA.
  User: Tsetso
  Date: 19.4.2022 г.
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<nav>
    <div class="p-40">
        <a class="button-y" href="<%= request.getContextPath()%>">Вход</a>
        <a class="button-y" href="register">Регистрация</a>
        <a class="button-y" href="users">Потребители</a>
        <form action="logout" method="post" class="d-l-b">
            <input class="imputhover" style="background-color: #ffb606; color: #012e5e; width: auto;" type="submit" value="Изход" />
        </form>
    </div>
</nav>

