package _12_slot_machine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class SlotMachine implements ActionListener {
    JLabel fruit;
    JLabel tree;
    JLabel number;
    JPanel panel;
    JFrame frame;

    public void run() throws MalformedURLException {
        initializeDisplay();
        updatePanel1();

    }

    public void initializeDisplay() throws MalformedURLException {
        frame = new JFrame();
        panel = new JPanel();
        JButton spinButton = new JButton();
        spinButton.setSize(70, 70);
        spinButton.setText("SPIN");
        spinButton.addActionListener(this);
        String cherry = "cherry.jpg";
        String leaf = "leaf.jpeg";
        String seven = "seven.jpeg";
        fruit = createLabelImage(cherry);
        tree = createLabelImage(leaf);
        number = createLabelImage(seven);
        panel.add(spinButton);
        panel.add(tree);
        panel.add(fruit);
        panel.add(number);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }



    public void updatePanel1() {
        updatePanel(panel);
    }


    public void updatePanel(JPanel panel) {
        Random reel = new Random();
        int slot = reel.nextInt(3);
        if (slot == 0) {
            panel.add(tree);
        } else if (slot == 1) {
            panel.add(fruit);
        } else {
            panel.add(number);
        }
    }

    private JLabel createLabelImage(String fileName) throws MalformedURLException {
        URL imageURL = getClass().getResource(fileName);
        if (imageURL == null) {
            System.err.println("Could not find image " + fileName);
            return new JLabel();
        }
        Icon icon = new ImageIcon(imageURL);
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setSize(100, 100);
        return imageLabel;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        frame.dispose();
        
        updatePanel1();
    }
}
