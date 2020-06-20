package _11_whack_a_mole;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class SlotMachine implements ActionListener {
    JLabel fruit;
    public void run() throws MalformedURLException {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.add(panel);
        JButton spinButton = new JButton();
        panel.add(spinButton);
        spinButton.setText("SPIN");
        spinButton.addActionListener(this);
        String cherry="cherry.jpg";
        String leaf="leaf.jpeg";
        String seven="seven.jpeg";
        fruit=createLabelImage(cherry);
        panel.add(fruit);
        //createLabelImage("cherry");
        //createLabelImage("leaf.jpeg");
        //createLabelImage("seven.jpeg");
    }

    private JLabel createLabelImage(String fileName) throws MalformedURLException {
        URL imageURL = getClass().getResource(fileName);
        if (imageURL == null) {
            System.err.println("Could not find image " + fileName);
            return new JLabel();
        }
        Icon icon = new ImageIcon(imageURL);
        JLabel imageLabel = new JLabel(icon);
        return imageLabel;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
