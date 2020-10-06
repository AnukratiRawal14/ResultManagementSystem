
package Controller;
import Dao.ResultDao;
import Model.Result;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SearchServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SearchServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchServlet at " + request.getContextPath() + "</h1>");
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
            throws ServletException, IOException 
    {
        
         PrintWriter out = response.getWriter();
    try
       {   
            out.println("<html>");
            out.println("<head>");
            out.println("<title>SearchServlet</title>");            
            out.println("</head>");
           
            out.println("<body style= \"background-image: url('imag/laptop.jpg');background-repeat:repeat;\">");
            out.println("<img src = \"imag/LOGO.png\">");
            out.println("<a href=SearchResult.html class=button ><h2 align=left><font color=darkblue >Back</h2></a></font>");
            out.println("<a href=loginPage.html class=button ><h2 align=right><font color=darkblue >Logout</h2></a></font>");
            int S_id , Year;
            S_id = Integer.parseInt(request.getParameter("S_id"));
            Year = Integer.parseInt(request.getParameter("Year"));
            ResultDao rd = new ResultDao();
            Result r = new Result();
             if(!rd.searchByS_id(S_id, Year))
             {  
                 out.println("<Marquee>INVALID Student_Id and Year</Marquee");
             }  
             else if(Year==3)
                     {
                         r=rd.searchByS_idy3(S_id, Year);
                         if (r==null){
                             out.println("<Center><font color=red size=8>Record Not Found......</Center>)</font>"); }
                         else
                         {
                             out.println("<center>");
                             out.println("<font color=darkblue size=6>Student Result</font>");
                             out.println("<br><br><br>");
                             out.println("<table border=2>");
                             out.println("<tr>");
                             out.println("<th>Student-Id</th> ");
                             out.println("<td>" +r.getS_id()+ "</td>");          
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>Name</th>");
                             out.println("<td>" +r.getS_name()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>Course</th> ");
                             out.println("<td>" +r.getCourse()+ "</td>");
                             out.println("</tr");
                             
                             out.println("<tr>");
                             out.println("<th>Branch</th>");
                             out.println("<td>" +r.getBranch()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>Year</th>");
                             out.println("<td>" +r.getYear()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>Section</th>");
                             out.println("<td>" +r.getSection()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>BT301</th>");
                             out.println("<td>" +r.getBT301()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>BT302</th>");
                             out.println("<td>" +r.getBT302()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>BT303</th>");
                             out.println("<td>" +r.getBT303()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>BT304</th>");
                             out.println("<td>" +r.getBT304()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>BT305</th>");
                             out.println("<td>" +r.getBT305()+"</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println(" <th>Total_Marks</th>");
                             out.println("<td>" +r.getTotal_Marks()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>Marks_Obtained</th>");
                             out.println("<td>" +r.getMarks_Obtained()+"</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>Status</th>");
                             out.println("<td>" +r.getStatus()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("</tr>");
                             out.println("</table>");
                             out.println("</center>");
                         }
                     }
                     else if(Year==4)
                     {
                         r=rd.searchByS_idy4(S_id, Year);
                         if (r==null){
                             out.println("<Center><font color=red size=8>Record Not Found......</Center></font>"); }
                         else
                         {
                             out.println("<center>");
                             out.println("<font color=darkblue size=6>Student Result</font>");
                             out.println("<br><br><br>");
                             out.println("<table border=3>");
                             
                             out.println("<tr>");
                             out.println("<th>Student-Id</th> ");
                             out.println("<td>" +r.getS_id()+ "</td>");          
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>Name</th>");
                             out.println("<td>" +r.getS_name()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>Course</th> ");
                             out.println("<td>" +r.getCourse()+ "</td>");
                             out.println("</tr");
                             
                             out.println("<tr>");
                             out.println("<th>Branch</th>");
                             out.println("<td>" +r.getBranch()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>Year</th>");
                             out.println("<td>" +r.getYear()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>Section</th>");
                             out.println("<td>" +r.getSection()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>BT401</th>");
                             out.println("<td>" +r.getBT401()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>BT402</th>");
                             out.println("<td>" +r.getBT402()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>BT403</th>");
                             out.println("<td>" +r.getBT403()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>BT404</th>");
                             out.println("<td>" +r.getBT404()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>BT405</th>");
                             out.println("<td>" +r.getBT405()+"</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println(" <th>Total_Marks</th>");
                             out.println("<td>" +r.getTotal_Marks()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>Marks_Obtained</th>");
                             out.println("<td>" +r.getMarks_Obtained()+"</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>Status</th>");
                             out.println("<td>" +r.getStatus()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("</tr>");
                             out.println("</table>");
                             out.println("</center>");
                         }
                         
                     }
                         else if(Year==2)
                         {
                          r=rd.searchByS_idy2(S_id, Year);
                         if (r==null){
                             out.println("<Center><font color=red size=8>Record Not Found......</Center></font>"); }
                         else
                         {
                             out.println("<center>");
                             out.println("<font color=darkblue size=6>Student Result</font>");
                             out.println("<br><br><br>");
                             out.println("<table border=2>");
                             
                             out.println("<tr>");
                             out.println("<th>Student-Id</th> ");
                             out.println("<td>" +r.getS_id()+ "</td>");          
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>Name</th>");
                             out.println("<td>" +r.getS_name()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>Course</th> ");
                             out.println("<td>" +r.getCourse()+ "</td>");
                             out.println("</tr");
                             
                             out.println("<tr>");
                             out.println("<th>Branch</th>");
                             out.println("<td>" +r.getBranch()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>Year</th>");
                             out.println("<td>" +r.getYear()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>Section</th>");
                             out.println("<td>" +r.getSection()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>BT201</th>");
                             out.println("<td>" +r.getBT201()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>BT202</th>");
                             out.println("<td>" +r.getBT202()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>BT203</th>");
                             out.println("<td>" +r.getBT203()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>BT204</th>");
                             out.println("<td>" +r.getBT204()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>BT205</th>");
                             out.println("<td>" +r.getBT205()+"</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println(" <th>Total_Marks</th>");
                             out.println("<td>" +r.getTotal_Marks()+ "</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>Marks_Obtained</th>");
                             out.println("<td>" +r.getMarks_Obtained()+"</td>");
                             out.println("</tr>");
                             
                             out.println("<tr>");
                             out.println("<th>Status</th>");
                             out.println("<td>" +r.getStatus()+ "</td>");
                             out.println("</tr>");
                             
                             
                             out.println("</tr>");
                             out.println("</table>");
                             out.println("</center>");
                         }
           }
                 out.println("</body>");
                 out.println("</html>");
             }
           
       catch (Exception e)
                {
                  out.println(e);
                 }
    }   
}