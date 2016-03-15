/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disccrud;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author isaburov
 */
public class DiscCrud {

        private static Connection mysqlcon;
        public static Connection conDB(){
            if (mysqlcon==null){
                try{
                    String DB = "jdbc:mysql://localhost:3306/discservice";
                    String user = "root";
                    String pass = "root";
                    
                    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                    Connection Connection = null;
                    mysqlcon = (Connection);
                    DriverManager.getConnection(DB, user, pass);
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Connection failed");
                }
            }
            return mysqlcon;
        }
    
}
