package _12_slot_machine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class SlotMachine implements ActionListener {
    JLabel slot1;
    JLabel slot2;
    JLabel slot3;
    JPanel panel;
    JFrame frame;
    String cherry = "cherry.jpg";
    String leaf = "leaf.jpeg";
    String seven = "seven.jpeg";

    public void run() throws MalformedURLException {
        initializeDisplay();

    }

    public void initializeDisplay() throws MalformedURLException {
        frame = new JFrame();
        panel = new JPanel();
        JButton spinButton = new JButton();
        spinButton.setSize(70, 70);
        spinButton.setText("SPIN");
        spinButton.addActionListener(this);
        slot1 = createLabelImage(cherry);
        slot2 = createLabelImage(leaf);
        slot3 = createLabelImage(seven);
        panel.add(spinButton);
        panel.add(slot2);
        panel.add(slot1);
        panel.add(slot3);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public void updatePanel() throws MalformedURLException {
        Random reel = new Random();
        int slot = reel.nextInt(3);
        if (slot == 0) {
            slot1 = createLabelImage(leaf);
        } else if (slot == 1) {
            slot1 = createLabelImage(cherry);
        } else {
            slot1 = createLabelImage(seven);
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
        try {
            updatePanel();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
