/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportbeans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.servlet.ServletContext;

/**
 *
 * @author nmohamed
 */
public class Subject {
    private String[] id;
    private String name;
    private List<String> objectives;

    public List<String> getObjectives() {
        return objectives;
    }

    public void setObjectives(List<String> objectives) {
        this.objectives = objectives;
    }
    Connection cn;
    private ServletContext servlet;
    
   
    public String[] getId() {
        return id;
    }

    public void setId(String[] id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String fetchName(int id, Connection cn)
    { String subjectName = null ;
        try {
            
             Statement st = cn.createStatement();
             
            String consulta = "SELECT Title FROM AH_ZAF.dbo.Courses where CourseID = "+id;
            ResultSet rs = st.executeQuery(consulta);
          
            while (rs.next())
            {
                subjectName = rs.getString("Title");
                
            }
            //this.finalize();
            
        } catch (SQLException ex) {
            System.out.println("Error : " + ex);
        }
       
        return subjectName;
    
    }   
    
}
