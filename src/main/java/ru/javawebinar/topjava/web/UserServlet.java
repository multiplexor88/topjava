package ru.javawebinar.topjava.web;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author idumchykov
 * @since 15.05.17
 */
@Slf4j
public class UserServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Redirect");
        request.getRequestDispatcher("/users.jsp").forward(request, response);
    }
}
