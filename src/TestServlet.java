package servlet;

import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.*;

public class TestServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String couleur = request.getParameter("couleur");
        String nb = request.getParameter("nombre");
        int nombre = Integer.parseInt(nb);
        request.setAttribute("couleur", couleur);
        request.setAttribute("nombre", nombre);
        this.getServletContext().getRequestDispatcher("/detail.jsp").forward(request, response);
    }
}
