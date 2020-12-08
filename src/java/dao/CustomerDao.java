/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Customer;

/**
 *
 * @author George.Pasparakis
 */
public class CustomerDao extends Database implements ICustomerDao {
    private Database db;
//    Connection con;
//    Statement statement;
//    PreparedStatement prStatement;
//    ResultSet rs;
    
//    public CustomerDao() {
//        super();
//    }
//    
    @Override
    public int insert(Customer customer, String tableName) {
        if(db == null) db = new Database();
        // INSERT INTO `customers`(first_name, last_name, tel, email) 
        // VALUES("John", "Johnakos", "2111111", "j@j.jjj")
        int result = 0;
        StringBuilder sb = new StringBuilder();
        
        sb.append("INSERT INTO ");
        sb.append("`"); sb.append(tableName); sb.append("`");
        sb.append("(`first_name`, `last_name`, `tel`, `email`)");
        sb.append(" VALUES(");
        sb.append("\""); sb.append(customer.getFirstName()); sb.append("\""); sb.append(",");
        sb.append("\""); sb.append(customer.getLastName()); sb.append("\""); sb.append(",");
        sb.append("\""); sb.append(customer.getTel()); sb.append("\""); sb.append(",");
        sb.append("\""); sb.append(customer.getEmail()); sb.append("\"");
        sb.append(")");
        try {
            //        System.out.println(sb.toString());
            if(con != null) {
                statement = con.createStatement();
                System.out.println(sb.toString());
                result = statement.executeUpdate(sb.toString());
            }
            else System.out.println("Connection problems!");
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return(result);
        
    }

    @Override
    public int update(int customerId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(String firstName, String lastName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int customerId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer getCustomerById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
