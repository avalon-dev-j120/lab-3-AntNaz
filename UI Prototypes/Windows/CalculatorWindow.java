
package Windows;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
    private int buttonSize = 50;
            
    public CalculatorWindow (){        
        setTitle("Calculator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setVisible(true);
        setSize(width, height);
        LayoutManager layout = new FlowLayout(FlowLayout.LEFT);
        setLayout(layout);
                
        button1 = new JButton("1");
        button1.setPreferredSize(new Dimension(buttonSize,buttonSize));
        button2 = new JButton("2");
        button2.setPreferredSize(new Dimension(buttonSize,buttonSize));
        button3 = new JButton("3");
        button3.setPreferredSize(new Dimension(buttonSize,buttonSize));
        add(button1, BorderLayout.EAST);
        add(button2, BorderLayout.CENTER);
        add(button3, BorderLayout.WEST);
        
    }
     
}
