
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Szamolo extends JFrame implements ActionListener {
    

    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;
    private JButton bt5;
    private JButton bt6;
    private JButton bt7;
    private JButton bt8;
    private JButton bt9;
    private JButton bt10;
    private JButton bt11;
    private JButton bt12;
    private JButton bt13;
    private JButton bt14;
    private JButton bt15;
    private JButton bt16;
    private JButton bt17;
    private JButton bt18;
    private JButton bt19;
    private JButton bt20;
    private JButton bt21;
    private JButton bt22;
    private JButton bt23;
    private JButton bt24;
    private JButton bt25;
    private JButton bt26;
    private JButton bt27;
    private JButton bt28;
    
    private JTextField txt;
    
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JPanel p6;
    
    private Szamolo() throws HeadlessException {
        super("Szamolo");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridLayout gr1 = new GridLayout(1,1);
        GridLayout gr2 = new GridLayout(1,4);
        GridLayout gr3 = new GridLayout(1,6);
        GridLayout gr4 = new GridLayout(6,1);
        setLayout(gr4);
   
        bt1 = new JButton("MC");
        bt2 = new JButton("7");
        bt3 = new JButton("8");
        bt4 = new JButton("9");
        bt5 = new JButton("/");
        bt6 = new JButton("sqrt");
        bt7 = new JButton("MR");
        bt8 = new JButton("4");
        bt9 = new JButton("5");
        bt10 = new JButton("6");
        bt11 = new JButton("*");
        bt12 = new JButton("%");
        bt13 = new JButton("MS");
        bt14 = new JButton("1");
        bt15 = new JButton("2");
        bt16 = new JButton("3");
        bt17 = new JButton("-");
        bt18 = new JButton("1/x");
        bt19 = new JButton("M+");
        bt20 = new JButton("0");
        bt21 = new JButton("+/-");
        bt22 = new JButton(".");
        bt23 = new JButton("+");
        bt24 = new JButton("=");
        bt25 = new JButton("");
        bt26 = new JButton("BACKSPACE");
        bt27 = new JButton("CE");
        bt28 = new JButton("C");
        
        txt = new JTextField(30);
        
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
        
        p1.setLayout(gr3);
        p2.setLayout(gr3);
        p3.setLayout(gr3);
        p4.setLayout(gr3);
        p5.setLayout(gr2);
        p6.setLayout(gr1);

        this.add(p6);
        this.add(p5);
        this.add(p4);
        this.add(p3);
        this.add(p2);
        this.add(p1);

        p1.add(bt1);
        p1.add(bt2);
        p1.add(bt3);
        p1.add(bt4);
        p1.add(bt5);
        p1.add(bt6);
        
        p2.add(bt7);
        p2.add(bt8);
        p2.add(bt9);
        p2.add(bt10);
        p2.add(bt11);
        p2.add(bt12);
        
        p3.add(bt13);
        p3.add(bt14);
        p3.add(bt15);
        p3.add(bt16);
        p3.add(bt17);
        p3.add(bt18);
        
        p4.add(bt19);
        p4.add(bt20);
        p4.add(bt21);
        p4.add(bt22);
        p4.add(bt23);
        p4.add(bt24);
        
        p5.add(bt25);
        p5.add(bt26);
        p5.add(bt27);
        p5.add(bt28);
        
        p6.add(txt);
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        bt10.addActionListener(this);
        bt11.addActionListener(this);
        bt12.addActionListener(this);
        bt13.addActionListener(this);
        bt14.addActionListener(this);
        bt15.addActionListener(this);
        bt16.addActionListener(this);
        bt17.addActionListener(this);
        bt18.addActionListener(this);
        bt19.addActionListener(this);
        bt20.addActionListener(this);
        bt22.addActionListener(this);
        bt23.addActionListener(this);
        bt24.addActionListener(this);
        bt25.addActionListener(this);
        bt26.addActionListener(this);
        bt27.addActionListener(this);
        bt28.addActionListener(this);
        
        pack();
    }
    
    public static void main(String[] args) {
        Szamolo sz = new Szamolo();

    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
