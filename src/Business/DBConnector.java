package Business;

/**
 *
 * @author Payden Boughton
 */
public class DBConnector {

//EDUPE
    private final String LOGIN = "3934";
    private final String PASSWORD = "paydenboughton";
    private final String URL = "jdbc:mysql://devry.edupe.net:4300/cis355a_3934";
    private final String STATEMENT = "SELECT CustomerName,CustomerAddress,FlooringType,FloorArea,FloorCost FROM flooring";
    private final String INSERT = "insert into flooring (CustomerName, CustomerAddress, FlooringType, FloorArea, FloorCost) values(?,?,?,?,?)";

    /*
 //my local database
private final String login = "root";
private final String password = "";
private final String url = "jdbc:mysql://localhost:3306/cis355a";
     */
    public DBConnector() {
    }

    public String getlogin() {
        return LOGIN;
    }

    public String getpassword() {
        return PASSWORD;
    }

    public String geturl() {
        return URL;
    }

    public String statementQuery() {
        return STATEMENT;
    }

    public String insertQuery() {
        return INSERT;
    }

}
