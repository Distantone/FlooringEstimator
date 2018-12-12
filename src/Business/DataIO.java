package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Payden Boughton
 */
public class DataIO {

    private String name;
    private String addr;
    private String fType;
    private double fArea;
    private double totalCost;
    private double length, width;

    public DataIO() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setfType(String fType) {
        this.fType = fType;
    }

    public String getfType() {
        return fType;
    }

    public double getfArea() {
        return fArea;
    }

    public void setfArea(double fArea) {
        this.fArea = fArea;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void saveData(Customer C) throws SQLException {
        DBConnector db = new DBConnector();

        //login information
        String login = db.getlogin();
        String password = db.getpassword();
        String url = db.geturl();

        Connection conn = null;
        PreparedStatement insertStmt;
        String insertQuery = db.insertQuery();

        //set connection
        conn = DriverManager.getConnection(url, login, password);

        insertStmt = conn.prepareStatement(insertQuery);
        //fill in the user data
        insertStmt.setString(1, C.getCustomerName());
        insertStmt.setString(2, C.getCustomerAddr());
        insertStmt.setString(3, C.getFloorType());
        insertStmt.setDouble(4, C.getFloorArea());
        insertStmt.setDouble(5, C.getFloorCost());
        //execute the insert statement
        insertStmt.execute();
        System.out.println("SUCCESS New Row Added");

        //close the connection to database
        conn.close();
    }

    public DefaultTableModel loadData() throws SQLException {
        DefaultTableModel model = new DefaultTableModel(new String[]{"CustomerName", "CustomerAddress", "FloorType", "FloorArea", "FloorCost"}, 0);
        DBConnector db = new DBConnector();
        //login information
        String login = db.getlogin();
        String password = db.getpassword();
        String url = db.geturl();

        Connection conn = null;
        //set connection
        conn = DriverManager.getConnection(url, login, password);
        PreparedStatement insertStmt;
        Statement stmt = conn.createStatement();

        ResultSet rs;
        rs = stmt.executeQuery(db.statementQuery());

        //set connection
        conn = DriverManager.getConnection(url, login, password);
        //gather user data
        while (rs.next()) {
            String n = rs.getString("CustomerName");
            String a = rs.getString("CustomerAddress");
            String fT = rs.getString("FlooringType");
            Double fA = rs.getDouble("FloorArea");
            Double fC = rs.getDouble("FloorCost");
            //create a model for proper layout of the table
            model.addRow(new Object[]{n, a, fT, fA, fC});

            //System.out.println(n + a + fT + fA + fC + "");
        }
        //close connection
        conn.close();

        return model;
    }
}
