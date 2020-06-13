package _11_whack_a_mole;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class SlotMachine {
    public void run(){
    JFrame frame=new JFrame();
    JPanel panel=new JPanel();
    frame.setVisible(true);

    frame.add(panel);
    JButton spinButton=new JButton();
    panel.add(spinButton);
    spinButton.setText("SPIN");
    }
    private JLabel createLabelImage(String fileName) throws MalformedURLException {
        URL imageURL = getClass().getResource(fileName);
        if (imageURL == null){
            System.err.println("Could not find image " + fileName);
            return new JLabel();
        }
        Icon icon = new ImageIcon(imageURL);
        JLabel imageLabel = new JLabel(icon);
        return imageLabel;
    }

}
