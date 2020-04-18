package _11_whack_a_mole;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class WhackAMole implements ActionListener {


    private JPanel panel;
    private String s;
    private int num;
    public void run() {
        JFrame frame = new JFrame();
        panel = new JPanel();
        frame.add(panel);
        frame.setTitle("Whack a Button for Fame and Glory");
        frame.setSize(250, 300);
        Random ran = new Random();
        num= ran.nextInt(24);
        frame.setVisible(true);
        drawButtons(num);
    }

    public void drawButtons( int num) {
        for (int i = 0; i < 24; i++) {
            JButton button = new JButton();
            button.addActionListener(this);
             s=Integer.toString(i);
            button.setActionCommand(s);
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

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    int p=Integer.parseInt(s);
   //if(){

    //}
    }
}
