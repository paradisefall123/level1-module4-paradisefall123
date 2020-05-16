package _11_whack_a_mole;

import javax.swing.*;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

public class WhackAMole implements ActionListener {


    private JPanel panel;
    private String s;
    private int num;
    private JFrame frame;

    public void run() {
        frame = new JFrame();
        panel = new JPanel();
        frame.add(panel);
        frame.setTitle("Whack a Button for Fame and Glory");
        frame.setSize(250, 300);
        Random ran = new Random();
        num = ran.nextInt(25);
        frame.setVisible(true);
        drawButtons(num);
        frame.validate();
    }

    public void drawButtons(int num) {
        for (int i = 1; i < 25; i++) {
            JButton button;
            s = Integer.toString(i);
            if (i == num) {
                button = new JButton("mole!");

            } else {
                button = new JButton(s);
            }
            button.addActionListener(this);

            button.setActionCommand(s);
            panel.add(button);

        }
    }


    private void playSound(String fileName) {
        AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
        sound.play();
    }
    private void endGame(Date timeAtStart, int molesWhacked) {
        Date timeAtEnd = new Date();
        JOptionPane.showMessageDialog(null, "Your whack rate is "
                + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                + " moles per second.");
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Pressed!");
        int p = Integer.parseInt(s);
        if(p!=num){
        JOptionPane.showMessageDialog(null, "Missed!");
        frame.dispose();
        run();
        }else{
        JOptionPane.showMessageDialog(null, "Yay!");
        }
    }
}
