
package ColorPicker;

import java.awt.*;
import static java.awt.BorderLayout.*;
import javax.swing.*;

public class ColorPicker extends JFrame {
    final int width = 600;
    final int height = 300;
    public ColorPicker() {
        setTitle("ColorPicker");
        setLocationByPlatform(true);
        setSize(width, height);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        this.setMinimumSize(new Dimension(600, 300));
        JPanel panel1 = new JPanel(new GridBagLayout());
        JPanel panel2 = new JPanel(new GridLayout());
        panel1.setPreferredSize(new Dimension(width/3,height));
        //panel2.setPreferredSize(new Dimension(WIDTH*2/3,height));
        this.add(panel1,WEST);
        this.add(panel2, CENTER);
        
        
        panel1.setBackground(Color.red);
        //panel2.setBackground(Color.CYAN);
        
        
        JPanel square = new JPanel();
        JPanel colorChange = new JPanel(new GridLayout(7,1));
        
        panel2.add(colorChange);
        colorChange.setPreferredSize(new Dimension(300, 200));
        square.setPreferredSize(new Dimension(150, 150));
        square.setBackground(Color.WHITE);
        panel1.add(square);
        
        JSlider sliderRed = new JSlider(0, 255, 125);
        JSlider sliderGreen = new JSlider(0, 255, 125);
        JSlider sliderBlue = new JSlider(0, 255, 125);
        sliderRed.setPaintLabels(true);
        sliderRed.setPaintTicks(true);
        sliderRed.setSnapToTicks(true);
        sliderRed.setMajorTickSpacing(25);
        sliderRed.setMajorTickSpacing(5);
        sliderGreen.setPaintLabels(true);
        sliderGreen.setPaintTicks(true);
        sliderGreen.setSnapToTicks(true);
        sliderGreen.setMajorTickSpacing(25);
        sliderGreen.setMajorTickSpacing(5);
        sliderBlue.setPaintLabels(true);
        sliderBlue.setPaintTicks(true);
        sliderBlue.setSnapToTicks(true);
        sliderBlue.setMajorTickSpacing(25);
        sliderBlue.setMajorTickSpacing(5);
        
        JLabel textRed = new JLabel("RED");
        colorChange.add(textRed);
        colorChange.add(sliderRed);
        JLabel textGreen = new JLabel("GREEN");
        colorChange.add(textGreen);
        colorChange.add(sliderGreen);
        JLabel textBlue = new JLabel("BLUE");
        colorChange.add(textBlue);
        colorChange.add(sliderBlue);
        
        textRed.setHorizontalAlignment(JLabel.CENTER); 
        textGreen.setHorizontalAlignment(JLabel.CENTER);
        textBlue.setHorizontalAlignment(JLabel.CENTER);
    }
    
}
