/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desert;


import static attack_system.unlockLevel.unlocking;
import static creatingChar.creatingCharacter.object_character;
import static desert.desert.pers;



/**
 *
 * @author allan
 */
public class persianAttack extends javax.swing.JFrame {

      
  int valueGlad=object_character.zycie;
  int valuePersian=pers.potworZycie;
  
    String champInt=String.valueOf(object_character.zycie);
    String persianInt=String.valueOf(pers.potworZycie);
  
    public persianAttack() {
        initComponents();
            
   champBar.setString(champInt);
   persianBa.setString(persianInt);
    champBar.setValue(object_character.zycie);
    persianBa.setValue(pers.potworZycie);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        persianPanel = new javax.swing.JPanel();
        persianLab = new javax.swing.JLabel();
        persianBa = new javax.swing.JProgressBar();
        persianR = new javax.swing.JTextField();
        champPanel = new javax.swing.JPanel();
        champLabel = new javax.swing.JLabel();
        champBar = new javax.swing.JProgressBar();
        champ = new javax.swing.JTextField();
        attackBut = new javax.swing.JButton();
        backgroundSphinx = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        persianPanel.setBackground(new java.awt.Color(182, 153, 111));
        persianPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.darkGray, null));
        persianPanel.setForeground(new java.awt.Color(182, 153, 111));

        persianLab.setForeground(new java.awt.Color(91, 109, 94));
        persianLab.setIcon(new javax.swing.ImageIcon("/Users/allan/Desktop/gallery_photos_game/persowie.jpg")); // NOI18N
        persianLab.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        persianLab.setDoubleBuffered(true);

        persianBa.setStringPainted(true);

        persianR.setEditable(false);
        persianR.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        persianR.setForeground(new java.awt.Color(91, 109, 94));
        persianR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        persianR.setText("Pers");
        persianR.setCaretColor(new java.awt.Color(91, 109, 94));
        persianR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persianRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout persianPanelLayout = new javax.swing.GroupLayout(persianPanel);
        persianPanel.setLayout(persianPanelLayout);
        persianPanelLayout.setHorizontalGroup(
            persianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(persianPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(persianLab, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(persianR)
            .addComponent(persianBa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        persianPanelLayout.setVerticalGroup(
            persianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(persianPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(persianLab, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(persianR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(persianBa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(persianPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, 320));

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

        backgroundSphinx.setIcon(new javax.swing.ImageIcon("/Users/allan/Desktop/gallery_photos_game/pustynia_tlo.jpeg")); // NOI18N
        getContentPane().add(backgroundSphinx, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void attackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackButActionPerformed
             if(pers.potworZycie > 0 && object_character.zycie > 0){
            if(pers.potworZycie == 0 || object_character.zycie==0){
                System.out.println("MARTWI");
            }
            else{
                 object_character.atak(pers);
                 pers.atakPotwor(object_character);            
                 valueGlad=object_character.zycie;
                 valuePersian=pers.potworZycie;
                 champInt=String.valueOf(object_character.zycie); 
                 persianInt=String.valueOf(pers.potworZycie);
     
     
                        champBar.setValue(valueGlad);
                        persianBa.setValue(valuePersian);
                        champBar.setString(champInt);
                        persianBa.setString(persianInt);
                }
              if(pers.potworZycie==0){unlocking(2);}
         if(object_character.zycie<=0){ pers.potworZycie=pers.potworZycieWartownik;}
        }
                                            

    }//GEN-LAST:event_attackButActionPerformed

    private void persianRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persianRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_persianRActionPerformed

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
            java.util.logging.Logger.getLogger(persianAttack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(persianAttack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(persianAttack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(persianAttack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new persianAttack().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attackBut;
    private javax.swing.JLabel backgroundSphinx;
    private javax.swing.JTextField champ;
    private javax.swing.JProgressBar champBar;
    private javax.swing.JLabel champLabel;
    private javax.swing.JPanel champPanel;
    private javax.swing.JProgressBar persianBa;
    private javax.swing.JLabel persianLab;
    private javax.swing.JPanel persianPanel;
    private javax.swing.JTextField persianR;
    // End of variables declaration//GEN-END:variables
}
