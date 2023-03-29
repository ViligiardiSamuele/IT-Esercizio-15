package esercizio.pkg15;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{

    private JLabel nome, cognome, altezza, peso, coloreOcchi, coloreCapelli;
    public MyFrame(String title) throws HeadlessException {
        super(title);
        this.setSize(400,400);
        //this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        nome = new JLabel("Nome: Samuele");
        nome.setForeground(Color.red);
        nome.setSize(100,20);
        cognome = new JLabel("Cognome: Viligiardi");
        cognome.setForeground(Color.BLUE);
        cognome.setSize(101,21);
        altezza = new JLabel("Altezza: 180cm");
        altezza.setForeground(Color.CYAN);
        altezza.setSize(102,22);
        peso = new JLabel("Peso: 47KG");
        peso.setForeground(Color.DARK_GRAY);
        peso.setSize(103,23);
        coloreOcchi = new JLabel("Colore occhi: Marrone");
        coloreOcchi.setForeground(Color.GRAY);
        coloreOcchi.setSize(104,24);
        coloreCapelli = new JLabel("Colore capelli: Marrone");
        coloreCapelli.setForeground(Color.GREEN);
        coloreCapelli.setSize(205,25);
        this.setLayout(new GridLayout(6,1));
        this.add(nome);
        this.add(cognome);
        this.add(altezza);
        this.add(peso);
        this.add(coloreOcchi);
        this.add(coloreCapelli);
        this.setVisible(true);
    }
    
}
