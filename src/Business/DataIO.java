/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author dista
 */
public class DataIO{
    String name;
    String addr;
    String fType;
    double fArea;
    double totalCost;
    double length, width;
    

    public DataIO(){
        
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddr(){
        return addr;
    }

    public void setAddr(String addr){
        this.addr = addr;
    }

    public void setfType(String fType){
        this.fType = fType;
    }
    
    public String getfType(){
        return fType;
    }

    public double getfArea(){
        return fArea;
    }

    public void setfArea(double fArea){
        this.fArea = fArea;
    }

    public double getTotalCost(){
        return totalCost;
    }

    public void setTotalCost(double totalCost){
        this.totalCost = totalCost;
    }


    
    
    
    
    public void saveData() throws SQLException{
        DBConnector db = new DBConnector();
        Query query = new Query();
        //login information
        String login = db.getlogin();
        String password = db.getpassword();
        String url = db.geturl();
        
        
        Connection conn = null;
        PreparedStatement insertStmt;
        String insertQuery = query.insertQuery();
        
        //set connection
            conn = DriverManager.getConnection(url, login, password);
  
        insertStmt = conn.prepareStatement(insertQuery);
        //fill in the user data
        insertStmt.setString(1, name);
        insertStmt.setString(2, addr);
        insertStmt.setString(3, fType);
        insertStmt.setDouble(4, fArea);
        insertStmt.setDouble(5, totalCost);
        //execute the insert statement
        insertStmt.execute();
        System.out.println("SUCESS New Row Added");
            
            //close the connection to database
            conn.close();
    }
    
    
}

