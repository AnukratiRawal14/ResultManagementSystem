
package Controller;

import Dao.ResultDao;
import Model.Result;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Insert4yServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Insert3yServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Insert3yServlet at " + request.getContextPath() + "</h1>");
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
           out.println("<body style= \"background-image: url('imag/laptop.jpg');background-repeat:repeat;\">");
           out.println("<img src = \"imag/LOGO.png\">");
           out.println("<a href=InsertResult.html class=button ><h2 align=left><font color=darkblue >Back</h2></a></font>");
      try
      {
                    int  S_id,Year,BT401,BT402,BT403,BT404,BT405,Total_Marks,Marks_Obtained;
                    String Status;
                    
                      S_id=Integer.parseInt(request.getParameter("S_id"));
                      Year=Integer.parseInt(request.getParameter("Year"));
                      BT401=Integer.parseInt(request.getParameter("BT401"));
                      BT402=Integer.parseInt(request.getParameter("BT402"));
                      BT403=Integer.parseInt(request.getParameter("BT403"));
                      BT404=Integer.parseInt(request.getParameter("BT404"));
                      BT405=Integer.parseInt(request.getParameter("BT405"));
                      Total_Marks=Integer.parseInt(request.getParameter("Total_Marks"));
                      Marks_Obtained=Integer.parseInt(request.getParameter("Marks_Obtained"));
                      Status=request.getParameter("Status");
                     
                      Result r=new Result();
                      r.setS_id(S_id);
                      r.setYear(Year);
                      r.setBT401(BT401);
                      r.setBT402(BT402);   
                      r.setBT403(BT403); 
                      r.setBT404(BT404); 
                      r.setBT405(BT405); 
                      r.setTotal_Marks(Total_Marks);
                      r.setMarks_Obtained(Marks_Obtained);
                      r.setStatus(Status);
                       
                      ResultDao rd=new ResultDao();
                     
                      if(rd.InsertResulty4(r)>0)
                    {
                        
                            out.println("<h1 size=5 align=center style=bold color=green>Record Inserted.........</font>");
                    }
             }
    
      catch(Exception e)
       {
           out.println(e);
        }
    }
}

   