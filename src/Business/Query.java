package Business;

/**
 *
 * @author Payden Boughton
 */
public class Query {
    private final String statement = "SELECT CustomerName,CustomerAddress,FlooringType,FloorArea,FloorCost FROM flooring";
    private final String insert = "insert into flooring (CustomerName, CustomerAddress, FlooringType, FloorArea, FloorCost) values(?,?,?,?,?)";
    
    public Query()
    {
    }
    
    public String statementQuery()
    {
        return statement;
    }
    public String insertQuery()
    {
        return insert;
    }
}
