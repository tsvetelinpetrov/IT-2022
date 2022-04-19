<%@ page import="sit.tu_varna.bg.models.User" %><%--
  Created by IntelliJ IDEA.
  User: Tsetso
  Date: 2.3.2022 г.
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="components/head.jsp"/>
<body>

<%
    User user = (User) request.getAttribute("user");
    User sessionUser = (User) session.getAttribute("user");

%>

    <main>

        <jsp:include page="components/nav.jsp"/>

        <div class="container mt-20 mb-20">

            <div class="profile-info">
                <div class="avatar">
                    <img src="<%=request.getContextPath()%>/public/src/images/<%= user.getImageName() %>"/>

                </div>

                <div class="bio">
                    <h2>Профилна информация</h2>
                    <p>Име: <%= user.getName() %></p>
                    <p>Работа: <%= user.getJobTitle() %></p>
                    <p>Описание: <%= user.getInfo() %></p>
                </div>
            </div>

            <h2 class="text-center">Умения</h2>
            <div class="card">
                <div class="flex">
                    <div>
                        <h3>Професионални</h3>
                    </div>
                    <div>
                        <h3>Личностни</h3>
                    </div>
                </div>
            </div>

            <h2 class="text-center">Контакти</h2>
            <div class="card">
                <div class="flex">
                    <div>A</div>
                    <div>B</div>
                </div>
            </div>

        </div>

        <footer>

        </footer>
    </main>

</body>
</html>
