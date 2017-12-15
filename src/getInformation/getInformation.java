/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getInformation;

import java.sql.SQLException;
import java.util.Collection;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import reportbeans.BeanWithList;
import reportbeans.DataFactory;
import static reportbeans.DataFactory.getDataSource;

/**
 *
 * @author nmohamed
 */
public class getInformation{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        Collection result = DataFactory.getDataSource();
      
    }
    
}
