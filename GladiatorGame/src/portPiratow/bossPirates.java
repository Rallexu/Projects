/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portPiratow;

import static creatingChar.creatingCharacter.object_character;
import static portPiratow.port.bossPort;


/**
 *
 * @author allan
 */
public class bossPirates extends javax.swing.JFrame {

     
  int valueGlad=object_character.zycie;
  int valueBossPort=bossPort.potworZycie;
  
    String champInt=String.valueOf(object_character.zycie);
    String bossPirateInt=String.valueOf(bossPort.potworZycie);
  
    public bossPirates() {
        initComponents();
            
   champBar.setString(champInt);
   bossPirateBa.setString(bossPirateInt);
   //skeletonProgress.setMaximum(Arek.potworZycie);
   //gladiatorProgress.setMaximum(Rall.zycie);
    champBar.setValue(object_character.zycie);
    bossPirateBa.setValue(bossPort.potworZycie);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bossPiratePanel = new javax.swing.JPanel();
        bossPirateLab = new javax.swing.JLabel();
        bossPirateBa = new javax.swing.JProgressBar();
        bossPirateR = new javax.swing.JTextField();
        champPanel = new javax.swing.JPanel();
        champLabel = new javax.swing.JLabel();
        champBar = new javax.swing.JProgressBar();
        champ = new javax.swing.JTextField();
        attackBut = new javax.swing.JButton();
        backgroundPortBoss = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bossPiratePanel.setBackground(new java.awt.Color(64, 119, 133));
        bossPiratePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.darkGray, null));
        bossPiratePanel.setForeground(new java.awt.Color(64, 119, 133));

        bossPirateLab.setForeground(new java.awt.Color(91, 109, 94));
        bossPirateLab.setIcon(new javax.swing.ImageIcon("/Users/allan/Desktop/gallery_photos_game/bossPiratow.jpg")); // NOI18N
        bossPirateLab.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bossPirateLab.setDoubleBuffered(true);

        bossPirateBa.setStringPainted(true);

        bossPirateR.setEditable(false);
        bossPirateR.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        bossPirateR.setForeground(new java.awt.Color(91, 109, 94));
        bossPirateR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bossPirateR.setText("Piraci");
        bossPirateR.setCaretColor(new java.awt.Color(91, 109, 94));

        javax.swing.GroupLayout bossPiratePanelLayout = new javax.swing.GroupLayout(bossPiratePanel);
        bossPiratePanel.setLayout(bossPiratePanelLayout);
        bossPiratePanelLayout.setHorizontalGroup(
            bossPiratePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bossPiratePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bossPirateLab, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(bossPirateR)
            .addComponent(bossPirateBa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bossPiratePanelLayout.setVerticalGroup(
            bossPiratePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bossPiratePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bossPirateLab, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bossPirateR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bossPirateBa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(bossPiratePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, 320));

        champPanel.setBackground(new java.awt.Color(64, 119, 133));
        champPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.darkGray, null));
        champPanel.setForeground(new java.awt.Color(64, 119, 133));

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

        backgroundPortBoss.setIcon(new javax.swing.ImageIcon("/Users/allan/Desktop/gallery_photos_game/portpiratow_tlojpg.jpg")); // NOI18N
        getContentPane().add(backgroundPortBoss, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void attackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackButActionPerformed
             if(bossPort.potworZycie > 0 && object_character.zycie > 0){
            if(bossPort.potworZycie == 0 || object_character.zycie==0){
                System.out.println("MARTWI");
            }
            else{
                 object_character.atak(bossPort);
                 bossPort.atakPotwor(object_character);            
                 valueGlad=object_character.zycie;
                 valueBossPort=bossPort.potworZycie;
                 champInt=String.valueOf(object_character.zycie); 
                 bossPirateInt=String.valueOf(bossPort.potworZycie);
     
     
                        champBar.setValue(valueGlad);
                        bossPirateBa.setValue(valueBossPort);
                        champBar.setString(champInt);
                        bossPirateBa.setString(bossPirateInt);
                }
        }
                                            

    }//GEN-LAST:event_attackButActionPerformed

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
            java.util.logging.Logger.getLogger(bossPirates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bossPirates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bossPirates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bossPirates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bossPirates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attackBut;
    private javax.swing.JLabel backgroundPortBoss;
    private javax.swing.JProgressBar bossPirateBa;
    private javax.swing.JLabel bossPirateLab;
    private javax.swing.JPanel bossPiratePanel;
    private javax.swing.JTextField bossPirateR;
    private javax.swing.JTextField champ;
    private javax.swing.JProgressBar champBar;
    private javax.swing.JLabel champLabel;
    private javax.swing.JPanel champPanel;
    // End of variables declaration//GEN-END:variables
}
