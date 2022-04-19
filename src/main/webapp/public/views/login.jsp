<%--
  Created by IntelliJ IDEA.
  User: Tsetso
  Date: 2.3.2022 г.
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="components/head.jsp"/>
<body>

    <main>
        <div class="container">

            <h1>Влезте в системата</h1>
            <div class="panel">

                <jsp:include page="components/alerts.jsp"/>

                <form method="post" action="<%=request.getContextPath()%>/login">

                    <div class="form-group">
                        <label for="username">Потребителско име:</label>
                        <input type="text" id="username" name="username" class="form-control" placeholder="Въведете потребителско име">
                    </div>

                    <div class="form-group">
                        <label for="password">Парола:</label>
                        <input type="text" id="password" name="password" class="form-control" placeholder="Въведете парола с поне 8 символа">
                    </div>

                    <div class="form-group">
                        <input type="submit" value="Вход">
                    </div>

                </form>

                <div class="text-center">
                    <a class="text-center" href="<%=request.getContextPath()%>/login">Забравена парола</a>
                    <p class="mb-0">Нямате профил? <a href="<%=request.getContextPath()%>/register">Регистрирайте се</a></p>
                </div>

            </div>
        </div>
    </main>
</body>
</html>
