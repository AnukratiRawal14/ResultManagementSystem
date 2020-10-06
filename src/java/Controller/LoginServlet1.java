
package Controller;

import Dao.ResultDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet1 extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{       
        PrintWriter out = response.getWriter();
        String username,password;
        username = request.getParameter("txtname");
        password = request.getParameter("txtpassword");
        out.println("<html>");
        out.println("<head><title>User Login Result</title></head>");
        out.println("<body>");
        out.println("<center>");
        ResultDao rd = new ResultDao();
        try {
            if (username == null || password == null) {
                out.print("username or passwpord are null please check.");
                
            }else {
                  if(rd.checklogin(username, password)){
                         response.sendRedirect("SearchResult.html"); 
                         out.println("Login Successfully done!!");
                }else {
                      out.println("<body style= \"background-image: url('imag/laptop.jpg');background-repeat:repeat;\">");
                      out.println("<img src = imag/LOGO.png>");  
                      out.println("<br><br><br> <font size=5 style= bold align= center color=darkblue> Login Failed ! Try Again.. </font> ");
                      out.println("<br><br> <a href='loginPage.html'><font size=5 style=bold color=darkblue>Login Again </a></font>");
                      out.println("</center>");
                      out.println("</body>");
                      out.println("</html>");
                }
            }
        } catch (Exception e){
            out.println(e);
        }
    }
}

   