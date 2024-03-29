package assignmentsubmission;

import java.sql.*;
import java.util.*;
 class stu {
    private int sid;
    private String sname;
    
    public stu(String sname,String loc){
        this.sname=sname;
       
        
    }
    public stu(int sid,String sname){
        this.sid=sid;
        }
    
    public String getname(){
        return sname;
        }
    public int getsid(){
          return sid;
      }
      
      
      
}