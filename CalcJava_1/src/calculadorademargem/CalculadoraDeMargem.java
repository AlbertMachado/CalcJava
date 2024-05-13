/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package calculadorademargem;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author COMPRAS
 */
public class CalculadoraDeMargem {

    public static void main(String[] args) {
        
        UIManager.put("Button.defaultButtonFollowsFocus", Boolean.TRUE);
        TelaCalculadora tcm = new TelaCalculadora();
        tcm.setVisible(true);
        tcm.setAlwaysOnTop( true );

    }
}
