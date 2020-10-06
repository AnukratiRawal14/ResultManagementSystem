
package Controller;

import Dao.ResultDao;
import Model.Result;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Year;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Delete2Servlet1 extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Delete2Servlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Delete2Servlet1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
            PrintWriter out = response.getWriter();
            out.println("<body style= \"background-image: url('imag/laptop.jpg');background-repeat:repeat;\">");
            out.println("<img src = \"imag/LOGO.png\">");
            out.println("<a href=DeletetResult.html class=button ><h2 align=left><font color=darkblue >Back</h2></a></font>");
            try{
                    ResultDao rd=new ResultDao();
                    rd.deleteByS_idy2(0, 0);
                     out.println("Record Deleted.....");
                     
             }catch(Exception e){
              out.println(e);
             }
      }
    
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       
         PrintWriter out = response.getWriter();
        try{  
                 
               out.println("<body style= \"background-image: url('imag/laptop.jpg');background-repeat:repeat;\">");
               out.println("<img src = \"imag/LOGO.png\">");
                
               out.println("<html>");
               out.println("<head>");
               out.println("<title>Servlet SearchServlet</title>");            
               out.println("</head>");
               out.println("<body>");  
                
               int S_id,Year;
               S_id = Integer.parseInt(request.getParameter("S_id"));   
               Year=Integer.parseInt(request.getParameter("Year"));  
             
               ResultDao rd=new ResultDao();
               Result r;
               r=rd.searchByS_idy2d(S_id,Year);
               if(r==null){
                       out.println("<center><font color=red size=8>Record Not Found.......</center></font>");
                       
              }else {      
                              out.println("<center>");
                              out.println("<font color=darkblue size=6>Student Result</font>");
                              out.println("<br><br><br>");
                              out.println("<table border=3>");
                             
                              out.println("<tr>");
                              out.println("<th>Student-Id</th> ");
                              out.println("<td>" +r.getS_id()+ "</td>");          
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
                             
                            
                              out.println("<form method=get action=Delete2Servlet1>");
                              out.println("<td><input type=submit value=Delete></td>");
                              
                              out.println("</form>");
                              out.println("</tr>");
                              out.println("</table>");
                              out.println("</center>");
                              out.println("</body>");
                              out.println("</html>");
            
              }
       }     catch(Exception e) {
                out.println(e);
            }
   }   
}

   

   

   