/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author tkossi
 */
public class EcouteurBouttonAjouter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand());
//        System.out.println("Boutton 'Ajouter' sélectionné.");
    }
    
}
