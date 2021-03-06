
package AppPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class Graphview extends javax.swing.JFrame {

    /**
     *
     */
    public Graphview() {
        try {

            JFrame window = new JFrame();
            window.setSize(1000,615);
            window.setBackground(Color.blue);
         
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (int) ((dimension.getWidth() - window.getWidth()) / 2);
            int y = (int) ((dimension.getHeight() - window.getHeight()) / 2);
            window.setLocation(x, y);
            
            XYSeries series = new XYSeries("Tempereture"); 
            XYSeriesCollection dataset = new XYSeriesCollection(series);
            JFreeChart chart = ChartFactory.createXYLineChart("Tempereture against Time", "Time(seconds)", "Tempereture(celsius)", dataset);
            window.add(new ChartPanel(chart),BorderLayout.CENTER);
            window.setVisible(true);
           

        } catch (Exception e) {
            System.out.print("Chart exception:" + e);
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graphview().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    // End of variables declaration                   
}