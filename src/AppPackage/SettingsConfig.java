
package AppPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SettingsConfig {
    
    Properties myproperty = new Properties();
    
    public void saveSettings(String tittle,String value){
     try{
         myproperty.setProperty(tittle, value);
         myproperty.store(new FileOutputStream("settings.txt"), null);
     }catch(IOException e){}
        
    
    }
    
    public String getSettings(String tittle){
     String val="";   
     try{
      myproperty.load(new FileInputStream("settings.txt"));
      val=myproperty.getProperty(tittle);
      
     }catch(IOException e){
     }
    return val;
    }
    
     public void saveConnection(String tittle,String value){
     try{
         myproperty.setProperty(tittle, value);
         myproperty.store(new FileOutputStream("connection.txt"), null);
     }catch(IOException e){}
        
    
    }
     public String getConnection(String tittle){
     String val="";   
     try{
      myproperty.load(new FileInputStream("connection.txt"));
      val=myproperty.getProperty(tittle);
      
     }catch(IOException e){
     }
    return val;
    }
    
}
