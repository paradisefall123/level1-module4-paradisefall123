package _11_whack_a_mole;

import javax.swing.*;
import java.util.Random;

public class WhackAMole {


    private JPanel panel;
    private Random ran;
    public void run() {
        JFrame frame = new JFrame();
        panel = new JPanel();
        frame.add(panel);
        drawButtons(ran);
        frame.setTitle("Whack a Button for Fame and Glory");
        frame.setSize(250, 300);
        ran=new Random(24);
        frame.setVisible(true);

    }

    public void drawButtons( Random ran) {
        for (int i = 0; i < 24; i++) {
            JButton button = new JButton();
            panel.add(button);
        }

    }
    void speak(String words) {
        try {
            Runtime.getRuntime().exec("say " + words).waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void endGame(Date timeAtStart, int molesWhacked) {
        Date timeAtEnd = new Date();
        JOptionPane.showMessageDialog(null, "Your whack rate is "
                + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                + " moles per second.");
    }
}
