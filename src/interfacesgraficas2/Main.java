/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesgraficas2;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatPropertiesLaf;
import com.formdev.flatlaf.IntelliJTheme;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.multi.MultiLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.plaf.synth.SynthLookAndFeel;

/**
 *
 * @author 34642
 */
public class Main {
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        Aplicacion app = new Aplicacion();
        
     //   UIManager.setLookAndFeel(new FlatCarbonIJTheme());
//        UIManager.put("Button.arc", 100);
//        SwingUtilities.updateComponentTreeUI(app);

        UIManager.setLookAndFeel(new FlatMacLightLaf());
        UIManager.put("TextComponent.arc", 20);
        SwingUtilities.updateComponentTreeUI(app);
        app.setVisible(true); //a mi app hazla visible
        app.setLocationRelativeTo(null); //a mi app ponla relativa a nada
//        
//        try {
//            UIManager.setLookAndFeel( new FlatLightLaf() );
//        } catch( Exception ex ) {
//            System.err.println( "Failed to initialize LaF" );
//        }
    
    }

}
