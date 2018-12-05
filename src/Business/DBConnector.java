package Business;

/**
 *
 * @author Payden Boughton
 */
public class DBConnector {

//EDUPE

private final String login = "3934";
private final String password = "paydenboughton";
private final String url = "jdbc:mysql://devry.edupe.net:4300/cis355a_3934";
    /*
 //my local database
private final String login = "root";
private final String password = "mylove922";
private final String url = "jdbc:mysql://localhost:3306/cis355a";
 */

    public DBConnector(){}
    
    public String getlogin()
    {
        return login;
    }
    public String getpassword()
    {
        return password;
    }
    public String geturl()
    {
        return url;
    }
    
}
