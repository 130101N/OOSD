
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Charuni
 */
public class DBManager {
    
  
    private final String url       =  "jdbc:mysql://localhost:3306/greeting_db"; 
    private final String user      =  "root"; 
    private final String password  =  "1122"; 

    public Connection connect()throws SQLException, ClassNotFoundException
    {
        
        return DriverManager.getConnection(url, user, password);
    }
}
