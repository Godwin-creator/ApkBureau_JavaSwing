/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import metier.Partie;

/**
 *
 * @author kossi
 */
public class Plateau extends JFrame {
    
    private Partie partie;
    
    public Plateau(Partie partie){
        this.partie = partie;
        this.setSize(500, 500);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
}
