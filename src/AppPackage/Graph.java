/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;


import javax.swing.ImageIcon;


/**
 *
 * @author Muchwat
 */
public class Graph extends javax.swing.JFrame {

    /**
     * Creates new form Graph
     */
    public Graph() {
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

        menu = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();
        humidity = new javax.swing.JLabel();
        temperature = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Container = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/menubtn.png"))); // NOI18N
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMouseExited(evt);
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

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

        tittle.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        tittle.setForeground(new java.awt.Color(255, 255, 255));
        tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle.setText("Temperature and Humidity graphs");
        getContentPane().add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 31, 1000, -1));

        humidity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        humidity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/graphbtn2.png"))); // NOI18N
        humidity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        humidity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                humidityMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                humidityMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                humidityMouseExited(evt);
            }
        });
        getContentPane().add(humidity, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 390, -1, -1));

        temperature.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        temperature.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/graphbtn2.png"))); // NOI18N
        temperature.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        temperature.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                temperatureMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                temperatureMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                temperatureMouseExited(evt);
            }
        });
        getContentPane().add(temperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 390, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/humidimg.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 155, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/tmpimg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 155, -1, -1));

        Container.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Container.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/active.png"))); // NOI18N
        getContentPane().add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
      ImageIcon a = new ImageIcon(getClass().getResource("/AppPackage/cancelf.png"));
      exit.setIcon(a);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
       ImageIcon a = new ImageIcon(getClass().getResource("/AppPackage/cancel.png"));
       exit.setIcon(a);
    }//GEN-LAST:event_exitMouseExited

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseEntered
       ImageIcon a = new ImageIcon(getClass().getResource("/AppPackage/minf.png"));
       min.setIcon(a);
    }//GEN-LAST:event_minMouseEntered

    private void minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseExited
       ImageIcon a = new ImageIcon(getClass().getResource("/AppPackage/min.png"));
       min.setIcon(a);
    }//GEN-LAST:event_minMouseExited

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
       System.exit(0);
    }//GEN-LAST:event_minMouseClicked

    private void menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseEntered
        ImageIcon a = new ImageIcon(getClass().getResource("/AppPackage/menu-btn.png"));
        menu.setIcon(a);
    }//GEN-LAST:event_menuMouseEntered

    private void menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseExited
        ImageIcon a = new ImageIcon(getClass().getResource("/AppPackage/menubtn.png"));
        menu.setIcon(a);
    }//GEN-LAST:event_menuMouseExited

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        new Mainclass().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuMouseClicked

    private void temperatureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temperatureMouseEntered
       ImageIcon t = new ImageIcon(getClass().getResource("/AppPackage/graphbtn1.png"));
       temperature.setIcon(t);
    }//GEN-LAST:event_temperatureMouseEntered

    private void temperatureMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temperatureMouseExited
       ImageIcon t = new ImageIcon(getClass().getResource("/AppPackage/graphbtn2.png"));
       temperature.setIcon(t);
    }//GEN-LAST:event_temperatureMouseExited

    private void temperatureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temperatureMouseClicked
        Graphview graphview = new Graphview();
    }//GEN-LAST:event_temperatureMouseClicked

    private void humidityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_humidityMouseEntered
       ImageIcon t = new ImageIcon(getClass().getResource("/AppPackage/graphbtn1.png"));
       humidity.setIcon(t);
    }//GEN-LAST:event_humidityMouseEntered

    private void humidityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_humidityMouseExited
       ImageIcon t = new ImageIcon(getClass().getResource("/AppPackage/graphbtn2.png"));
       humidity.setIcon(t);
    }//GEN-LAST:event_humidityMouseExited

    private void humidityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_humidityMouseClicked
        HumidityGraph humidityGraph = new HumidityGraph();
    }//GEN-LAST:event_humidityMouseClicked
    
  
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
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graph().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Container;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel humidity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel min;
    private javax.swing.JLabel temperature;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
