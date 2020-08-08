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
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;

    public void run() throws MalformedURLException {
        initializeDisplay();
        updateDisplay();

    }

    public void initializeDisplay() throws MalformedURLException {
        JFrame frame = new JFrame();
      //  frame.setSize(600, 700);
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel1.setSize(200, 200);
        panel2.setSize(200, 200);
        panel3.setSize(200, 200);
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
        frame.add(spinButton);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.pack();
        frame.setVisible(true);
    }

    public void updateDisplay() {
        updatePanel1();
        updatePanel2();
        updatePanel3();
        System.out.println("Display updated");
    }

    public void updatePanel1() {
        updatePanel(panel1);
    }

    public void updatePanel2() {
        updatePanel(panel2);
    }

    public void updatePanel3() {
        updatePanel(panel3);
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
        updateDisplay();
    }
}
