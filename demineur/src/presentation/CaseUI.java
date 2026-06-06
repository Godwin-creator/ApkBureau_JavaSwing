/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation;

import javax.swing.JButton;
import metier.Case;

/**
 *
 * @author kossi
 */
public class CaseUI extends JButton {
    
    private Case caseMetier;
    
    public CaseUI(Case caseMetier){
        this.caseMetier = caseMetier;
    }
    
}
