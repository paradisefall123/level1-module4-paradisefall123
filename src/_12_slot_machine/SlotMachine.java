package _12_slot_machine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class SlotMachine implements ActionListener {
    JLabel fruit;
    JLabel tree;
    JLabel number;
    public void run() throws MalformedURLException {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setVisible(true);
      //  frame.setSize(600, 600);
        frame.add(panel);
        JButton spinButton = new JButton();
        panel.add(spinButton);
        spinButton.setText("SPIN");
        spinButton.addActionListener(this);
        String cherry="cherry (1).jpg";
        String leaf="leaf.jpeg";
        String seven="seven.jpeg";
        fruit=createLabelImage(cherry);
        
        tree=createLabelImage(leaf);
        number=createLabelImage(seven);

        panel.add(fruit);
      panel.add(tree);
       panel.add(number);
        frame.pack();
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
