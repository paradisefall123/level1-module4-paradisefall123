package _12_slot_machine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class SlotMachine implements ActionListener {
    Icon cherryIcon;
    Icon leafIcon;
    Icon sevenIcon;
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
        cherryIcon = createIcon(cherry);
        leafIcon = createIcon(leaf);
        sevenIcon = createIcon(seven);
        slot1 = new JLabel(cherryIcon);
        slot2 = new JLabel(leafIcon);
        slot3 = new JLabel(sevenIcon);
        panel.add(spinButton);
        panel.add(slot2);
        panel.add(slot1);
        panel.add(slot3);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public void updatePanel(JLabel slot) throws MalformedURLException {
        Random reel = new Random();
        int nextSlot = reel.nextInt(3);
        if (nextSlot == 0) {
            slot.setIcon(leafIcon);
            System.out.println("leaf");
        } else if (nextSlot == 1) {
            slot.setIcon(cherryIcon);
            System.out.println("cherry");
        } else {
            slot.setIcon(sevenIcon);
            System.out.println("seven");
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

    private Icon createIcon(String fileName) {
        URL imageURL = getClass().getResource(fileName);
        if (imageURL == null) {
            System.err.println("Could not find image " + fileName);
            return null;
        }

        Icon icon = new ImageIcon(imageURL);
        return icon;

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            updatePanel(slot1);
            updatePanel(slot2);
            updatePanel(slot3);
            if (slot1.getIcon().equals(slot2.getIcon()) && slot2.getIcon().equals(slot3.getIcon())) {
                JOptionPane.showMessageDialog(null, "WIN");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }
}
