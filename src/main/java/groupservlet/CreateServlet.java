package groupservlet;


import java.io.IOException;
import java.util.ArrayList;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import grouppackage.GroupObject;
import grouppackage.GroupDB;
 
@WebServlet("/Groups/create")
public class CreateServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
 
        getServletContext().getRequestDispatcher("/Groups/create.jsp").forward(request, response);
    }
     
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
 
        try {
            String schedule = request.getParameter("schedule");
            String subject = request.getParameter("subject");
            
            GroupObject group = new GroupObject(schedule, subject);
            GroupDB.insert(group);
            response.sendRedirect(request.getContextPath()+"/Groups/index.jsp");
        }
        catch(Exception ex) {
             
            getServletContext().getRequestDispatcher("/Groups/create.jsp").forward(request, response); 
        }
    }
}