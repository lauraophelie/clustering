package servlet;

import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.*;

public class TestServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String couleur = request.getParameter("couleur");
        request.setAttribute("couleur", couleur);
        this.getServletContext().getRequestDispatcher("/detail.jsp").forward(request, response);
    }
}
