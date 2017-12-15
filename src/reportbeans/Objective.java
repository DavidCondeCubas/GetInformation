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
import javax.servlet.ServletContext;


/**
 *
 * @author nmohamed
 */
public class Objective {
    private String[] id;
    private String name;
 Connection cn;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    private ServletContext servlet;
    private String description;
      
//      private ServletContext servlet;
    
   
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
 public String fetchName(int id,Connection cn)
    { String subName = null ;
       try {
           Statement st = cn.createStatement();
             
           String consulta = "SELECT name FROM public.objective where id = "+id;
           ResultSet rs = st.executeQuery(consulta);
         
            while (rs.next())
            {
                subName = rs.getString("name");
                
            }
            //this.finalize();
            
       } catch (SQLException ex) {
            System.out.println("Error reading objectives: " + ex);
        }
       
        return subName;
    
    }   
}
