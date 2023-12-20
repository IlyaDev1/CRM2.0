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

@WebServlet("/Lid/index")
public class IndexServlet extends HttpServlet {
     
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        ArrayList<LidObject> lids = LidDB.select();
        request.setAttribute("lids", lids);

        request.getRequestDispatcher("/Lid/index.jsp").forward(request, response);
    }
}