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
public class UpdateDeleteTrainline extends javax.swing.JFrame {
    
    myDBCon dbCon;
    ResultSet rs, rs2;

    /**
     * Creates new form AddEmployee
     */
    public UpdateDeleteTrainline() {
        initComponents();
        this.setLocationRelativeTo(null);

        lbTrainNameError.setVisible(false);
        lblPassengerCapError.setVisible(false);


        dbCon = new myDBCon();
        getNewData();


    }

    private void getNewData() {

        try {

            rs = dbCon.executeStatementQuery("SELECT * FROM TRAINLINE ORDER BY TrainID ASC ");


            // populate rest of fields
            rs.beforeFirst();
            rs.first();
            populateFields();
        } catch (SQLException e) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Display selected Trainline");
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
        txtTrainName = new javax.swing.JTextField();
        txtPassengerCap = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtTrainID = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        lbTrainNameError = new javax.swing.JLabel();
        lblPassengerCapError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update/Delete Employee");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Update/Delete Trainline");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("TrainID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Train Name: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Passenger Capacity:");

        txtTrainName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtPassengerCap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassengerCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassengerCapActionPerformed(evt);
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

        txtTrainID.setEditable(false);
        txtTrainID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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

        lbTrainNameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lbTrainNameError.setForeground(new java.awt.Color(255, 0, 0));
        lbTrainNameError.setText("error label");

        lblPassengerCapError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblPassengerCapError.setForeground(new java.awt.Color(255, 0, 0));
        lblPassengerCapError.setText("error label");

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
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTrainName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtPassengerCap, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTrainID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbTrainNameError, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(lblPassengerCapError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(txtTrainID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTrainName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTrainNameError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassengerCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassengerCapError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassengerCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassengerCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassengerCapActionPerformed

    private void populateFields() {
        try {
            txtTrainID.setText(rs.getString("TrainID"));
            txtTrainName.setText(rs.getString("TrainName"));
            txtPassengerCap.setText(rs.getString("PassengerCapacity"));
            
            

            EnableDisableButtons();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteTrainline.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(UpdateDeleteTrainline.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(UpdateDeleteTrainline.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(UpdateDeleteTrainline.class.getName()).log(Level.SEVERE, null, ex);
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
            
             //Checks if employee exists for the department that the user wants to delete
            rs2 = dbCon.executeStatementQuery("SELECT * FROM ALLOCATION where TrainID =" + Integer.parseInt(txtTrainID.getText().trim()));

            //Deletes the department if no employee is assigned to it
            if(!rs2.next()){
                String prepSQL = "DELETE TRAINLINE WHERE TrainID = " + Integer.parseInt(txtTrainID.getText().trim());
                int result = dbCon.executePreparedStmnt(prepSQL);

                
                if (result > 0) {
                javax.swing.JLabel label = new javax.swing.JLabel("Train ID " + Integer.parseInt(txtTrainID.getText().trim()) + " deleted successfully.");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                getNewData();
              }
                else {
                    javax.swing.JLabel label = new javax.swing.JLabel("Trainline Delete Failed.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
           
            else{
                 JOptionPane.showMessageDialog(this, "Cannot Delete Trainline. Trainline is allocated to routes!!");
            }

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error deleting trainline.");

        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    void clearErrorLabels() {

        lbTrainNameError.setText("");
        lbTrainNameError.setVisible(false);
        lblPassengerCapError.setText("");
        lblPassengerCapError.setVisible(false);


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
        

       if (txtTrainName.getText().trim().isEmpty() || (txtTrainName.getText().trim().length() > 25)) {
            if (txtTrainName.getText().trim().isEmpty()) {
                lbTrainNameError.setText("Invalid. Cannot be empty.");
            } else if ((txtTrainName.getText().trim().length() > 25)) {
                lbTrainNameError.setText("Invalid. Must be < 25 chars.");
            }

            lbTrainNameError.setVisible(true);
            result = false;
        }

        if (txtPassengerCap.getText().trim().isEmpty() || !isInteger(txtPassengerCap.getText().trim())) {
            if (txtPassengerCap.getText().trim().isEmpty()) {
                lblPassengerCapError.setText("Invalid. Cannot be empty.");
            } else if (!isInteger(txtPassengerCap.getText().trim())) {
                lblPassengerCapError.setText("Invalid. Must be integer");
            }
            lblPassengerCapError.setVisible(true);
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
                

                
               String prepareSQL = "UPDATE Trainline SET TrainName = "
                            + "'" + txtTrainName.getText().toUpperCase() + "'"
                            + " , PassengerCapacity = " + Integer.parseInt(txtPassengerCap.getText())
                            + " WHERE TrainID = " + Integer.parseInt(txtTrainID.getText());   

                int result = dbCon.executePreparedStmnt(prepareSQL);

                    
                if (result > 0) {

                    javax.swing.JLabel label = new javax.swing.JLabel("Train ID " + Integer.parseInt(txtTrainID.getText()) + " updated successfully.");
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

            JOptionPane.showMessageDialog(null, "Error updating Trainline." + e.getMessage());

        }
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbTrainNameError;
    private javax.swing.JLabel lblPassengerCapError;
    private javax.swing.JTextField txtPassengerCap;
    private javax.swing.JTextField txtTrainID;
    private javax.swing.JTextField txtTrainName;
    // End of variables declaration//GEN-END:variables
}
