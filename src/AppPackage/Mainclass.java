/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;
import AppPackage.AnimationClass.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;

/**
 *
 * @author Muchwat
 */
public class Mainclass extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Mainclass() {
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

        minimise = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        graphlabel = new javax.swing.JLabel();
        graph = new javax.swing.JLabel();
        thermlabel = new javax.swing.JLabel();
        temp = new javax.swing.JLabel();
        controllabel = new javax.swing.JLabel();
        control = new javax.swing.JLabel();
        userlabel = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        addlabel = new javax.swing.JLabel();
        adduser = new javax.swing.JLabel();
        settinglabel = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        container = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/min.png"))); // NOI18N
        minimise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimiseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimiseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimiseMouseExited(evt);
            }
        });
        getContentPane().add(minimise, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 5, -1, -1));

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/cancel.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(974, 5, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/topcover.PNG"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 43, 845, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/bottomcover.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 530, -1, -1));

        graphlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/graph.png"))); // NOI18N
        getContentPane().add(graphlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 45, 277, -1));

        graph.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        graph.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/grafF.png"))); // NOI18N
        graph.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        graph.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                graphMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                graphMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                graphMouseExited(evt);
            }
        });
        getContentPane().add(graph, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 80, -1, 220));

        thermlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/thermometer.png"))); // NOI18N
        getContentPane().add(thermlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 45, 275, -1));

        temp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/tempF.png"))); // NOI18N
        temp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        temp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tempMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tempMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tempMouseExited(evt);
            }
        });
        getContentPane().add(temp, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 274, 220));

        controllabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/control.png"))); // NOI18N
        getContentPane().add(controllabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 45, 280, -1));

        control.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/oparateF.png"))); // NOI18N
        control.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        control.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                controlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                controlMouseExited(evt);
            }
        });
        getContentPane().add(control, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 80, 280, 220));

        userlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/userdet.png"))); // NOI18N
        getContentPane().add(userlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 532, 276, -1));

        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/userF.png"))); // NOI18N
        user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userMouseExited(evt);
            }
        });
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 305, -1, -1));

        addlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Addusser.png"))); // NOI18N
        getContentPane().add(addlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 532, -1, -1));

        adduser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/adduserF.png"))); // NOI18N
        adduser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adduser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adduserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adduserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adduserMouseExited(evt);
            }
        });
        getContentPane().add(adduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 305, 274, -1));

        settinglabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/settings.png"))); // NOI18N
        getContentPane().add(settinglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 532, 280, -1));

        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/settingF.png"))); // NOI18N
        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        getContentPane().add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 305, -1, -1));

        container.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        container.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Mainbg.png"))); // NOI18N
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
      ImageIcon b = new ImageIcon(getClass().getResource("/AppPackage/cancelf.png"));
      close.setIcon(b);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
      ImageIcon b = new ImageIcon(getClass().getResource("/AppPackage/cancel.png"));
      close.setIcon(b);
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
      System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minimiseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimiseMouseEntered
      ImageIcon c = new ImageIcon(getClass().getResource("/AppPackage/minf.png"));
      minimise.setIcon(c);
    }//GEN-LAST:event_minimiseMouseEntered

    private void minimiseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimiseMouseExited
      ImageIcon c = new ImageIcon(getClass().getResource("/AppPackage/min.png"));
      minimise.setIcon(c);
    }//GEN-LAST:event_minimiseMouseExited

    private void minimiseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimiseMouseClicked
      this.setState(LoginClass.ICONIFIED);
    }//GEN-LAST:event_minimiseMouseClicked

    private void graphMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graphMouseEntered
      AnimationClass anim = new AnimationClass();
      anim.jLabelYDown(45, 80, 5, 1, graphlabel);
      ImageIcon g = new ImageIcon(getClass().getResource("/AppPackage/graf.png"));
      graph.setIcon(g);
      
    }//GEN-LAST:event_graphMouseEntered

    private void graphMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graphMouseExited
      AnimationClass animd = new AnimationClass(); 
      animd.jLabelYUp(80, 45, 5, 1, graphlabel);
      ImageIcon g = new ImageIcon(getClass().getResource("/AppPackage/grafF.png"));
      graph.setIcon(g);
      
    }//GEN-LAST:event_graphMouseExited

    private void tempMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tempMouseEntered
      AnimationClass anima = new AnimationClass();
      anima.jLabelYDown(45, 80, 5, 1, thermlabel);
      ImageIcon t = new ImageIcon(getClass().getResource("/AppPackage/temp.png"));
      temp.setIcon(t);
      
    }//GEN-LAST:event_tempMouseEntered

    private void tempMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tempMouseExited
      AnimationClass animg = new AnimationClass(); 
      animg.jLabelYUp(80, 45, 5, 1, thermlabel);
      ImageIcon t = new ImageIcon(getClass().getResource("/AppPackage/tempF.png"));
      temp.setIcon(t);
      
    }//GEN-LAST:event_tempMouseExited

    private void controlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlMouseEntered
      AnimationClass animu = new AnimationClass();
      animu.jLabelYDown(45, 80, 5, 1, controllabel);
      ImageIcon g = new ImageIcon(getClass().getResource("/AppPackage/oparate.png"));
      control.setIcon(g);
      
    }//GEN-LAST:event_controlMouseEntered

    private void controlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlMouseExited
      AnimationClass animk = new AnimationClass();
      animk.jLabelYUp(80, 45, 5, 1, controllabel);
      ImageIcon g = new ImageIcon(getClass().getResource("/AppPackage/oparateF.png"));
      control.setIcon(g);
      
    }//GEN-LAST:event_controlMouseExited

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
      AnimationClass animh = new AnimationClass();
      animh.jLabelYUp(532, 498, 5, 1, settinglabel);
      ImageIcon s = new ImageIcon(getClass().getResource("/AppPackage/setting.png"));
      settings.setIcon(s);
      
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
      AnimationClass animf = new AnimationClass();
      animf.jLabelYDown(498, 532, 5, 1, settinglabel);
      ImageIcon s = new ImageIcon(getClass().getResource("/AppPackage/settingF.png"));
      settings.setIcon(s);
      
    }//GEN-LAST:event_settingsMouseExited

    private void adduserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adduserMouseEntered
      AnimationClass animo = new AnimationClass();
      animo.jLabelYUp(532, 498, 5, 1, addlabel);
      ImageIcon q = new ImageIcon(getClass().getResource("/AppPackage/adduser.png"));
      adduser.setIcon(q);
      
    }//GEN-LAST:event_adduserMouseEntered

    private void adduserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adduserMouseExited
      AnimationClass animi = new AnimationClass();
      animi.jLabelYDown(498, 532, 5, 1, addlabel);
      ImageIcon q = new ImageIcon(getClass().getResource("/AppPackage/adduserF.png"));
      adduser.setIcon(q);
      
    }//GEN-LAST:event_adduserMouseExited

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
      AnimationClass animl = new AnimationClass();
      animl.jLabelYUp(532, 498, 5, 1, userlabel);
      ImageIcon u = new ImageIcon(getClass().getResource("/AppPackage/user.png"));
      user.setIcon(u);
    }//GEN-LAST:event_userMouseEntered

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
      AnimationClass animn = new AnimationClass();
      animn.jLabelYDown(498, 532, 5, 1, userlabel);
      ImageIcon u = new ImageIcon(getClass().getResource("/AppPackage/userF.png"));
      user.setIcon(u);
    }//GEN-LAST:event_userMouseExited

    private void adduserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adduserMouseClicked
        new Adduser().setVisible(true);
        new Mainclass().dispose();
    }//GEN-LAST:event_adduserMouseClicked

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        try {
            new User().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Mainclass.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Mainclass().dispose();
    }//GEN-LAST:event_userMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        new Settings().setVisible(true);
        new Mainclass().dispose();
    }//GEN-LAST:event_settingsMouseClicked

    private void graphMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graphMouseClicked
        new Graph().setVisible(true);
        new Mainclass().dispose();           
    }//GEN-LAST:event_graphMouseClicked

    private void tempMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tempMouseClicked
        new Temphumidity().setVisible(true);
        new Mainclass().dispose();
    }//GEN-LAST:event_tempMouseClicked

    private void controlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlMouseClicked
        new SystemControl().setVisible(true);
        new Mainclass().dispose();
    }//GEN-LAST:event_controlMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(Mainclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                
                new Mainclass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addlabel;
    private javax.swing.JLabel adduser;
    private javax.swing.JLabel close;
    private javax.swing.JLabel container;
    private javax.swing.JLabel control;
    private javax.swing.JLabel controllabel;
    private javax.swing.JLabel graph;
    private javax.swing.JLabel graphlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel minimise;
    private javax.swing.JLabel settinglabel;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel temp;
    private javax.swing.JLabel thermlabel;
    private javax.swing.JLabel user;
    private javax.swing.JLabel userlabel;
    // End of variables declaration//GEN-END:variables
}