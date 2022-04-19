<%--
  Created by IntelliJ IDEA.
  User: Tsetso
  Date: 2.3.2022 г.
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="components/head.jsp"/>
<body>

    <main>
        <div class="container">
            <h1>Създаване на профил</h1>
            <div class="panel">

                <jsp:include page="components/alerts.jsp"/>

                <form method="post" action="<%=request.getContextPath()%>/register">

                    <div class="form-group">
                        <label for="username">Потребителско име:</label>
                        <input type="text" id="username" name="username" class="form-control" placeholder="Въведете потребителско име">
                    </div>

                    <div class="form-group">
                        <label for="password">Парола:</label>
                        <input type="password" id="password" name="password" class="form-control" placeholder="Въведете парола с поне 8 символа">
                    </div>

                    <div class="form-group">
                        <label for="passwordR">Повторете паролата</label>
                        <input type="password" id="passwordR" name="passwordR" class="form-control" placeholder="Въведете парола с поне 8 символа">
                    </div>

                    <div class="form-group">
                        <input type="submit" value="Регистрация">
                    </div>

                </form>

                <div class="text-center">
                    <p class="mb-0">Вече имате профил? <a href="<%=request.getContextPath()%>/login">Логнете се</a></p>
                </div>

            </div>
        </div>
    </main>
</body>
</html>
