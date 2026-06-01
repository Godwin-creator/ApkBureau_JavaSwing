/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swing1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JWindow;

/**
 *
 * @author tkossi
 */
public class Swing1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        creerJframe();
//        CreerJPanel();
//        creerJDialog();
//        JOptionPane.showMessageDialog(null, "Opération bien effectuée");
//        CreerJPanel_old();
        gererEvenements();
        
    }
    
    public static void gererEvenements(){
        
        MaFenetre fenetre = new MaFenetre();
        JButton boutonAjouter = new JButton("Ajouter");
        JButton boutonModifier = new JButton("Modifier");
        
        // Ajout d'évènements
        EcouteurBouttonAjouter ec1 = new EcouteurBouttonAjouter();
        boutonAjouter.addActionListener(ec1);

//        ActionListener ec2 = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                System.out.println(" Bouton 'Modier' selectionné ");
//            }
//        };
        
//        ActionListener ec3 = event -> { System.out.println("Bouton 'Modifier' sélectionné");};
//        ActionListener ec3 = event -> { System.out.println(event.getActionCommand());};
        
        boutonModifier.addActionListener(event -> {System.out.println(event.getActionCommand());});
        
        JPanel panel = new JPanel();
        panel.add(boutonAjouter);
        panel.add(boutonModifier);
        
        fenetre.add(panel);
        fenetre.setVisible(true);
        
    }
    
    public static void CreerJPanel(){
        MaFenetre fenetre = new MaFenetre();
        
        MonPanneau panel1 = new MonPanneau();

        for (int i = 1; i <= 80; i++) {
            panel1.add(new JButton("bouton-" + i));
        }
        
//        JScrollPane jSrollPane = new JScrollPane(panel1);
        
        fenetre.add(panel1);
        JLabel label = new JLabel("Ceci est une étiquette.");
        fenetre.add(label);
        fenetre.setVisible(true);
    }
    
    public static void CreerJPanel_old(){
        JFrame fenetre = new JFrame();
        fenetre.setSize(600, 400);
        fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JPanel panel1 = new JPanel();
//        BorderLayout borderLayout = new BorderLayout();
//        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
        GridLayout gridLayout = new GridLayout(3, 3);
        panel1.setLayout(gridLayout);
        panel1.setBackground(Color.RED);
        
//        JButton boutonNord = new JButton("Bouton Nord");
//        JButton boutonSud = new JButton("Bouton Sud");
//        JButton boutonEst = new JButton("Bouton Est");
//        JButton boutonOuest = new JButton("Bouton Ouest");
//        JButton boutonCentre = new JButton("Bouton Centre");
        
        for (int i = 1; i <= 9; i++) {
            panel1.add(new JButton("bouton-" + i));
        }
//        panel1.add(boutonCentre);
//        panel1.add(boutonEst, BorderLayout.EAST);
//        panel1.add(boutonOuest, BorderLayout.WEST);
//        panel1.add(boutonSud, BorderLayout.SOUTH);
//        panel1.add(boutonNord, BorderLayout.NORTH);

        fenetre.add(panel1);
        fenetre.setVisible(true);
    }
    
    public static void creerJWindow() {
        JWindow w = new JWindow();
        w.setSize(300, 300);
        w.setLocation(500, 100);
        w.setVisible(true);
    }
    
     public static void creerJDialog(){
        JDialog dialogue = new JDialog();
        dialogue.setSize(300,150);
        dialogue.setTitle("Opération en cours ...");
        dialogue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialogue.setVisible(true);
    }
    
    public static void creerJframe(){
      JFrame fenetre1 = new JFrame();    
      fenetre1.setSize(500, 300);
      fenetre1.setTitle("Fenêtre 1");
      fenetre1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fenetre1.setVisible(true);

      JButton bouton1 = new JButton("Premier Button");
      JFrame fenetre2 = new JFrame();    
      fenetre2.setSize(500, 300);
      fenetre2.setTitle("Fenêtre 2");
      fenetre2.add(bouton1);
      fenetre2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      fenetre2.setVisible(true);
    }
    
}
