
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


public class SearchAll2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SearchAll2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchAll2 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
       PrintWriter out = response.getWriter();
          out.println("<body style= \"background-image: url('imag/laptop.jpg');background-repeat:repeat;\">");
           out.println("<img src = \"imag/LOGO.png\">");
        try
        {
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Result Of 2nd Year </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<a href=SearchAll.html class=button ><h2 align=left><font color=darkblue >Back</h2></a></font>");
            out.println("<center>");
            ResultDao rd=new ResultDao();
            List<Result>mylist=new ArrayList <Result>();
            mylist=rd.searchAll2();
            out.println("<font color=darkblue size=6>Result : 2nd  Year </font>");   
            out.println("<br><br>");
            out.println("<table border=3>");
            out.println("<tr>");
            out.println("<th>Student-Id</th><th>Year</th><th>BT201</th><th>BT202</th><th>BT203</th><th>BT204</th><th>BT205</th><th>Total_Marks</th><th>Marks_Obtained</th><th>Status</th>");
            out.println("</tr>");
            for(Result r:mylist)
            {
            out.println("<tr>");
            out.println("<td>" +r.getS_id()+ "</td>"); 
            out.println("<td>" +r.getYear()+ "</td>");
            out.println("<td>" +r.getBT201()+ "</td>");
            out.println("<td>" +r.getBT202()+ "</td>");
            out.println("<td>" +r.getBT203()+ "</td>");
            out.println("<td>" +r.getBT204()+ "</td>");
            out.println("<td>" +r.getBT205()+ "</td>");
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

 
