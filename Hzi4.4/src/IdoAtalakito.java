
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class IdoAtalakito extends JFrame implements ActionListener {
    
    private JButton bt1;
    private JTextField field11;
    private JTextField field12;
    private JTextField field13;
    private JTextField field14;
    private JTextField field21;
    private JTextField field22;
    private JTextField field23;
    private JTextField field24;
    private JTextField field31;
    private JTextField field32;
    private JTextField field33;
    private JTextField field34;
    private JLabel lb1;
    private JLabel lb2;
    private JLabel lb3;
    private JLabel lb4;
    private JLabel lb11;
    private JLabel lb21;
    private JLabel lb31;
    private JLabel lb41;
    private JLabel lb12;
    private JLabel lb22;
    private JLabel lb32;
    private JLabel lb42;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    
    private IdoAtalakito() throws HeadlessException {
        super("IdoAtalakito");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bt1 = new JButton("Szamol");
        
        field11 = new JTextField(6);
        field12 = new JTextField(6);
        field13 = new JTextField(6);
        field14 = new JTextField(6);
        field21 = new JTextField(6);
        field22 = new JTextField(6);
        field23 = new JTextField(6);
        field24 = new JTextField(6);
        field31 = new JTextField(6);
        field32 = new JTextField(6);
        field33 = new JTextField(6);
        field34 = new JTextField(6);
        
        lb1 = new JLabel("nap");
        lb2 = new JLabel("ora");
        lb3 = new JLabel("perc");
        lb4 = new JLabel("masodperc");
        lb11 = new JLabel("nap");
        lb21 = new JLabel("ora");
        lb31 = new JLabel("perc");
        lb41 = new JLabel("masodperc");
        lb12 = new JLabel("nap");
        lb22 = new JLabel("ora");
        lb32 = new JLabel("perc");
        lb42 = new JLabel("masodperc");
        
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        
        GridLayout gr = new GridLayout(4,1);
        setLayout(gr);
        
        GridLayout gr1 = new GridLayout(1,1);
        
        p1.add(field11);
        p1.add(lb1);
        p1.add(field12);
        p1.add(lb2);
        p1.add(field13);
        p1.add(lb3);
        p1.add(field14);
        p1.add(lb4);
        
        p2.add(field21);
        p2.add(lb11);
        p2.add(field22);
        p2.add(lb21);
        p2.add(field23);
        p2.add(lb31);
        p2.add(field24);
        p2.add(lb41);
        
        p3.add(bt1);
        p3.setLayout(gr1);
        
        p4.add(field31);
        p4.add(lb12);
        p4.add(field32);
        p4.add(lb22);
        p4.add(field33);
        p4.add(lb32);
        p4.add(field34);
        p4.add(lb42);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        
        bt1.addActionListener(this);
        
        pack();
    }
    
    public static void main(String[] args) {
        IdoAtalakito ido = new IdoAtalakito();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt1){
            int ora=0;
            int perc=0;
            int masodperc=0;
            int nap=0;
            
            masodperc=Integer.parseInt(field14.getText())+Integer.parseInt(field24.getText());
            
            if(masodperc>59)
            {
                masodperc-=60;
                perc++;
            }
            
            perc=perc+Integer.parseInt(field13.getText())+Integer.parseInt(field23.getText());
            
            if(perc>59)
            {
                perc-=60;
                ora++;
            }
            
            ora=ora+Integer.parseInt(field12.getText())+Integer.parseInt(field22.getText());
            
            if(ora>23)
            {
                ora-=24;
                nap++;
            }
            
            nap=nap+Integer.parseInt(field11.getText())+Integer.parseInt(field21.getText());
            
            field31.setText(Integer.toString(nap));
            field32.setText(Integer.toString(ora));
            field33.setText(Integer.toString(perc));
            field34.setText(Integer.toString(masodperc));
        }
            
    }
    
}
