package sit.tu_varna.bg.controllers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.tu_varna.bg.libraries.Validator;
import sit.tu_varna.bg.models.Login;
import sit.tu_varna.bg.models.User;
import sit.tu_varna.bg.repositories.Repository;

import java.io.IOException;

@WebServlet(name = "RegistrationServlet", urlPatterns = {"/register"})
public class RegistrationServlet extends HttpServlet {

    private Repository repository;

    @Override
    public void init() throws ServletException {
        this.repository = Repository.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/public/views/signup.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String passwordR = request.getParameter("passwordR");

        if(username == null || username.isEmpty() || password == null ||
                password.isEmpty() || passwordR == null || passwordR.isEmpty()) {
            HttpSession session = request.getSession(false);
            session.setAttribute("errorMessage","Всички полета са задължителни.");

            doGet(request, response);
        } else if(!password.equals(passwordR)) {
            HttpSession session = request.getSession(false);
            session.setAttribute("errorMessage","Двете пароли не съвпадат.");
            doGet(request, response);
        } else {

            Validator validator = new Validator();
            if(!validator.usernameValidate(username) || !validator.passwordValidate(password)) {
                HttpSession session = request.getSession(false);
                session.setAttribute("errorMessage","Въведените данни са невалидни.");
                doGet(request, response);
            } else {
                User user = new User(null, new Login(username, password));
                if(repository.hasExist(user)) {
                    HttpSession session = request.getSession(false);
                    session.setAttribute("errorMessage","Потребителското име е заето.");
                    doGet(request, response);
                } else {
                    HttpSession session = request.getSession(false);
                    session.setAttribute("successMessage","Регистрацията премина успешно.");

                    repository.addUser(user);
                    response.sendRedirect(request.getContextPath());
                }
            }
        }
    }
}
