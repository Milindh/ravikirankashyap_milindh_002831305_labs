/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import business.AccountDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import business.Account;
import javax.swing.JOptionPane;

/**
 *
 * @author Milindh R Kashyap
 */
public class ManageAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAccountJPanel
     */
    private JPanel UserProcessContainer;
    private AccountDirectory accountDirectory;
    

    ManageAccountJPanel(JPanel UserProcessContainer, AccountDirectory accountDirectory) {
        initComponents();
        this.UserProcessContainer = UserProcessContainer;
        this.accountDirectory = accountDirectory;
        populateTable();
       
    }
    
    private void populateTable()
       {
           DefaultTableModel dtm = (DefaultTableModel) tblAccount.getModel();
           dtm.setRowCount(0);
           for(Account account:accountDirectory.getAccountList())
           {
               Object[] row = new Object[4];
               row[0] = account;
               row[1] = account.getRoutingNumber();
               row[2] = account.getAccountNumber();
               row[3] = account.getBalance();
               
               dtm.addRow(row);
               
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAccount = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnNewDetails = new javax.swing.JButton();
        btnDeleteAccount = new javax.swing.JButton();
        txtAccountNumber = new javax.swing.JTextField();
        btnManageBack = new javax.swing.JButton();

        tblAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bank Name", "Rounting Number", "Account Number ", "Balance"
            }
        ));
        jScrollPane1.setViewportView(tblAccount);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnNewDetails.setText("View Details");
        btnNewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewDetailsActionPerformed(evt);
            }
        });

        btnDeleteAccount.setText("Delete Account");
        btnDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccountActionPerformed(evt);
            }
        });

        txtAccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountNumberActionPerformed(evt);
            }
        });

        btnManageBack.setText("<Back");
        btnManageBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeleteAccount)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNewDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnManageBack)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnManageBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNumberActionPerformed

    private void btnManageBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageBackActionPerformed
        // TODO add your handling code here:
        
        AccountMngWorkAreaJPanel panel = new AccountMngWorkAreaJPanel(UserProcessContainer, accountDirectory);
        UserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
         
    }//GEN-LAST:event_btnManageBackActionPerformed

    private void btnDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccountActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblAccount.getSelectedRow();
        if(selectedRow>=0)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the account details ? ", "Warning", dialogButton);
            
            if(dialogResult == JOptionPane.YES_OPTION)
            {
                Account account = (Account) tblAccount.getValueAt(selectedRow, 0);
                accountDirectory.deleteAccount(account);
                populateTable();
                
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a role", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_btnDeleteAccountActionPerformed

    private void btnNewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewDetailsActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblAccount.getSelectedRow();
        if(selectedRow < 0 )
        {
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
        else
        {
            Account account = (Account) tblAccount.getValueAt(selectedRow, 0);
            ViewAccountJPanel panel = new ViewAccountJPanel(UserProcessContainer, account);
            UserProcessContainer.add("ViewAccountJPanel", panel);
            CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
            layout.next(UserProcessContainer);
            
            
        }
        
        
    }//GEN-LAST:event_btnNewDetailsActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        Account result = accountDirectory.searchAccount(txtAccountNumber.getText());
        if(result == null)
        {
            JOptionPane.showMessageDialog(null, "Account number does not exists", "Information", JOptionPane.INFORMATION_MESSAGE);
            
        }
        else
        {
            
            ViewAccountJPanel panel = new ViewAccountJPanel(UserProcessContainer, result);
            UserProcessContainer.add("ViewAccountJPanel", panel);
            CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
            layout.next(UserProcessContainer);
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteAccount;
    private javax.swing.JButton btnManageBack;
    private javax.swing.JButton btnNewDetails;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAccount;
    private javax.swing.JTextField txtAccountNumber;
    // End of variables declaration//GEN-END:variables
}
