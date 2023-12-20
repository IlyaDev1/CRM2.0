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

@WebServlet("/Groups/index")
public class IndexServlet extends HttpServlet {
     
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        ArrayList<GroupObject> groups = GroupDB.select();
        request.setAttribute("groups", groups);

        request.getRequestDispatcher("/Groups/index.jsp").forward(request, response);
    }
}