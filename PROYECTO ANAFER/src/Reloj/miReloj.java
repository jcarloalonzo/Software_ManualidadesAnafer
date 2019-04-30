

package Reloj;

import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author JUAN
 */
public class miReloj extends Thread {
        JLabel lblReloj;
    
    //constructor
    public miReloj(JLabel lblReloj){
        this.lblReloj=lblReloj;
    }
    
    //puesta en marcha del hilo
    public void run(){
        while(true){
            Date  hoy=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
            lblReloj.setText(sdf.format(hoy));
            try{
                sleep(1000);
            }
            catch (Exception ex){
                
            }
        
        }
    }
}
