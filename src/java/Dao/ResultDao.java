
package Dao;

import Connection.MyCon;
import Model.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class ResultDao

{

    public boolean checklogin(String username, String password) throws Exception{
        
        String sql;
        Connection con = null;
        sql = "select * from checklogin where username =? and password =?";
        PreparedStatement ps = null;
        con = MyCon.getConnection();
        if (con == null) {
           throw new Exception(" Exception connection is null");     
        } 
        ps = con.prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = null;
        rs = ps.executeQuery();
        if(rs.next())
            return true;
        else
            return false;
      } 

    
    
        public boolean searchByS_id(int S_id, int Year)throws Exception{
            
        String sql;
        Connection con = null;
        sql = "select * from student where ?=S_id and ?=Year";
        PreparedStatement ps = null;
        con = MyCon.getConnection();
        ps =  con.prepareStatement(sql);
        ps.setInt(1, S_id);
        ps.setInt(2, Year);
        ResultSet rs = null;
        rs = ps.executeQuery();
        if(rs.next())
              return true;
        else
            return false;
        
    }
        
        public Result searchByS_idy2d(int S_id, int Year)throws Exception  {
        String sql;
        Connection con = null;
        PreparedStatement ps = null;
        con = MyCon.getConnection();
        sql = "select * from 2year where S_id=? and Year=?";
        ps =  con.prepareStatement(sql);
        ps.setInt(1, S_id);
        ps.setInt(2, Year);
        ResultSet rs = null;
        rs = ps.executeQuery();
        Result r=new Result();
        if(rs.next())
        {     
                r.setS_id(rs.getInt(1));
                r.setYear(rs.getInt(2));
                r.setBT201(rs.getInt(3));
                r.setBT202(rs.getInt(4));
                r.setBT203(rs.getInt(5));
                r.setBT204(rs.getInt(6));
                r.setBT205(rs.getInt(7));
                r.setTotal_Marks(rs.getInt(8));
                r.setMarks_Obtained(rs.getInt(9));
                r.setStatus(rs.getString(10));
          } 
       else
       {
           r=null;
       }    
        
       return r;

        }
        
        
        public Result searchByS_idy3d(int S_id, int Year)throws Exception  {
        String sql;
        Connection con = null;
        PreparedStatement ps = null;
        con = MyCon.getConnection();
        sql = "select * from 3year where S_id=? and Year=?";
        ps =  con.prepareStatement(sql);
        ps.setInt(1, S_id);
        ps.setInt(2, Year);
        ResultSet rs = null;
        rs = ps.executeQuery();
        Result r=new Result();
        if(rs.next())
        {     
                r.setS_id(rs.getInt(1)); 
                r.setYear(rs.getInt(2));
                r.setBT301(rs.getInt(3));
                r.setBT302(rs.getInt(4));
                r.setBT303(rs.getInt(5));
                r.setBT304(rs.getInt(6));
                r.setBT305(rs.getInt(7));
                r.setTotal_Marks(rs.getInt(8));
                r.setMarks_Obtained(rs.getInt(9));
                r.setStatus(rs.getString(10));
          } 
       else
       {
           r=null;
       }    
        
       return r;
 }
           
            
        public Result searchByS_idy4d(int S_id, int Year)throws Exception  {
        String sql;
        Connection con = null;
        PreparedStatement ps = null;
        con = MyCon.getConnection();
        sql = "select * from 4year  where S_id=? and Year=?";
        ps =  con.prepareStatement(sql);
        ps.setInt(1, S_id);
        ps.setInt(2, Year);
        ResultSet rs = null;
        rs = ps.executeQuery();
        Result r=new Result();
        if(rs.next())
        {     
                r.setS_id(rs.getInt(1));
                r.setYear(rs.getInt(2));
                r.setBT401(rs.getInt(3));
                r.setBT402(rs.getInt(4));
                r.setBT403(rs.getInt(5));
                r.setBT404(rs.getInt(6));
                r.setBT405(rs.getInt(7));
                r.setTotal_Marks(rs.getInt(8));
                r.setMarks_Obtained(rs.getInt(9));
                r.setStatus(rs.getString(10));
          } 
       else
       {
           r=null;
       }    
        
       return r;
       }
        
    
       public Result searchByS_idy2(int S_id,int Year) throws SQLException  {
        Connection con=null;
        ResultSet rs=null;
        PreparedStatement ps=null;
        con=MyCon.getConnection();
        String sql;
        sql="(select student.S_id,student.S_name,student.Course,student.Branch,student.Year,student.Section,2year.S_id,2year.BT201,2year.BT202,2year.BT203,2year.BT204,2year.BT205,2year.Total_Marks,2year.Marks_Obtained,2year.Status from student join 2year ON student.S_id=2year.S_id where student.S_id =?)"; 
        ps=con.prepareStatement(sql);
        ps.setInt(1,S_id);
        rs=ps.executeQuery();
        Result r=new Result();
        if(rs.next())
        {
                r.setS_id(rs.getInt(1));
                r.setS_name(rs.getString(2));
                r.setCourse(rs.getString(3));
                r.setBranch(rs.getString(4));
                r.setYear(rs.getInt(5));
                r.setSection(rs.getInt(6));
                r.setBT201(rs.getInt(7));
                r.setBT202(rs.getInt(8));
                r.setBT203(rs.getInt(9));
                r.setBT204(rs.getInt(10));
                r.setBT205(rs.getInt(11));
                r.setTotal_Marks(rs.getInt(12));
                r.setMarks_Obtained(rs.getInt(13));
                r.setStatus(rs.getString(14));
        } 
        else
        {
           r=null;
       }    
        return r;
       }
       
       
       public Result searchByS_idy3(int S_id,int Year) throws SQLException {
        Connection con=null;
        ResultSet rs=null;
        PreparedStatement ps=null;
        con=MyCon.getConnection();
        String sql;
        sql="(select student.S_id,student.S_name,student.Course,student.Branch,student.Year,student.Section,3year.S_id,3year.BT301,3year.BT302,3year.BT303,3year.BT304,3year.BT305,3year.Total_Marks,3year.Marks_Obtained,3year.Status from student join 3year ON student.S_id=3year.S_id where student.S_id =?)";     
        ps=con.prepareStatement(sql);
        ps.setInt(1,S_id);
        rs=ps.executeQuery();
        Result r=new Result();
        if(rs.next())
        {
           r.setS_id(rs.getInt(1));
           r.setS_name(rs.getString(2));
           r.setCourse(rs.getString(3));
           r.setBranch(rs.getString(4));
           r.setYear(rs.getInt(5));
           r.setSection(rs.getInt(6));
           r.setBT301(rs.getInt(7));
           r.setBT302(rs.getInt(8));
           r.setBT303(rs.getInt(9));
           r.setBT304(rs.getInt(10));
           r.setBT305(rs.getInt(11));
           r.setTotal_Marks(rs.getInt(12));
           r.setMarks_Obtained(rs.getInt(13));
           r.setStatus(rs.getString(14));
        } 
       else
       {
           r=null;
       }    
       return r;
    }
      
       public Result searchByS_idy4(int S_id,int Year) throws SQLException  {
        Connection con=null;
        ResultSet rs=null;
        PreparedStatement ps=null;
        con=MyCon.getConnection();
        String sql;
        sql="(select student.S_id,student.S_name,student.Course,student.Branch,student.Year,student.Section,4year.S_id,4year.BT401,4year.BT402,4year.BT403,4year.BT404,4year.BT405,4year.Total_Marks,4year.Marks_Obtained,4year.Status from student join 4year ON student.S_id=4year.S_id where student.S_id =?)";     
        ps=con.prepareStatement(sql);
        ps.setInt(1,S_id);
        rs=ps.executeQuery();
        Result r=new Result();
        if(rs.next())
        {
           r.setS_id(rs.getInt(1));
           r.setS_name(rs.getString(2));
           r.setCourse(rs.getString(3));
           r.setBranch(rs.getString(4));
           r.setYear(rs.getInt(5));
           r.setSection(rs.getInt(6));
           r.setBT401(rs.getInt(7));
           r.setBT402(rs.getInt(8));
           r.setBT403(rs.getInt(9));
           r.setBT404(rs.getInt(10));
           r.setBT405(rs.getInt(11));
           r.setTotal_Marks(rs.getInt(12));
           r.setMarks_Obtained(rs.getInt(13));
           r.setStatus(rs.getString(14));
     
        } 
        else
       {
           r=null;
       }    
        return r;
      }
       
       public int InsertResulty2(Result r) throws SQLException    {
         Connection con=null;
         ResultSet rs=null;
         PreparedStatement ps=null;
         con=MyCon.getConnection();
         String sql;  
         sql="insert into 2year values(?,?,?,?,?,?,?,?,?,?)";
         ps=con.prepareStatement(sql);
         ps.setInt(1, r.getS_id());
         ps.setInt(2, r.getYear());
         ps.setInt(3, r.getBT201());
         ps.setInt(4, r.getBT202());
         ps.setInt(5, r.getBT203());
         ps.setInt(6, r.getBT204());
         ps.setInt(7, r.getBT205());
         ps.setInt(8, r.getTotal_Marks());
         ps.setInt(9, r.getMarks_Obtained());
         ps.setString(10, r.getStatus());
           int n=0; 
         n=ps.executeUpdate();
 //           System.out.println("Record Inserted........ " + n);
        return(n);
      }      
      
   
       public int InsertResulty3(Result r) throws SQLException  {
         Connection con=null;
         ResultSet rs=null;
         PreparedStatement ps=null;
         con=MyCon.getConnection();
         String sql;   
         sql="insert into 3year values(?,?,?,?,?,?,?,?,?,?)";
         ps=con.prepareStatement(sql);
         ps.setInt(1,r.getS_id());
         ps.setInt(2,r.getYear());
         ps.setInt(3,r.getBT301());
         ps.setInt(4,r.getBT302());
         ps.setInt(5,r.getBT303());
         ps.setInt(6,r.getBT304());
         ps.setInt(7,r.getBT305());
         ps.setInt(8,r.getTotal_Marks());
         ps.setInt(9,r.getMarks_Obtained());
         ps.setString(10,r.getStatus());
           int n=0; 
         n=ps.executeUpdate();
 //           System.out.println("Record Inserted........ " + n);
        return(n);
      }   
      
       public int InsertResulty4(Result r) throws SQLException  {     
         Connection con=null;
         ResultSet rs=null;
         PreparedStatement ps=null;
         con=MyCon.getConnection();
         String sql; 
         sql="insert into 4year values(?,?,?,?,?,?,?,?,?,?)";
         ps=con.prepareStatement(sql);
         ps.setInt(1, r.getS_id());
         ps.setInt(2 ,r.getYear());
         ps.setInt(3, r.getBT401());
         ps.setInt(4, r.getBT402());
         ps.setInt(5, r.getBT403());
         ps.setInt(6, r.getBT404());
         ps.setInt(7, r.getBT405());
         ps.setInt(8, r.getTotal_Marks());
         ps.setInt(9, r.getMarks_Obtained());
         ps.setString(10, r.getStatus());
           int n=0; 
         n=ps.executeUpdate();
 //           System.out.println("Record Inserted........ " + n);
        return(n);
      }     
       
       
       public List<Result> searchAll2()throws SQLException {
        Connection con=null;
        ResultSet rs=null;
        PreparedStatement ps=null;
        con=MyCon.getConnection();
        String sql;
        sql="select * from 2year";
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        List<Result>mylist=new ArrayList<Result>();
        while(rs.next())
        {
             Result r=new Result();
             r.setS_id(rs.getInt(1));
             r.setYear(rs.getInt(2));
             r.setBT201(rs.getInt(3));
             r.setBT202(rs.getInt(4));
             r.setBT203(rs.getInt(5));
             r.setBT204(rs.getInt(6));
             r.setBT205(rs.getInt(7));
             r.setTotal_Marks(rs.getInt(8));
             r.setMarks_Obtained(rs.getInt(9));
             r.setStatus(rs.getString(10));
             mylist.add(r);
                r=null;
        }    
        return mylist;
       }
          
        public List<Result> searchAll3()throws SQLException  {
         Connection con=null;
         ResultSet rs=null;
         PreparedStatement ps=null;
         con=MyCon.getConnection();
         String sql;
         sql="select * from 3year";
         ps=con.prepareStatement(sql);
         rs=ps.executeQuery();
         List<Result>mylist=new ArrayList<Result>();
         while(rs.next())
           {
                Result r=new Result();
                r.setS_id(rs.getInt(1));
                r.setYear(rs.getInt(2));
                r.setBT301(rs.getInt(3));
                r.setBT302(rs.getInt(4));
                r.setBT303(rs.getInt(5));
                r.setBT304(rs.getInt(6));
                r.setBT305(rs.getInt(7));
                r.setTotal_Marks(rs.getInt(8));
                r.setMarks_Obtained(rs.getInt(9));
                r.setStatus(rs.getString(10));
                mylist.add(r);
                r=null;
           }    
       return mylist;
     }
            
        
       public List<Result> searchAll4()throws SQLException  {
         Connection con=null;
         ResultSet rs=null;
         PreparedStatement ps=null;
         con=MyCon.getConnection();
         String sql;
         sql="select * from 4year";
         ps=con.prepareStatement(sql);
         rs=ps.executeQuery();
         List<Result>mylist=new ArrayList<Result>();
          while(rs.next())
           {
                Result r=new Result();     
                r.setS_id(rs.getInt(1));
                r.setYear(rs.getInt(2));
                r.setBT401(rs.getInt(3));
                r.setBT402(rs.getInt(4));
                r.setBT403(rs.getInt(5));
                r.setBT404(rs.getInt(6));
                r.setBT405(rs.getInt(7));
                r.setTotal_Marks(rs.getInt(8));
                r.setMarks_Obtained(rs.getInt(9));
                r.setStatus(rs.getString(10));
                mylist.add(r);
                r=null;
         }    
        return mylist;
      }
        
       public int deleteByS_idy2( int S_id,int Year)throws SQLException  {
        Connection con=null;
        ResultSet rs=null;
        PreparedStatement ps=null;
        con=MyCon.getConnection();
        String sql;
        sql="delete from 2year where S_id=? and Year=?";
        ps=con.prepareStatement(sql);
        ps.setInt(1, S_id);
        ps.setInt(2,Year);
        int n=0;
        n=ps.executeUpdate();
   //     if(n>0)
    //     System.out.println("Record deleted........");
          return(n);
       }
          
       public int deleteByS_idy3( int S_id,int Year)throws SQLException {
        Connection con=null;
        ResultSet rs=null;
        PreparedStatement ps=null;
        con=MyCon.getConnection();
        String sql;
        sql="delete from 3year where S_id=? and Year=?";
        ps=con.prepareStatement(sql);
        ps.setInt(1, S_id);
        ps.setInt(2, Year);
        int n=0;
        n=ps.executeUpdate();
     //   if(n>0)
   //          System.out.println("Record deleted........");
         return(n);
        }
     
       public int deleteByS_idy4(int S_id,int Year)throws SQLException  {
        Connection con=null;
        ResultSet rs=null;
        PreparedStatement ps=null;
        con=MyCon.getConnection();
        String sql;
        sql="delete from 4year where S_id=? and Year=?";
        ps=con.prepareStatement(sql);
        ps.setInt(1, S_id);
        ps.setInt(2,Year);
        int n=0;
         n=ps.executeUpdate();
     //   if(n>0)
     //        System.out.println("Record deleted........");
      return(n);
     }
}