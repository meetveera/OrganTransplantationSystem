/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Donor;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sharw
 */
public class AccountManager extends javax.swing.JPanel {

    /**
     * Creates new form AccountManager
     */
    private JPanel RightPanel;
    private UserAccount account;
    private Enterprise enterprise;
    public AccountManager(JPanel RightPanel, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.RightPanel = RightPanel;
        this.account = account;
        this.enterprise = enterprise;
        usernametxtfield.setEditable(false);
        usernametxtfield.setText(account.getUsername());
        passwordtxtfield.setEditable(false);
        newpasswordtxtfield.setEditable(false);
       answertxtfield.setEditable(false);
        SecurityQuestionCombobox.setEnabled(false);
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernametxtfield = new javax.swing.JTextField();
        passwordtxtfield = new javax.swing.JTextField();
        newpasswordtxtfield = new javax.swing.JTextField();
        resetbtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        answertxtfield = new javax.swing.JTextField();
        setsecuritybtn = new javax.swing.JButton();
        save2btn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        SecurityQuestionCombobox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USER NAME :");

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD :");

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NEW PASSWORD :");

        usernametxtfield.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N

        passwordtxtfield.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N

        newpasswordtxtfield.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N

        resetbtn.setBackground(new java.awt.Color(0, 153, 153));
        resetbtn.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        resetbtn.setForeground(new java.awt.Color(255, 255, 255));
        resetbtn.setText("RESET PASSWORD");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        savebtn.setBackground(new java.awt.Color(0, 153, 153));
        savebtn.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        savebtn.setForeground(new java.awt.Color(255, 255, 255));
        savebtn.setText("SAVE");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SECURITY QUESTION :");

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SECURITY ANSWER: ");

        answertxtfield.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N

        setsecuritybtn.setBackground(new java.awt.Color(0, 153, 153));
        setsecuritybtn.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        setsecuritybtn.setForeground(new java.awt.Color(255, 255, 255));
        setsecuritybtn.setText("SET QUESTION");
        setsecuritybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setsecuritybtnActionPerformed(evt);
            }
        });

        save2btn.setBackground(new java.awt.Color(0, 153, 153));
        save2btn.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        save2btn.setForeground(new java.awt.Color(255, 255, 255));
        save2btn.setText("SAVE ");
        save2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2btnActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(0, 153, 153));
        backbtn.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("<<BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        SecurityQuestionCombobox.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        SecurityQuestionCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your mothers name ?", "What was the name of your elementary / primary school?", "What street did you live on in third grade?", "What is your oldest cousin's first and last name?" }));

        jLabel6.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DONOR ACCOUNT MANAGER ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resetbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(newpasswordtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passwordtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(143, 143, 143)
                                    .addComponent(usernametxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(152, 152, 152)
                                    .addComponent(setsecuritybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(save2btn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SecurityQuestionCombobox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(answertxtfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernametxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newpasswordtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savebtn)
                    .addComponent(resetbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SecurityQuestionCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answertxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setsecuritybtn)
                    .addComponent(save2btn)
                    .addComponent(backbtn))
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setsecuritybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setsecuritybtnActionPerformed
        // TODO add your handling code here:
        answertxtfield.setEditable(true);
        SecurityQuestionCombobox.setEnabled(true);
    }//GEN-LAST:event_setsecuritybtnActionPerformed

    private void save2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2btnActionPerformed
        // TODO add your handling code here:
        if(answertxtfield.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter the security answer first!!");
            return;
        }
        
        else{
        account.setSecurityQ((String)SecurityQuestionCombobox.getSelectedItem());
        account.setSecurityA(answertxtfield.getText());
        account.setVal(1);
        JOptionPane.showMessageDialog(null,"Security Question added successfully!");
    }//GEN-LAST:event_save2btnActionPerformed
    }
    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        passwordtxtfield.setEditable(true);
        newpasswordtxtfield.setEditable(true);
    }//GEN-LAST:event_resetbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        RightPanel.remove(this);
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.previous(RightPanel);
    }//GEN-LAST:event_backbtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        String pass = passwordtxtfield.getText();
        if(!(pass.equals(account.getPassword()))){
            JOptionPane.showMessageDialog(null, "original password not correct");
            return;
        }
        else {
            String newpassword = newpasswordtxtfield.getText();
            account.setPassword(newpassword);
            JOptionPane.showMessageDialog(null, "password changed successfully");
        }
    }//GEN-LAST:event_savebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SecurityQuestionCombobox;
    private javax.swing.JTextField answertxtfield;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField newpasswordtxtfield;
    private javax.swing.JTextField passwordtxtfield;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton save2btn;
    private javax.swing.JButton savebtn;
    private javax.swing.JButton setsecuritybtn;
    private javax.swing.JTextField usernametxtfield;
    // End of variables declaration//GEN-END:variables
}
