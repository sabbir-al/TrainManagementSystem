package trainmanagementgui;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class AddLocation extends javax.swing.JFrame {

    myDBCon dbCon;
    ResultSet rs;

   
    public AddLocation(){
        initComponents();
        
        // center form in screen 
        this.setLocationRelativeTo(null);
        // set all error labels to invisible
        lblStationNameError.setVisible(false);
        lblCityError.setVisible(false);
        lblCountryError.setVisible(false);
        
        
      
        dbCon = new myDBCon();
        getNewTrainId();
        //populate mgr and deptno combo boxes 
       

    }
    
        private void getNewTrainId() {

        String str;
        try {
            // populate CustomerID field
            rs = dbCon.executeStatementQuery("select MAX(LocationID) as LocationID from LOCATION");
        
            while (rs.next()) {
                str = rs.getString("LocationID");
                if (str==null){
                    txtLocationID.setText("1");
                }
                else{
                    int temp = Integer.parseInt(str);
                    txtLocationID.setText(String.valueOf(++temp));
                }
            }


        } catch (SQLException e) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Error Generating LocationID");
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
        txtLocationID = new javax.swing.JTextField();
        txtStationName = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        btnAddNewEmp = new javax.swing.JButton();
        lblCityError = new javax.swing.JLabel();
        lblStationNameError = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        lblCountryError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Employee");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add New Location");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Location ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Station Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("City:");

        txtLocationID.setEditable(false);
        txtLocationID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtStationName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtCity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        btnAddNewEmp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddNewEmp.setText("Add Location");
        btnAddNewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewEmpActionPerformed(evt);
            }
        });

        lblCityError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblCityError.setForeground(new java.awt.Color(255, 0, 0));
        lblCityError.setText("error label");

        lblStationNameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblStationNameError.setForeground(new java.awt.Color(255, 0, 0));
        lblStationNameError.setText("error label");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Country:");

        txtCountry.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountryActionPerformed(evt);
            }
        });

        lblCountryError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblCountryError.setForeground(new java.awt.Color(255, 0, 0));
        lblCountryError.setText("error label");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 202, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddNewEmp)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStationName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtCity)
                            .addComponent(txtCountry))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblStationNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCityError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCountryError, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtLocationID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLocationID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtStationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStationNameError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCityError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lblCountryError))
                .addGap(34, 34, 34)
                .addComponent(btnAddNewEmp)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

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
      
        lblStationNameError.setText("");
        lblStationNameError.setVisible(false);
        lblCityError.setText("");
        lblCityError.setVisible(false);
        lblCountryError.setText("");
        lblCountryError.setVisible(false);

    }

    boolean isValidData() {

        clearErrorLabels(); //clears all error labels
        boolean result = true;
       

        if (txtStationName.getText().trim().isEmpty() || (txtStationName.getText().trim().length() > 25)) {
            if (txtStationName.getText().trim().isEmpty()) {
                lblStationNameError.setText("Invalid. Cannot be empty.");
            } else if ((txtStationName.getText().trim().length() > 25)) {
                lblStationNameError.setText("Invalid. Must be < 25 chars.");
            }

            lblStationNameError.setVisible(true);
            result = false;
        }
        
        if (txtCity.getText().trim().isEmpty() || (txtCity.getText().trim().length() > 25)) {
            if (txtCity.getText().trim().isEmpty()) {
                lblCityError.setText("Invalid. Cannot be empty.");
            } else if ((txtCity.getText().trim().length() > 25)) {
                lblCityError.setText("Invalid. Must be < 25 chars.");
            }

            lblCityError.setVisible(true);
            result = false;
        }

        if (txtCountry.getText().trim().isEmpty() || (txtCountry.getText().trim().length() > 25)) {
            if (txtCountry.getText().trim().isEmpty()) {
                lblCountryError.setText("Invalid. Cannot be empty.");
            } else if ((txtCountry.getText().trim().length() > 25)) {
                lblCountryError.setText("Invalid. Must be < 25 chars.");
            }

            lblCountryError.setVisible(true);
            result = false;
        }

        return result;
    }

    void clearInputBoxes() {
        txtLocationID.setText("");
        txtStationName.setText("");
        txtCity.setText("");
        txtCountry.setText("");
    }

    private void btnAddNewEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewEmpActionPerformed
        // TODO add your handling code here:

        try {

                
            if (isValidData()) {
                
                //Inserts new employee data into the emp table after validation
                String prepareSQL = "INSERT INTO LOCATION (LocationID, StationName, City, Country) VALUES ("
                        + Integer.parseInt(txtLocationID.getText())
                        + ",'" + txtStationName.getText().toUpperCase() + "'"
                        + ",'" + txtCity.getText().toUpperCase() + "'"
                        + ",'" + txtCountry.getText().toUpperCase() + "')";


                int result = dbCon.executePreparedStmnt(prepareSQL);

                if (result > 0) {

                    javax.swing.JLabel label = new javax.swing.JLabel("New Location added successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    clearInputBoxes();
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
            JOptionPane.showMessageDialog(null, "Error adding new Location.");
        }
    }//GEN-LAST:event_btnAddNewEmpActionPerformed

    private void txtCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCityError;
    private javax.swing.JLabel lblCountryError;
    private javax.swing.JLabel lblStationNameError;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtLocationID;
    private javax.swing.JTextField txtStationName;
    // End of variables declaration//GEN-END:variables
}