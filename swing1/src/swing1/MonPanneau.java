/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing1;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author tkossi
 */
public class MonPanneau extends JScrollPane {
    
    private JPanel panel = new JPanel();
    
    public MonPanneau(){
        super();
        this.setViewportView(panel);
    }
    
    @Override
    public Component add(Component comp){
        return this.panel.add(comp);
    }
    
}
