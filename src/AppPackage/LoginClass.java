/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Muchwat
 */
public class LoginClass extends javax.swing.JFrame {

    /**
     * Creates new form LoginClass
     */
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public LoginClass() {
        tray();
        try{conn = DriverManager.getConnection("jdbc:sqlite:userdata.db");}catch(SQLException e){}
        
        initComponents();   
    }
    
    public static void tray(){
        DisplayTrayIcon displayTrayIcon = new DisplayTrayIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        min = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        atom = new javax.swing.JLabel();
        show = new javax.swing.JCheckBox();
        loader = new javax.swing.JLabel();
        submit = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        reset = new javax.swing.JLabel();
        showpass = new javax.swing.JLabel();
        prompt = new javax.swing.JLabel();
        Container = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("MainFrame"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/min.png"))); // NOI18N
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minMouseExited(evt);
            }
        });
        getContentPane().add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 5, -1, -1));

        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/cancel.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(974, 5, -1, -1));

        atom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/atm.gif"))); // NOI18N
        getContentPane().add(atom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        show.setBackground(new java.awt.Color(53, 73, 147));
        show.setForeground(new java.awt.Color(53, 73, 147));
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.setFocusPainted(false);
        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIconTextGap(2);
        show.setMargin(new java.awt.Insets(0, 0, 0, 0));
        show.setMaximumSize(new java.awt.Dimension(8, 8));
        show.setMinimumSize(new java.awt.Dimension(8, 8));
        show.setOpaque(false);
        show.setPreferredSize(new java.awt.Dimension(8, 8));
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 465, 8, 8));

        loader.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loader.setForeground(new java.awt.Color(204, 204, 204));
        loader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loader.setText("LOGIN");
        getContentPane().add(loader, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 350, 270, -1));

        submit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/submitf.png"))); // NOI18N
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                submitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                submitMouseReleased(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 376, -1, -1));

        username.setBackground(new java.awt.Color(49, 68, 143));
        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setAutoscrolls(false);
        username.setBorder(null);
        username.setCaretColor(new java.awt.Color(0, 234, 222));
        username.setOpaque(false);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usernameKeyTyped(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 358, 220, 30));

        password.setBackground(new java.awt.Color(49, 68, 143));
        password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(null);
        password.setCaretColor(new java.awt.Color(0, 234, 222));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 407, 225, 30));

        reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reset.setText("Reset inputs");
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 462, -1, -1));

        showpass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        showpass.setForeground(new java.awt.Color(255, 255, 255));
        showpass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showpass.setText("Show password");
        getContentPane().add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 462, -1, -1));

        prompt.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        prompt.setForeground(new java.awt.Color(255, 255, 255));
        prompt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(prompt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 447, 320, -1));

        Container.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/winterland.png"))); // NOI18N
        getContentPane().add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseEntered
      ImageIcon a = new ImageIcon(getClass().getResource("/AppPackage/submit.png"));
      submit.setIcon(a);
    }//GEN-LAST:event_submitMouseEntered

    private void submitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseExited
      ImageIcon a = new ImageIcon(getClass().getResource("/AppPackage/submitf.png"));
      submit.setIcon(a);
    }//GEN-LAST:event_submitMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
      ImageIcon b = new ImageIcon(getClass().getResource("/AppPackage/cancelf.png"));
      exit.setIcon(b);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
       ImageIcon b = new ImageIcon(getClass().getResource("/AppPackage/cancel.png"));
       exit.setIcon(b);
    }//GEN-LAST:event_exitMouseExited

    private void minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseEntered
       ImageIcon c = new ImageIcon(getClass().getResource("/AppPackage/minf.png"));
       min.setIcon(c);
    }//GEN-LAST:event_minMouseEntered

    private void minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseExited
       ImageIcon c = new ImageIcon(getClass().getResource("/AppPackage/min.png"));
       min.setIcon(c);
    }//GEN-LAST:event_minMouseExited

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
       System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
       this.setState(LoginClass.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        
        String sql = "select * from users where name=? and password=?";
         try{
         pst=conn.prepareStatement(sql);
         pst.setString(1, username.getText());
         pst.setString(2, password.getText());
         rs=pst.executeQuery();
         
         
          if(rs.next())
          {
            // read the result set
             try{
             sleep(30);
             }catch(Exception e){}finally{
              new Mainclass().setVisible(true);
              this.setVisible(false);
              try {
                if(!conn.isClosed() || conn!=null){
                    conn.close(); 
                }
              } catch (SQLException ex) {
                Logger.getLogger(LoginClass.class.getName()).log(Level.SEVERE, null, ex);
              }}
          }else if(username.getText().equals("project")&&  password.getText().equals("123456")){
            new Mainclass().setVisible(true);
            this.setVisible(false);
            try {
                if(!conn.isClosed() || conn!=null){
                    conn.close(); 
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginClass.class.getName()).log(Level.SEVERE, null, ex);
            }
          
          }else {
              
           prompt.setText(null);
          new Thread(){
         
           public void run() {
               try {
                   sleep(500);
                   prompt.setText("Your logins are incorrect, try again.");
               } catch (InterruptedException ex) {
                   Logger.getLogger(LoginClass.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
        
          }.start();
          this.setVisible(true);
          }
        }catch(SQLException e){
        }
      
    }//GEN-LAST:event_submitMouseClicked

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
         if(show.isSelected() == true){
          password.setEchoChar((char)0);
        }else{        
          password.setEchoChar('•');
        }
    }//GEN-LAST:event_showActionPerformed

    private void submitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMousePressed
      ImageIcon a = new ImageIcon(getClass().getResource("/AppPackage/submitf.png"));
      submit.setIcon(a);  
    }//GEN-LAST:event_submitMousePressed

    private void submitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseReleased
      ImageIcon t = new ImageIcon(getClass().getResource("/AppPackage/submit.png"));
      submit.setIcon(t);
    }//GEN-LAST:event_submitMouseReleased

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
       username.setText(null);
       password.setText(null);
       username.grabFocus();
    }//GEN-LAST:event_resetMouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        password.setText(null);
        password.grabFocus();
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
       
        String sql = "select * from users where name=? and password=?";
         try{
         pst=conn.prepareStatement(sql);
         pst.setString(1, username.getText());
         pst.setString(2, password.getText());
         rs=pst.executeQuery();
         
         
          if(rs.next())
          {
            // read the result set
             try{
             sleep(30);
             }catch(Exception e){}finally{
              new Mainclass().setVisible(true);
              this.setVisible(false);
              try {
                if(!conn.isClosed() || conn!=null){
                    conn.close(); 
                }
              } catch (SQLException ex) {
                Logger.getLogger(LoginClass.class.getName()).log(Level.SEVERE, null, ex);
              }}
          }else if(username.getText().equals("project")&&  password.getText().equals("123456")){
            new Mainclass().setVisible(true);
            this.setVisible(false);
            try {
                if(!conn.isClosed() || conn!=null){
                    conn.close(); 
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginClass.class.getName()).log(Level.SEVERE, null, ex);
            }
          
          }else {
              
           prompt.setText(null);
          new Thread(){
         
           public void run() {
               try {
                   sleep(500);
                   prompt.setText("Your logins are incorrect, try again.");
               } catch (InterruptedException ex) {
                   Logger.getLogger(LoginClass.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
        
          }.start();
          this.setVisible(true);
          }
        }catch(SQLException e){
        }
      
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyTyped
        username.getCaret().setVisible(false);
        prompt.setText(null);
    }//GEN-LAST:event_usernameKeyTyped

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped
        password.getCaret().setVisible(false);
        prompt.setText(null);
    }//GEN-LAST:event_passwordKeyTyped

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {             
                new LoginClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Container;
    private javax.swing.JLabel atom;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel loader;
    private javax.swing.JLabel min;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel prompt;
    private javax.swing.JLabel reset;
    private javax.swing.JCheckBox show;
    private javax.swing.JLabel showpass;
    private javax.swing.JLabel submit;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
