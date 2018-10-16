/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package portPiratow;

import lochy.*;
import attack_system.monsters;
import static attack_system.packNewWindowSetter.newMap;
import static attack_system.unlockLevel.unlockDungeons;
import static attack_system.unlockLevel.unlocking;
import potwor.Pirates;
import potwor.Potwor;
import potwor.bossPirate;
import potwor.harphy;
import potwor.mermaid;
/**
 *
 * @author allan
 */
public class port extends javax.swing.JFrame {

    /** Creates new form lochy */
    public port() {
        initComponents();
        newMap(harpia,pirate,mermaidObject,bossPort);
          unlocking(0);
    }
  public static Potwor harpia = new harphy();
  public static Potwor pirate = new Pirates();
  public static Potwor mermaidObject = new mermaid();
  public static Potwor bossPort = new bossPirate();
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pirateAttack = new javax.swing.JButton();
        mermaidAttack = new javax.swing.JButton();
        Boss = new javax.swing.JButton();
        harpyAttack = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        dungeonsBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pirateAttack.setBackground(new java.awt.Color(59, 58, 58));
        pirateAttack.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        pirateAttack.setText("Piraci");
        pirateAttack.setBorder(null);
        pirateAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pirateAttackActionPerformed(evt);
            }
        });
        getContentPane().add(pirateAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 90, -1));

        mermaidAttack.setBackground(new java.awt.Color(59, 58, 58));
        mermaidAttack.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        mermaidAttack.setText("Syreny");
        mermaidAttack.setBorder(null);
        mermaidAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mermaidAttackActionPerformed(evt);
            }
        });
        getContentPane().add(mermaidAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 90, -1));

        Boss.setBackground(new java.awt.Color(59, 58, 58));
        Boss.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        Boss.setText("Boss");
        Boss.setBorder(null);
        Boss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BossActionPerformed(evt);
            }
        });
        getContentPane().add(Boss, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 90, -1));

        harpyAttack.setBackground(new java.awt.Color(59, 58, 58));
        harpyAttack.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        harpyAttack.setText("Harpie");
        harpyAttack.setBorder(null);
        harpyAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harpyAttackActionPerformed(evt);
            }
        });
        getContentPane().add(harpyAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 90, -1));
        harpyAttack.getAccessibleContext().setAccessibleName("wilkołak");

        Back.setBackground(new java.awt.Color(59, 58, 58));
        Back.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        Back.setText("Wróć");
        Back.setBorder(null);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 90, -1));

        dungeonsBackground.setIcon(new javax.swing.ImageIcon("/Users/allan/Desktop/gallery_photos_game/portpiratow_tlojpg.jpg")); // NOI18N
        getContentPane().add(dungeonsBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pirateAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pirateAttackActionPerformed
      if(unlockDungeons>0  ){   new pirateAttack().setVisible(true);}
    }//GEN-LAST:event_pirateAttackActionPerformed

    private void harpyAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harpyAttackActionPerformed
        if(unlockDungeons>1 ){ new harpyAttack().setVisible(true);}

    }//GEN-LAST:event_harpyAttackActionPerformed

    private void mermaidAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mermaidAttackActionPerformed
   new mermaidAttack().setVisible(true);
    }//GEN-LAST:event_mermaidAttackActionPerformed

    private void BossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BossActionPerformed
     if(unlockDungeons>2 ){    new bossPirates().setVisible(true);}
    }//GEN-LAST:event_BossActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
          new monsters().setVisible(true);
        this.setVisible(false);
    
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(port.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(port.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(port.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(port.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new port().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Boss;
    private javax.swing.JLabel dungeonsBackground;
    private javax.swing.JButton harpyAttack;
    private javax.swing.JButton mermaidAttack;
    private javax.swing.JButton pirateAttack;
    // End of variables declaration//GEN-END:variables

}