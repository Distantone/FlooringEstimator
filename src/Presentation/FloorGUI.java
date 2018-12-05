package Presentation;




import Business.Query;
import Business.DBConnector;
import Business.DataIO;
import Business.Floor;
import Business.requireErrors;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Payden Boughton
 */
public class FloorGUI extends javax.swing.JFrame {

    double myLength, myWidth, cost, Total, floorArea;
    String floorType,cName,cAddr;
    
    /*******DEBUG*******/
    Boolean DEBUG = false;
    /*******************/
    

    
    //create objects
    Floor floor = new Floor();
    requireErrors RE = new requireErrors();
    
    DataIO data = new DataIO();
    
    
    public FloorGUI() {
        initComponents();
        //centers the GUI
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupFloor = new javax.swing.ButtonGroup();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addrTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        woodRadBtn = new javax.swing.JRadioButton();
        carpetRadBtn = new javax.swing.JRadioButton();
        btnCalc = new javax.swing.JButton();
        widTextField = new javax.swing.JTextField();
        lenTextField = new javax.swing.JTextField();
        lblLength = new javax.swing.JLabel();
        lblWidth = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        costTextField = new javax.swing.JTextField();
        btnOrder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaOrderSummary = new javax.swing.JTextArea();
        lblSummary = new javax.swing.JLabel();
        areaTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblFloorEstimatorLogo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnGit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Please Enter Your Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Please Enter Your Address");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addrTextField))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Customer Information", jPanel1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please Select Floor Type");

        btnGroupFloor.add(woodRadBtn);
        woodRadBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        woodRadBtn.setText("Wood $20 sq.ft");

        btnGroupFloor.add(carpetRadBtn);
        carpetRadBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        carpetRadBtn.setText("Carpet $10 sq.ft");

        btnCalc.setText("Calculate");
        btnCalc.setDoubleBuffered(true);
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        lblLength.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLength.setText("Enter Length");

        lblWidth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblWidth.setText("Enter Width");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLength)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(carpetRadBtn)
                                            .addComponent(jLabel1)
                                            .addComponent(woodRadBtn)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(261, 261, 261)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblWidth)
                                            .addComponent(widTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(woodRadBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carpetRadBtn)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLength)
                    .addComponent(lblWidth))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(widTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Floor Type Selector", jPanel2);

        costTextField.setEditable(false);

        btnOrder.setText("Place Order");
        btnOrder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOrder.setPreferredSize(new java.awt.Dimension(90, 25));
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        txaOrderSummary.setEditable(false);
        txaOrderSummary.setColumns(20);
        txaOrderSummary.setRows(5);
        jScrollPane2.setViewportView(txaOrderSummary);

        lblSummary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSummary.setText("Order Summary");

        areaTextField.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Floor Area");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Floor Cost");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(areaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(costTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 178, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblSummary))
                    .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(174, 174, 174))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSummary)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Order", jPanel3);

        lblFloorEstimatorLogo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFloorEstimatorLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/icon.png"))); // NOI18N
        lblFloorEstimatorLogo.setText("Flooring Estimator");

        jMenu1.setText("Help");

        btnGit.setText("Git ReadMe");
        btnGit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGitActionPerformed(evt);
            }
        });
        jMenu1.add(btnGit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblFloorEstimatorLogo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jTabbedPane6)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblFloorEstimatorLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // DONE add your handling code here:
        if(floorArea == 0){
            JOptionPane.showMessageDialog(rootPane, "Please Calulate your Total");
        }
        else{
        //grab variables from textfields
        cName = nameTextField.getText();
        cAddr = addrTextField.getText();
        myLength = Double.parseDouble(lenTextField.getText());
        myWidth = Double.parseDouble(widTextField.getText());
        
            if (nameTextField.getText().isEmpty())
            {
                RE.getNameError();
                nameTextField.requestFocus();
                return;
            }
            if (addrTextField.getText().isEmpty())
            {
                RE.getaddrError();
                addrTextField.requestFocus();
                return;
            }
            if (lenTextField.getText().isEmpty())
            {
                lenTextField.requestFocus();
                return;
            }
            if (widTextField.getText().isEmpty())
            {
                widTextField.requestFocus();
                return;
            }

            //check if none are selected
            if(!carpetRadBtn.isSelected() && !woodRadBtn.isSelected())
            {
                RE.neitherSelected();
                return;
            }
            
        //send data to dataIO class
        data.setName(cName);
        data.setAddr(cAddr);
        //save the data
        try{
        data.saveData();
        }   catch (SQLException ex) { 
                Logger.getLogger(FloorGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        //calls orderSum method
        orderSum(cName,cAddr,floorType,floorArea,Total);
        }
        
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnGitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGitActionPerformed
        //links to github
        try { 
         String url = "https://github.com/Distantone/FlooringCalculator/tree/master/src";
         java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
       }
       catch (java.io.IOException e) {
           System.out.println(e.getMessage());
       }
    }//GEN-LAST:event_btnGitActionPerformed

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // DONE add your handling code here:

        //grab myLength and myWidth from the textfields then convert string to double on mylength and myWidth
        myLength = Double.parseDouble(lenTextField.getText());
        myWidth = Double.parseDouble(widTextField.getText());
        //double checking that buttons are selected or not or even if both (shouln not happen but o well)
        if (carpetRadBtn.isSelected())
        {
            cost = 10;
            floorType = "Carpet";
        }
        if (woodRadBtn.isSelected())
        {
            cost = 20;
            floorType = "Wood";
        }

        //check if none are selected
        if(!carpetRadBtn.isSelected() && !woodRadBtn.isSelected())
        {
            RE.neitherSelected();
        }
        if (lenTextField.getText().isEmpty())
        {
            return;
        }
        if (widTextField.getText().isEmpty())
        {
            return;
        }

        //set everything up to be calculated
        floor.setLength(myLength);
        floor.setWidth(myWidth);
        //calulate area
        floorArea = floor.getArea();
        //set the text for area
        areaTextField.setText("" + floorArea);
        //send area to data
        data.setfArea(floorArea);
        //getting the total cost with the area
        Total = floor.getArea() * cost;

        //set variables for data
        data.setfType(floorType);
        data.setTotalCost(Total);
        //formatting and converting total to a string
        String TotalAsString = String.format("%.2f", Total);
        //set the total
        costTextField.setText("$" + TotalAsString);

        if (DEBUG == true)
        debugGo();
        JOptionPane.showMessageDialog(rootPane, "Total Has been Calculated on Order Tab");
    }//GEN-LAST:event_btnCalcActionPerformed

    public void orderSum(String name,String addr,String fType, double fArea, double totalCost){
        //displays customer data in order summary
        txaOrderSummary.setText(
        "Customer: " + name + "\n"
        + "Customer Address: " + addr + "\n"       
        + "Floor Type: " + fType +"\n"
        + "Floor Area: " + fArea + "\n"
        + "Floor Cost: " + totalCost + "\n"       
        );
    }
    
    public void checkVariables(double myLength, double myWidth, double area, double Total,double cost,String floorType) {
       //for debugging purposes
        System.out.println("Length : " + myLength);
        System.out.println("Width : " + myWidth);
        System.out.println("area: " + area);
        System.out.println("Total : " + Total);
        System.out.println("floor cost: " + cost);
        System.out.println("floor floorType: " + floorType);
    }
    
    public void debugGo (){
    double debugarea = floor.getArea();
    checkVariables(myLength,myWidth,debugarea,Total,cost,floorType);              
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FloorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FloorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FloorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FloorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FloorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addrTextField;
    private javax.swing.JTextField areaTextField;
    private javax.swing.JButton btnCalc;
    private javax.swing.JMenuItem btnGit;
    private javax.swing.ButtonGroup btnGroupFloor;
    private javax.swing.JButton btnOrder;
    private javax.swing.JRadioButton carpetRadBtn;
    private javax.swing.JTextField costTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JLabel lblFloorEstimatorLogo;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblSummary;
    private javax.swing.JLabel lblWidth;
    private javax.swing.JTextField lenTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextArea txaOrderSummary;
    private javax.swing.JTextField widTextField;
    private javax.swing.JRadioButton woodRadBtn;
    // End of variables declaration//GEN-END:variables
}
