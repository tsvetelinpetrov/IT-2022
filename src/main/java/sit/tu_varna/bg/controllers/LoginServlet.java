package sit.tu_varna.bg.controllers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.tu_varna.bg.models.Login;
import sit.tu_varna.bg.models.User;
import sit.tu_varna.bg.repositories.Repository;

import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login", "/index.jsp", "/index.html"})
public class LoginServlet extends HttpServlet {

    private Repository repository;

    @Override
    public void init() throws ServletException {
        repository = Repository.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/public/views/login.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = repository.getUserByLogin(new Login(username, password));
        if(user != null) {
            HttpSession session = request.getSession(true);
            session.setAttribute("user", user);

            response.sendRedirect(String.format(request.getContextPath() + "/user"));
        } else {
            HttpSession session = request.getSession(false);
            session.setAttribute("errorMessage","Не съществува потребител с въведените данни.");

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/public/views/login.jsp");
            requestDispatcher.forward(request, response);
        }
    }
}
