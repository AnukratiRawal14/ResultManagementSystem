
package Controller;

import Dao.ResultDao;
import Model.Result;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchAll3 extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SearchAll3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchAll3 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        {
          PrintWriter out = response.getWriter();
          out.println("<body style= \"background-image: url('imag/laptop.jpg');background-repeat:repeat;\">");
           out.println("<img src = \"imag/LOGO.png\">");
        try
        {
             out.println("<html>");
             out.println("<head>");
             out.println("<title>3rd  Year</title>");            
             out.println("</head>");
             out.println("<body>");
             out.println("<a href=SearchAll.html class=button ><h2 align=left><font color=darkblue >Back</h2></a></font>");
             out.println("<center>");
             ResultDao rd=new ResultDao();
             List<Result>mylist=new ArrayList <Result>();
             mylist=rd.searchAll3();
             out.println("<font color=darkblue size=6>Result : 3rd  Year </font>");   
             out.println("<br><br>");
             out.println("<table border=3>");
             out.println("<tr>");
             out.println("<th>Student-Id</th><th>Year</th><th>BT301</th><th>BT302</th><th>BT303</th><th>BT304</th><th>BT305</th><th>Total_Marks</th><th>Marks_Obtained</th><th>Status</th>");
             out.println("</tr>");
              for(Result r:mylist)
             {
                out.println("<tr>");
                out.println("<td>" +r.getS_id()+ "</td>"); 
                out.println("<td>" +r.getYear()+ "</td>");
                out.println("<td>" +r.getBT301()+ "</td>");
                out.println("<td>" +r.getBT302()+ "</td>");
                out.println("<td>" +r.getBT303()+ "</td>");
                out.println("<td>" +r.getBT304()+ "</td>");
                out.println("<td>" +r.getBT305()+ "</td>");
                out.println("<td>" +r.getTotal_Marks()+ "</td>");
                out.println("<td>" +r.getMarks_Obtained()+ "</td>");
                out.println("<td>" +r.getStatus()+ "</td>");
                out.println("</tr>");   
            }    
            out.println("</table>");    
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");

    }
           catch(Exception e)
           {
              out.println(e);
           }    
    }
    }

 

    }

 