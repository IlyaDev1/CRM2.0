package lidservlet;


import java.io.IOException;
import java.util.ArrayList;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lidpackage.LidObject;
import lidpackage.LidDB;
 
@WebServlet("/Lid/create")
public class CreateServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
 
        getServletContext().getRequestDispatcher("/Lid/create.jsp").forward(request, response);
    }
     
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
 
        try {
            String name = request.getParameter("name");
            int old = Integer.parseInt(request.getParameter("old"));
            String subject = request.getParameter("subject");

            LidObject lid = new LidObject(name, old, subject);
            LidDB.insert(lid);
            response.sendRedirect(request.getContextPath()+"/Lid/index.jsp");
        }
        catch(Exception ex) {
             
            getServletContext().getRequestDispatcher("/Lid/create.jsp").forward(request, response); 
        }
    }
}