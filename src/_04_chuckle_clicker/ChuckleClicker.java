package _04_chuckle_clicker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChuckleClicker implements ActionListener {
    public static void main(String[] args) {
        ChuckleClicker cc = new ChuckleClicker();
        cc.makeButtons();

    }

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton oneb = new JButton();
    JButton twob = new JButton();

    public void makeButtons() {

        frame.setVisible(true);
        frame.add(panel);
        panel.add(oneb);
        oneb.addActionListener(this);
        twob.addActionListener(this);
        oneb.setText("joke");
        twob.setText("punchline");
        panel.add(twob);
        frame.pack();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == oneb) {
            JOptionPane.showMessageDialog(null, "What did the buffalo say to his son when he left for college?");
        } else {
            JOptionPane.showMessageDialog(null, "Bison");
        }
    }
}
