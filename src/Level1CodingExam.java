import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level1CodingExam implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JButton red;
    JButton green;
    JButton blue;
    JButton yellow;

    void run() {
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel();
        yellow = new JButton();
        red = new JButton();
        blue = new JButton();
        green = new JButton();

        frame.setVisible(true);
        frame.setTitle("Color Teacher");
        frame.add(panel);
        panel.add(yellow);
        panel.add(red);
        panel.add(blue);
        panel.add(green);
        yellow.addActionListener(this);
        red.addActionListener(this);
        blue.addActionListener(this);
        green.addActionListener(this);
        yellow.setOpaque(true);
        yellow.setBackground(Color.yellow);

        red.setBackground(Color.red);
        red.setOpaque(true);
        blue.setBackground(Color.blue);
        blue.setOpaque(true);
        green.setBackground(Color.green);
        green.setOpaque(true);
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == yellow) {
            JOptionPane.showMessageDialog(null, "In Egypt, yellow is the color of mourning.");
        } else if (actionEvent.getSource() == red) {
            JOptionPane.showMessageDialog(null, "Women can see more shades of red than men.");
        } else if (actionEvent.getSource() == blue) {
            JOptionPane.showMessageDialog(null, "The color blue is the least common color in foods we eat. ");
        } else {
            JOptionPane.showMessageDialog(null, "Night goggles are green because human eyes can differentiate more shades of green than any other color.");
        }
    }
}
