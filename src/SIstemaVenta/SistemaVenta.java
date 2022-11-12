/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIstemaVenta;
import Vista.Login;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author carlo
 */
public class SistemaVenta {
    
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        // TODO code application logic here
        UIManager.setLookAndFeel(new McWinLookAndFeel());
        Login lg = new Login();
        lg.setVisible(true);
    }
}
