/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;


import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Muchwat
 */
public class DisplayTrayIcon {
    static TrayIcon trayIcon;
    
    public DisplayTrayIcon(){
      
        ShowTrayIcon();
     
    }

    public static final void ShowTrayIcon() {
        if(!SystemTray.isSupported()){
            System.exit(0);
            return;
        }
        final PopupMenu popap = new PopupMenu();
        trayIcon = new TrayIcon(CreateIcon("/images/trayIcon.png","Tray Icon"));
        final SystemTray tray = SystemTray.getSystemTray();
        trayIcon.setToolTip("Developed by\nKevin Muchwat");
        
        MenuItem AboutItem = new MenuItem("Physics Project");
        MenuItem logout = new MenuItem("Logout");
        MenuItem exit = new MenuItem("Exit");
        popap.add(AboutItem);
       
        popap.addSeparator();
        popap.add(logout);
        
        popap.addSeparator();
        popap.add(exit);
        trayIcon.setPopupMenu(popap);
        
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new LoginClass().setVisible(true); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        try{
          tray.add(trayIcon);
        }catch(Exception e){
        
        }
    }
    
    protected static Image CreateIcon(String path,String desc){
       URL ImageURL = DisplayTrayIcon.class.getResource(path);
       return (new ImageIcon(ImageURL,desc)).getImage();
    }
    
}
