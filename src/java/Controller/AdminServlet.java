
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdminServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdminServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        PrintWriter out=response.getWriter();
        String username , password;
        username = request.getParameter("txtname");
        password = request.getParameter("txtpassword");
        
        out.println("<html>");
        out.println("<head><title>User Login Result</title></head>");      
        out.println("<body bgcolor=lightgreen>");
        
        out.println("<marquee> This is Admin Page</marquee>");
        
        if ( username.equals("aitr") && password.equals("1234") ) {
             //           out.println("you are valid user");
                    response.sendRedirect("Admin.html");   
        }else{
               out.println("<font color=red size=10> INVALID USER... Check Username And Password</font>");
       }
        out.println("</body>");
        out.println("</html>");
    }
    }
   