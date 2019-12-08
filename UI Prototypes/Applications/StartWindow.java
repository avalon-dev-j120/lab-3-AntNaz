
package Applications;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class StartWindow extends JFrame{
    
    public StartWindow() {
        setTitle("Start Window");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setVisible(true);
        setSize(500, 100);
        setLayout(new GridLayout(1, 2));
        JButton buttonCalculator = new JButton("Calculator");
        JButton buttonColorPicker = new JButton("Color Picker");
        add(buttonCalculator);
        add(buttonColorPicker);
        
        MouseListener calculatorListener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) { 
                new Calculator.Calculator();
            }
        };
        MouseListener colorListener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) { 
                new ColorPicker.ColorPicker();
            }
        };
        buttonCalculator.addMouseListener(calculatorListener);
        buttonColorPicker.addMouseListener(colorListener);
    }
    
}
