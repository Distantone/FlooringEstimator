package Business;

import javax.swing.JOptionPane;

/**
 *
 * @author Payden Boughton
 */
public class requireErrors {
    
  
    public requireErrors()
    {   
    }
    
    public void getNameError()
    {
        JOptionPane.showMessageDialog(null, "Must Enter a Name","Name is Missing",JOptionPane.ERROR_MESSAGE);
                return; //exit
    }
    public void getaddrError()
    {
        JOptionPane.showMessageDialog(null, "Must Enter an Address","Address is Missing",JOptionPane.ERROR_MESSAGE);
                return; //exit
    }
    public void neitherSelected()
    {
        JOptionPane.showMessageDialog(null, "Please select A floor type","No Floor Type Selected",JOptionPane.ERROR_MESSAGE);
                return; //exit
    }
}
