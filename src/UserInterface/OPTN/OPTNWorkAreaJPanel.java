/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.OPTN;

import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author meetveera
 */
public class OPTNWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OPTNWorkAreaJPanel
     */
    private JPanel RightPanel;
    private EcoSystem system;
    public OPTNWorkAreaJPanel(JPanel RightPanel, EcoSystem system) {
        initComponents();
        this.RightPanel=RightPanel;
        this.system=system;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        networkManage = new javax.swing.JButton();
        networkManage1 = new javax.swing.JButton();
        ViewTPC = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ORGAN PROCURMENT TRANSPLANTATION NETWORK  WORK AREA");

        networkManage.setBackground(new java.awt.Color(0, 102, 102));
        networkManage.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        networkManage.setForeground(new java.awt.Color(255, 255, 255));
        networkManage.setText("MANAGE THE NETWORKS");
        networkManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkManageActionPerformed(evt);
            }
        });

        networkManage1.setBackground(new java.awt.Color(0, 102, 102));
        networkManage1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        networkManage1.setForeground(new java.awt.Color(255, 255, 255));
        networkManage1.setText("REGISTER ENTERPRISES");
        networkManage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkManage1ActionPerformed(evt);
            }
        });

        ViewTPC.setBackground(new java.awt.Color(0, 102, 102));
        ViewTPC.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        ViewTPC.setForeground(new java.awt.Color(255, 255, 255));
        ViewTPC.setText("MANAGE THE ENTERPRISES");
        ViewTPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTPCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ViewTPC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(networkManage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(networkManage, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(200, 200, 200))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(networkManage, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(networkManage1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(ViewTPC, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkManageActionPerformed
        // TODO add your handling code here:
         networkManage nm=new networkManage(RightPanel,system);
         CardLayout layout=(CardLayout)RightPanel.getLayout();
         RightPanel.add(nm);
         layout.next(RightPanel);
        
    }//GEN-LAST:event_networkManageActionPerformed

    private void networkManage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkManage1ActionPerformed
        // TODO add your handling code here:
      registerEnterprises tpr =new registerEnterprises(RightPanel,system);
        CardLayout layout=(CardLayout)RightPanel.getLayout();
         RightPanel.add(tpr);
         layout.next(RightPanel);
    }//GEN-LAST:event_networkManage1ActionPerformed

    private void ViewTPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTPCActionPerformed
        // TODO add your handling code here:
        RegisteredTPCs r=new RegisteredTPCs(RightPanel,system);
         CardLayout layout=(CardLayout)RightPanel.getLayout();
         RightPanel.add(r);
         layout.next(RightPanel);
    }//GEN-LAST:event_ViewTPCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewTPC;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton networkManage;
    private javax.swing.JButton networkManage1;
    // End of variables declaration//GEN-END:variables
}
