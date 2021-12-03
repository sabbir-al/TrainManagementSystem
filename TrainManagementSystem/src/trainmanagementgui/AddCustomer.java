package trainmanagementgui;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wissam
 */
public class AddCustomer extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    myDBCon dbCon;
    ResultSet rs;

   
    public AddCustomer() {
        initComponents();
        
        // center form in screen 
        this.setLocationRelativeTo(null);
        // set all error labels to invisible
        lblFnameError.setVisible(false);
        lblLNameError.setVisible(false);
        lblPhoneError.setVisible(false);
        lblDOBError.setVisible(false);
        lblAddressError.setVisible(false);
        lblUsernameError.setVisible(false);
        lblPasswordError.setVisible(false);
        
        dbCon = new myDBCon();
        getNewData();
    }
    
    private void getNewData() {

        try {
            String str;
            // populate CustomerID field
            rs = dbCon.executeStatementQuery("select MAX(CustomerID) as CustID from CUSTOMER");
            while (rs.next()) {
                str = rs.getString("CustID");
                if (str==null){
                    txtCustNo.setText("1");
                }
                else{
                    int temp = Integer.parseInt(str);
                    txtCustNo.setText(String.valueOf(++temp));
                }
            }

            

        } catch (SQLException e) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Error Generating CustomerID");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCustNo = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        btnAddNewEmp = new javax.swing.JButton();
        txtDOB = new javax.swing.JFormattedTextField();
        lblLNameError = new javax.swing.JLabel();
        lblFnameError = new javax.swing.JLabel();
        lblDOBError = new javax.swing.JLabel();
        lblAddressError = new javax.swing.JLabel();
        lblUsernameError = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblPhoneError = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblPasswordError = new javax.swing.JLabel();
        Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Employee");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Enter Your Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CustomerID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("First Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Last Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Phone Number:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Date of Birth:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Address:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Username:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Password:");

        txtCustNo.setEditable(false);
        txtCustNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCustNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustNoActionPerformed(evt);
            }
        });

        txtFname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtLName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLNameActionPerformed(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnAddNewEmp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddNewEmp.setText("Sign Up");
        btnAddNewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewEmpActionPerformed(evt);
            }
        });

        txtDOB.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MMM-yyyy"))));
        txtDOB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblLNameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblLNameError.setForeground(new java.awt.Color(255, 0, 0));
        lblLNameError.setText("error label");

        lblFnameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblFnameError.setForeground(new java.awt.Color(255, 0, 0));
        lblFnameError.setText("error label");

        lblDOBError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblDOBError.setForeground(new java.awt.Color(255, 0, 0));
        lblDOBError.setText("error label");

        lblAddressError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblAddressError.setForeground(new java.awt.Color(255, 0, 0));
        lblAddressError.setText("error label");

        lblUsernameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblUsernameError.setForeground(new java.awt.Color(255, 0, 0));
        lblUsernameError.setText("error label");

        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        lblPhoneError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblPhoneError.setForeground(new java.awt.Color(255, 0, 0));
        lblPhoneError.setText("error label");

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblPasswordError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        lblPasswordError.setText("error label");

        Close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trainmanagementgui/close.png"))); // NOI18N
        Close.setText("Cancel");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFname, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtLName)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtAddress)
                                    .addComponent(txtDOB)
                                    .addComponent(txtPhone)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblFnameError, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(lblLNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDOBError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAddressError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblUsernameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPhoneError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtCustNo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(btnAddNewEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Close)))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCustNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFnameError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLNameError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDOBError, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddressError))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsernameError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPasswordError))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddNewEmp)
                    .addComponent(Close))
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLNameActionPerformed

    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    
    //clears alll the error labels
    void clearErrorLabels() {
        lblFnameError.setText("");
        lblFnameError.setVisible(false);
        lblLNameError.setText("");
        lblLNameError.setVisible(false);
        lblDOBError.setText("");
        lblDOBError.setVisible(false);
        lblAddressError.setText("");
        lblAddressError.setVisible(false);
        lblUsernameError.setText("");
        lblUsernameError.setVisible(false);
        lblPasswordError.setText("");
        lblPasswordError.setVisible(false);
        lblPhoneError.setText("");
        lblPhoneError.setVisible(false);

    }

    boolean isValidData() {

        clearErrorLabels(); //clears all error labels
        boolean result = true;
        

        if (txtFname.getText().trim().isEmpty() || (txtFname.getText().trim().length() > 25)) {
            if (txtFname.getText().trim().isEmpty()) {
                lblFnameError.setText("Invalid. Cannot be empty.");
            } else if ((txtFname.getText().trim().length() > 25)) {
                lblFnameError.setText("Invalid. Must be < 25 chars.");
            }

            lblFnameError.setVisible(true);
            result = false;
        }

        if (txtLName.getText().trim().isEmpty() || (txtLName.getText().trim().length() > 25)) {
            if (txtLName.getText().trim().isEmpty()) {
                lblLNameError.setText("Invalid. Cannot be empty.");
            } else if (txtLName.getText().trim().length() > 25) {
                lblLNameError.setText("Invalid. Must be < 25 chars.");
            }
            lblLNameError.setVisible(true);
            result = false;
        }
        
        if (txtPhone.getText().trim().isEmpty() || !(isInteger(txtPhone.getText().trim()))) {
            if (txtPhone.getText().trim().isEmpty()) {
                lblPhoneError.setText("Invalid. Cannot be empty.");
            } else if (!(isInteger(txtPhone.getText().trim()))) {
                lblPhoneError.setText("Invalid. Must be number.");
            }

            lblPhoneError.setVisible(true);
            result = false;
        }

        if (txtDOB.getText().trim().isEmpty()|| !(txtDOB.getText().trim().matches("[0-3][0-9]-[A-Za-z][A-Za-z][A-Za-z]-[1-2][0-9][0-9][0-9]"))) {
            if(txtDOB.getText().trim().isEmpty()){
                lblDOBError.setText("Invalid. Please make sure your date is not empty.");
            }
            else{
                lblDOBError.setText("Invalid. Date should be in the format of DD-MMM-YYYY.");
            }
            
            lblDOBError.setVisible(true);
            result = false;
        }
        if (txtAddress.getText().trim().isEmpty() || (txtAddress.getText().trim().length() > 25)) {
                    if (txtAddress.getText().trim().isEmpty()) {
                        lblAddressError.setText("Invalid. Cannot be empty.");
                    } else if (txtAddress.getText().trim().length() > 30) {
                        lblAddressError.setText("Invalid. Must be < 30 chars.");
                    }
                    lblAddressError.setVisible(true);
                    result = false;
        }
        
        if (txtUsername.getText().trim().isEmpty() || (txtUsername.getText().trim().length() > 25)) {
                    if (txtUsername.getText().trim().isEmpty()) {
                        lblUsernameError.setText("Invalid. Cannot be empty.");
                    } else if (txtUsername.getText().trim().length() > 25) {
                        lblUsernameError.setText("Invalid. Must be < 25 chars.");
                    }
                    lblUsernameError.setVisible(true);
                    result = false;
        }
        if (txtPassword.getText().trim().isEmpty() || (txtPassword.getText().trim().length() > 25)) {
                    if (txtPassword.getText().trim().isEmpty()) {
                        lblPasswordError.setText("Invalid. Cannot be empty.");
                    } else if (txtPassword.getText().trim().length() > 25) {
                        lblPasswordError.setText("Invalid. Must be < 25 chars.");
                    }
                    lblPasswordError.setVisible(true);
                    result = false;
        }



        return result;
    }

    void clearInputBoxes() {
        txtCustNo.setText("");
        txtFname.setText("");
        txtLName.setText("");
        txtPhone.setText("");
        txtDOB.setText("");
        txtAddress.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        
    }

    private void btnAddNewEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewEmpActionPerformed
        // TODO add your handling code here:

        try {

                
            if (isValidData()) {
                         
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] sign = md.digest(txtPassword.getText().trim().getBytes());
            String hashPwd = String.format("%032X", new BigInteger(1, sign));
            hashPwd = hashPwd.substring(0, Math.min(hashPwd.length(), 25));
                
                //Inserts new employee data into the emp table after validation
                String prepareSQL = "INSERT INTO CUSTOMER (CustomerID, FName, LName, PhoneNo, DOB, Address, Username, Password) VALUES ("
                        + Integer.parseInt(txtCustNo.getText())
                        + ", '" + txtFname.getText().toUpperCase() + "'"
                        + ", '" + txtLName.getText().toUpperCase() + "', "
                        + Integer.parseInt(txtPhone.getText())
                         + ", '" + txtDOB.getText() + "'"
                        + ", '" + txtAddress.getText() + "'"
                        + ", '" + txtUsername.getText() + "'"
                        + ", '" + hashPwd + "')";


                int result = dbCon.executePreparedStmnt(prepareSQL);

                if (result > 0) {

                    javax.swing.JLabel label = new javax.swing.JLabel("New User added successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    this.dispose();
                } else {
                    // check validation errors 
                }


            } else {

                javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error adding new Customer.");
            JOptionPane.showMessageDialog(null, e);

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddNewEmpActionPerformed

    private void txtCustNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustNoActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_CloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JButton btnAddNewEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAddressError;
    private javax.swing.JLabel lblDOBError;
    private javax.swing.JLabel lblFnameError;
    private javax.swing.JLabel lblLNameError;
    private javax.swing.JLabel lblPasswordError;
    private javax.swing.JLabel lblPhoneError;
    private javax.swing.JLabel lblUsernameError;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCustNo;
    private javax.swing.JFormattedTextField txtDOB;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}