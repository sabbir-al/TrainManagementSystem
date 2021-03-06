package trainmanagementgui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class UpdateDeleteLocation extends javax.swing.JFrame {
    
    myDBCon dbCon;
    ResultSet rs, rs2;

    /**
     * Creates new form AddEmployee
     */
    public UpdateDeleteLocation() {
        initComponents();
        this.setLocationRelativeTo(null);

        lblStationNameError.setVisible(false);
        lblCityError.setVisible(false);
        lblCountryError.setVisible(false);


        dbCon = new myDBCon();
        getNewData();


    }

    private void getNewData() {

        try {

            rs = dbCon.executeStatementQuery("SELECT * FROM LOCATION ORDER BY LocationID ASC ");


            // populate rest of fields
            rs.beforeFirst();
            rs.first();
            populateFields();
        } catch (SQLException e) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Display selected LOCATION");
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
        txtStationName = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtLocationID = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        lblStationNameError = new javax.swing.JLabel();
        lblCountryError = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        lblCityError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update/Delete Employee");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Update/Delete Trainline");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Location ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Station Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("City:");

        txtStationName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtCity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtLocationID.setEditable(false);
        txtLocationID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNext.setText("Next >>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPrevious.setText("<< Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        lblStationNameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblStationNameError.setForeground(new java.awt.Color(255, 0, 0));
        lblStationNameError.setText("error label");

        lblCountryError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblCountryError.setForeground(new java.awt.Color(255, 0, 0));
        lblCountryError.setText("error label");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Country:");

        txtCountry.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountryActionPerformed(evt);
            }
        });

        lblCityError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblCityError.setForeground(new java.awt.Color(255, 0, 0));
        lblCityError.setText("error label");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtStationName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLocationID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCountry, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblStationNameError, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(lblCountryError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCityError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(btnPrevious)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCountryError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void populateFields() {
        try {
            txtLocationID.setText(rs.getString("LocationID"));
            txtStationName.setText(rs.getString("StationName"));
            txtCity.setText(rs.getString("City"));
            txtCountry.setText(rs.getString("Country"));
            
            

            EnableDisableButtons();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteLocation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void MoveNext() {
        try {
            // TODO add your handling code here:

            if (!rs.isLast()) {

                rs.next();
                populateFields();

            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteLocation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        MoveNext();
    }//GEN-LAST:event_btnNextActionPerformed

    private void MovePrevious() {
        try {
            // TODO add your handling code here:

            if (!rs.isFirst()) {
                rs.previous();
                populateFields();

            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteLocation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void EnableDisableButtons() {
        try {
            if (rs.isFirst()) {
                btnPrevious.setEnabled(false);
            } else {
                btnPrevious.setEnabled(true);
            }
            if (rs.isLast()) {
                btnNext.setEnabled(false);
            } else {
                btnNext.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteLocation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        MovePrevious();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        try {
            int confirm_delete = JOptionPane.showConfirmDialog(this, "Confirm to Delete Department?");
            if (confirm_delete == 0) {
            
             //Checks if location exists for any route allocation
            rs2 = dbCon.executeStatementQuery("SELECT * FROM ROUTES where Origin =" + Integer.parseInt(txtLocationID.getText().trim()) +" OR Destination =" + Integer.parseInt(txtLocationID.getText().trim()));

            //Deletes the Location if not allocated to any route
            if(!rs2.next()){
                String prepSQL = "DELETE LOCATION WHERE LocationID = " + Integer.parseInt(txtLocationID.getText().trim());
                int result = dbCon.executePreparedStmnt(prepSQL);

                
                if (result > 0) {
                javax.swing.JLabel label = new javax.swing.JLabel("Location ID " + Integer.parseInt(txtLocationID.getText().trim()) + " deleted successfully.");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                getNewData();
              }
                else {
                    javax.swing.JLabel label = new javax.swing.JLabel("Location Delete Failed.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
           
            else{
                 JOptionPane.showMessageDialog(this, "Cannot Delete Location. Location is allocated to routes!!");
            }

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error deleting trainline.");

        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    void clearErrorLabels() {

        lblStationNameError.setText("");
        lblStationNameError.setVisible(false);
        lblCountryError.setText("");
        lblCountryError.setVisible(false);
        lblCityError.setText("");
        lblCountryError.setVisible(false);


    }

    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
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

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        try {
            // make the result set scrolable forward/backward updatable
//            statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            if (isValidData()) {
              //Promts the user to confirm choice              
            int confirm_update = JOptionPane.showConfirmDialog(this, "Confirm To Update Customer Trainline?");
            if (confirm_update == 0) {
                

                
               String prepareSQL = "UPDATE LOCATION SET StationName = "
                            + "'" + txtStationName.getText().toUpperCase() + "'"
                            + " , City = '" + txtCity.getText().toUpperCase()+"' "
                            + " , Country = '" + txtCountry.getText().toUpperCase()+"' "
                            + " WHERE LocationID = " + Integer.parseInt(txtLocationID.getText());   

                int result = dbCon.executePreparedStmnt(prepareSQL);

                    
                if (result > 0) {

                    javax.swing.JLabel label = new javax.swing.JLabel("Location ID " + Integer.parseInt(txtLocationID.getText()) + " updated successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    getNewData();

                } else {
                    // check validation errors 
                }
            }  
            
            } else {

                javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error updating Location." + e.getMessage());

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnUpdate;
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
