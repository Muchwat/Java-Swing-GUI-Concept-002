/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.awt.*;
import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.ui.RectangleInsets;

/**
 *
 * @author Muchwat
 */


public class Temperature extends javax.swing.JFrame {
  
    public Temperature() {
        try {

            JFrame window = new JFrame();
            window.setSize(1000,615);
            window.setBackground(Color.blue.darker());
            double value = 55;
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (int) ((dimension.getWidth() - window.getWidth()) / 2);
            int y = (int) ((dimension.getHeight() - window.getHeight()) / 2);
            window.setLocation(x, y);
            DefaultValueDataset dataset = new DefaultValueDataset(value);
            
            ThermometerPlot thermometerplot = new ThermometerPlot(dataset);
            thermometerplot.setSubrangePaint(0, Color.green.darker());
            thermometerplot.setSubrangePaint(1, Color.orange);
            thermometerplot.setSubrangePaint(2,Color.red);
            JFreeChart jfreechart = new JFreeChart("Temperature readings", JFreeChart.DEFAULT_TITLE_FONT, thermometerplot, true);
            thermometerplot.setInsets(new RectangleInsets(5D, 5D, 5D, 5D));
            thermometerplot.setPadding(new RectangleInsets(10D, 10D, 10D, 10D));
            thermometerplot.setThermometerStroke(new BasicStroke(2.0F));
            thermometerplot.setThermometerPaint(Color.BLUE);
           
            thermometerplot.setGap(3);
            
            window.add(new ChartPanel(jfreechart),BorderLayout.CENTER);
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
                new Temperature().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    // End of variables declaration                   
}