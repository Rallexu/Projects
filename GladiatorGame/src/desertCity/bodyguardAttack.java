/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertCity;

import static attack_system.unlockLevel.unlocking;
import static creatingChar.creatingCharacter.object_character;
import static desert.desert.bodyguardAnubis;





/**
 *
 * @author allan
 */
public class bodyguardAttack extends javax.swing.JFrame {

      
  int valueGlad=object_character.zycie;
  int valueBodyGuard=bodyguardAnubis.potworZycie;
  
    String champInt=String.valueOf(object_character.zycie);
    String bodyGuardInt=String.valueOf(bodyguardAnubis.potworZycie);
  
    public bodyguardAttack() {
        initComponents();
            
   champBar.setString(champInt);
   bodyguardBa.setString(bodyGuardInt);
   //skeletonProgress.setMaximum(Arek.potworZycie);
   //gladiatorProgress.setMaximum(Rall.zycie);
    champBar.setValue(object_character.zycie);
    bodyguardBa.setValue(bodyguardAnubis.potworZycie);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyguardPanel = new javax.swing.JPanel();
        bodyguardLab = new javax.swing.JLabel();
        bodyguardBa = new javax.swing.JProgressBar();
        bodyguardR = new javax.swing.JTextField();
        champPanel = new javax.swing.JPanel();
        champLabel = new javax.swing.JLabel();
        champBar = new javax.swing.JProgressBar();
        champ = new javax.swing.JTextField();
        attackBut = new javax.swing.JButton();
        backgroundbodyguard = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bodyguardPanel.setBackground(new java.awt.Color(182, 153, 111));
        bodyguardPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.darkGray, null));
        bodyguardPanel.setForeground(new java.awt.Color(182, 153, 111));

        bodyguardLab.setForeground(new java.awt.Color(91, 109, 94));
        bodyguardLab.setIcon(new javax.swing.ImageIcon("/Users/allan/Desktop/gallery_photos_game/anubisBody.jpg")); // NOI18N
        bodyguardLab.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bodyguardLab.setDoubleBuffered(true);

        bodyguardBa.setStringPainted(true);

        bodyguardR.setEditable(false);
        bodyguardR.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        bodyguardR.setForeground(new java.awt.Color(91, 109, 94));
        bodyguardR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bodyguardR.setText("Strażnik");
        bodyguardR.setCaretColor(new java.awt.Color(91, 109, 94));
        bodyguardR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodyguardRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyguardPanelLayout = new javax.swing.GroupLayout(bodyguardPanel);
        bodyguardPanel.setLayout(bodyguardPanelLayout);
        bodyguardPanelLayout.setHorizontalGroup(
            bodyguardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyguardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bodyguardLab, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(bodyguardR)
            .addComponent(bodyguardBa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodyguardPanelLayout.setVerticalGroup(
            bodyguardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyguardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bodyguardLab, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyguardR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bodyguardBa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(bodyguardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, 320));

        champPanel.setBackground(new java.awt.Color(182, 153, 111));
        champPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.darkGray, null));
        champPanel.setForeground(new java.awt.Color(182, 153, 111));

        champLabel.setForeground(new java.awt.Color(91, 109, 94));
        champLabel.setIcon(new javax.swing.ImageIcon("/Users/allan/Desktop/gallery_photos_game/champ.jpg")); // NOI18N
        champLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        champLabel.setDoubleBuffered(true);

        champBar.setStringPainted(true);

        champ.setEditable(false);
        champ.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        champ.setForeground(new java.awt.Color(91, 109, 94));
        champ.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        champ.setText("Gladiator");
        champ.setCaretColor(new java.awt.Color(91, 109, 94));

        javax.swing.GroupLayout champPanelLayout = new javax.swing.GroupLayout(champPanel);
        champPanel.setLayout(champPanelLayout);
        champPanelLayout.setHorizontalGroup(
            champPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(champPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(champLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(champ)
            .addComponent(champBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        champPanelLayout.setVerticalGroup(
            champPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(champPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(champLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(champ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(champBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(champPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 82, -1, 320));

        attackBut.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        attackBut.setText("Atakuj");
        attackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackButActionPerformed(evt);
            }
        });
        getContentPane().add(attackBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        backgroundbodyguard.setIcon(new javax.swing.ImageIcon("/Users/allan/Desktop/gallery_photos_game/monstersMiasto.jpg")); // NOI18N
        getContentPane().add(backgroundbodyguard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void attackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackButActionPerformed
             if(bodyguardAnubis.potworZycie > 0 && object_character.zycie > 0){
            if(bodyguardAnubis.potworZycie == 0 || object_character.zycie==0){
                System.out.println("MARTWI");
            }
            else{
                 object_character.atak(bodyguardAnubis);
                 bodyguardAnubis.atakPotwor(object_character);            
                 valueGlad=object_character.zycie;
                 valueBodyGuard=bodyguardAnubis.potworZycie;
                 champInt=String.valueOf(object_character.zycie); 
                 bodyGuardInt=String.valueOf(bodyguardAnubis.potworZycie);
     
     
                        champBar.setValue(valueGlad);
                        bodyguardBa.setValue(valueBodyGuard);
                        champBar.setString(champInt);
                        bodyguardBa.setString(bodyGuardInt);
                }
              if(bodyguardAnubis.potworZycie==0){unlocking(3);}
         if(object_character.zycie<=0){ bodyguardAnubis.potworZycie=bodyguardAnubis.potworZycieWartownik;}
        }
                                            

    }//GEN-LAST:event_attackButActionPerformed

    private void bodyguardRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodyguardRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bodyguardRActionPerformed

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
            java.util.logging.Logger.getLogger(bodyguardAttack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bodyguardAttack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bodyguardAttack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bodyguardAttack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bodyguardAttack().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attackBut;
    private javax.swing.JLabel backgroundbodyguard;
    private javax.swing.JProgressBar bodyguardBa;
    private javax.swing.JLabel bodyguardLab;
    private javax.swing.JPanel bodyguardPanel;
    private javax.swing.JTextField bodyguardR;
    private javax.swing.JTextField champ;
    private javax.swing.JProgressBar champBar;
    private javax.swing.JLabel champLabel;
    private javax.swing.JPanel champPanel;
    // End of variables declaration//GEN-END:variables
}
