package ru.grave.servlets;

import ru.grave.form.User;
import ru.grave.store.UserStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Lenovo on 7/21/2016.
 */
@WebServlet(urlPatterns = "/views/registration", name = "RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page_to_display = "/views/index.jsp";
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String firstname = request.getParameter("firstname");
        String secondname = request.getParameter("secondname");
        String language = request.getParameter("language");
        User user = UserStorage.findByName(login);
        if(user!=null || login.isEmpty()|| password.isEmpty() ){
            request.setAttribute("again", true);
        }else {
            UserStorage.UserToDB(login,password,language,firstname,secondname);
        }

        response.sendRedirect(request.getContextPath());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
