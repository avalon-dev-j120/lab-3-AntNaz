
package Calculator;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.*;
import static java.awt.BorderLayout.*;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.*;


/**
 *
 * @author Anton
 */
public class CalculatorWindow extends JFrame {
    final int width = 300;
    final int height = 400;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonEq;
    //private int buttonSize = 50;
            
    public CalculatorWindow (){        
        setTitle("Calculator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setVisible(true);
        setSize(width, height);
        setMaximumSize(new Dimension(400, 500));
        setMinimumSize(new Dimension(100, 200));
        LayoutManager layout = new BorderLayout(10, 10);
        setLayout(layout);
        
        
        JPanel panel1 = new JPanel();
        //panel1.setSize(WIDTH, 400);
        
        panel1.setVisible(true);
        
        //panel1.setMaximumSize(new Dimension(300, 10));
        
        panel1.setBackground(Color.yellow);
        //panel1.setLayout(new FlowLayout());
        
                
        add(panel1, NORTH);
        JPanel panel2 = new JPanel();
        panel2.setSize(100, 100);
        panel2.setVisible(true);
        add(panel2, CENTER);
        JPanel panel3 = new JPanel();
        panel3.setVisible(true);
        add(panel3, SOUTH);
        
        
        panel2.setLayout(new GridLayout(3,3,10,10));
        panel3.setLayout(new GridLayout(1,1,10,10));
//      
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonEq = new JButton("=");
        buttonEq.setPreferredSize(new Dimension(WIDTH, 50));
        
        
        
        panel2.add(button7);
        panel2.add(button8);
        panel2.add(button9);
        panel2.add(button4);
        panel2.add(button5);
        panel2.add(button6);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        
        panel3.add(buttonEq);
        
    }
     
}