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
 * Created by Lenovo on 7/19/2016.
 */
@WebServlet(urlPatterns = "/signup", name = "WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        User temp = UserStorage.findByName(login);
        String page_to_dispatch = null;
        if(temp!=null) {
            if (login.equals(temp.getLogin()) && password.equals(temp.getPassword())) {
                page_to_dispatch = "/views/welcome.jsp";
            }else {
                request.setAttribute("again", true);
                page_to_dispatch = "/views/index.jsp";
            }
        }else {
            request.setAttribute("again", true);
            page_to_dispatch = "/views/index.jsp";
        }
        request.getRequestDispatcher(page_to_dispatch).forward(request, response);




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
