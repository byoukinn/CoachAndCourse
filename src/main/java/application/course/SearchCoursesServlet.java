package application.course;

import application.pub.BaseServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SearchCoursesServlet extends BaseServlet {

    @Override
    protected void Handle(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String json = req.getParameter("json");

    }
}