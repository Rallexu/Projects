/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;



import Stats.Skills;
import attack_system.monsters;
import static creatingChar.creatingCharacter.object_character;
import dealers.dealersMainMain;


/**
 *
 * @author allan
 */
public class mainMain extends javax.swing.JFrame {
   

    public mainMain() {
        
        initComponents();
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Exit = new javax.swing.JButton();
        handlarz = new javax.swing.JTabbedPane();
        journey = new javax.swing.JPanel();
        Katakumby = new javax.swing.JButton();
        Poczta = new javax.swing.JPanel();
        post = new javax.swing.JButton();
        Miasto = new javax.swing.JPanel();
        sellerArmor = new javax.swing.JButton();
        Arena = new javax.swing.JButton();
        heller = new javax.swing.JButton();
        Kowal = new javax.swing.JButton();
        tawern = new javax.swing.JButton();
        work = new javax.swing.JButton();
        Postać = new javax.swing.JPanel();
        Stats = new javax.swing.JButton();
        champ = new javax.swing.JButton();
        skills = new javax.swing.JButton();
        quests = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(860, 484));
        setPreferredSize(new java.awt.Dimension(860, 484));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 181, -1));

        handlarz.setBackground(new java.awt.Color(0, 0, 0));
        handlarz.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        handlarz.setFocusable(false);
        handlarz.setFont(new java.awt.Font("Papyrus", 1, 13)); // NOI18N

        journey.setBackground(new java.awt.Color(0, 0, 0));

        Katakumby.setBackground(new java.awt.Color(255, 255, 255));
        Katakumby.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        Katakumby.setText("Katakumby");
        Katakumby.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KatakumbyMouseClicked(evt);
            }
        });
        Katakumby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KatakumbyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout journeyLayout = new javax.swing.GroupLayout(journey);
        journey.setLayout(journeyLayout);
        journeyLayout.setHorizontalGroup(
            journeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(journeyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Katakumby, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        journeyLayout.setVerticalGroup(
            journeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(journeyLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Katakumby, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        handlarz.addTab("Podróż", journey);

        Poczta.setBackground(new java.awt.Color(0, 0, 0));

        post.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        post.setText("Skrzynka pocztowa");

        javax.swing.GroupLayout PocztaLayout = new javax.swing.GroupLayout(Poczta);
        Poczta.setLayout(PocztaLayout);
        PocztaLayout.setHorizontalGroup(
            PocztaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PocztaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        PocztaLayout.setVerticalGroup(
            PocztaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PocztaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        handlarz.addTab("Poczta", Poczta);

        Miasto.setBackground(new java.awt.Color(0, 0, 0));

        sellerArmor.setBackground(new java.awt.Color(255, 255, 255));
        sellerArmor.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        sellerArmor.setText("Handlarze");
        sellerArmor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellerArmorMouseClicked(evt);
            }
        });
        sellerArmor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerArmorActionPerformed(evt);
            }
        });

        Arena.setBackground(new java.awt.Color(255, 255, 255));
        Arena.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        Arena.setText("Arena");
        Arena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArenaMouseClicked(evt);
            }
        });
        Arena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArenaActionPerformed(evt);
            }
        });

        heller.setBackground(new java.awt.Color(255, 255, 255));
        heller.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        heller.setText("Uzdrowiciel");
        heller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hellerMouseClicked(evt);
            }
        });
        heller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hellerActionPerformed(evt);
            }
        });

        Kowal.setBackground(new java.awt.Color(255, 255, 255));
        Kowal.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        Kowal.setText("Kowal");
        Kowal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KowalActionPerformed(evt);
            }
        });

        tawern.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        tawern.setText("Tawerna");
        tawern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tawernActionPerformed(evt);
            }
        });

        work.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        work.setText("Praca");

        javax.swing.GroupLayout MiastoLayout = new javax.swing.GroupLayout(Miasto);
        Miasto.setLayout(MiastoLayout);
        MiastoLayout.setHorizontalGroup(
            MiastoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiastoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MiastoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Arena, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heller, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kowal, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tawern, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(work, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellerArmor, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        MiastoLayout.setVerticalGroup(
            MiastoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiastoLayout.createSequentialGroup()
                .addComponent(sellerArmor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Arena, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(heller, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kowal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tawern, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(work, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        handlarz.addTab("Miasto", Miasto);

        Postać.setBackground(new java.awt.Color(0, 0, 0));

        Stats.setBackground(new java.awt.Color(255, 255, 255));
        Stats.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        Stats.setText("Statystyki");
        Stats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StatsMouseClicked(evt);
            }
        });
        Stats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatsActionPerformed(evt);
            }
        });

        champ.setBackground(new java.awt.Color(255, 255, 255));
        champ.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        champ.setText("Gladiator");
        champ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champActionPerformed(evt);
            }
        });

        skills.setBackground(new java.awt.Color(255, 255, 255));
        skills.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        skills.setText("Umiejętności");
        skills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skillsActionPerformed(evt);
            }
        });

        quests.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        quests.setText("Zadania");
        quests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PostaćLayout = new javax.swing.GroupLayout(Postać);
        Postać.setLayout(PostaćLayout);
        PostaćLayout.setHorizontalGroup(
            PostaćLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PostaćLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PostaćLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quests, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stats, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champ, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(skills, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PostaćLayout.setVerticalGroup(
            PostaćLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PostaćLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(champ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stats, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(skills, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quests, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        handlarz.addTab("Postać", Postać);

        getContentPane().add(handlarz, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 280, 395));

        jLabel1.setBackground(new java.awt.Color(213, 238, 238));
        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/allan/Desktop/gallery_photos_game/tlo2.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 870, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void KatakumbyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KatakumbyMouseClicked
    }//GEN-LAST:event_KatakumbyMouseClicked

    private void KatakumbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KatakumbyActionPerformed
        this.setVisible(false);
       new monsters().setVisible(true);
       
    }//GEN-LAST:event_KatakumbyActionPerformed

    private void StatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsMouseClicked
             object_character.addStats();
    }//GEN-LAST:event_StatsMouseClicked

    private void champActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champActionPerformed

      new Heal().setVisible(true);
    }//GEN-LAST:event_champActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed

      this.dispose();
     
    }//GEN-LAST:event_ExitActionPerformed

    private void StatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatsActionPerformed
        object_character.pobierzOpis();
    }//GEN-LAST:event_StatsActionPerformed

    private void sellerArmorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerArmorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sellerArmorMouseClicked

    private void sellerArmorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerArmorActionPerformed
       this.setVisible(false);
       new dealersMainMain().setVisible(true);
    }//GEN-LAST:event_sellerArmorActionPerformed

    private void hellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hellerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_hellerMouseClicked

    private void hellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hellerActionPerformed
       this.setVisible(false);
       new Heal().setVisible(true);
    }//GEN-LAST:event_hellerActionPerformed

    private void ArenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArenaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ArenaMouseClicked

    private void ArenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArenaActionPerformed

    private void KowalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KowalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KowalActionPerformed

    private void skillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skillsActionPerformed
        this.setVisible(false);
        new Skills().setVisible(true);
    }//GEN-LAST:event_skillsActionPerformed

    private void tawernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tawernActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tawernActionPerformed

    private void questsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questsActionPerformed

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
            java.util.logging.Logger.getLogger(mainMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Arena;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Katakumby;
    private javax.swing.JButton Kowal;
    private javax.swing.JPanel Miasto;
    private javax.swing.JPanel Poczta;
    private javax.swing.JPanel Postać;
    private javax.swing.JButton Stats;
    private javax.swing.JButton champ;
    private javax.swing.JTabbedPane handlarz;
    private javax.swing.JButton heller;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel journey;
    private javax.swing.JButton post;
    private javax.swing.JButton quests;
    private javax.swing.JButton sellerArmor;
    private javax.swing.JButton skills;
    private javax.swing.JButton tawern;
    private javax.swing.JButton work;
    // End of variables declaration//GEN-END:variables
}
