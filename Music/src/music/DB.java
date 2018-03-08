/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 package music;
import java.sql.*;
/**
 *
 * @author student
 */
public class DB {
    String driver;
    String dbname;
    String uname;
    String password;
    Connection con=null;
    String url;
    
    DB()
    {
        this.driver="com.mysql.jdbc.Driver";
        this.dbname="music";
        this.uname="root";
        this.password="";
        this.url="jdbc:mysql://localhost/";
    }
    DB(String d,String dname,String user,String pass,String u)
    {
        this.driver=d;
        this.dbname=dname;
        this.uname=user;
        this.password=pass;
        this.url=u;
    }
    
    public Connection getConnector()
    {
        try 
        {
		//  System.out.println("\n status : Trying to establish Connectiopn with data base..............");
            Class.forName(driver).newInstance();
                // System.out.println("\n status : Driver Resistred Successfully...............");
            con= DriverManager.getConnection(url+dbname,uname,password);
                // System.out.println("\n status : Connected to the data base............");
            
        } 
        catch (Exception e) 
        {
            e.getMessage();
           // e.printStackTrace();
        }
        
        return con;
    }
    
    
    
    
}
