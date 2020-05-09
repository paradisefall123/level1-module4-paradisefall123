package _11_whack_a_mole;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
            System.out.println("draw button; " + i);

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
    private void playSound(String fileName) {
        AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
        sound.play();
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Pressed!");
        int p = Integer.parseInt(s);
        if(p!=num){
        speak("Wrong");
        frame.dispose();
        run();
        }else if(p==num ){

        }
    }
}
