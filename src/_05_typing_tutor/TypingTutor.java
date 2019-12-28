package _05_typing_tutor;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;


public class TypingTutor implements KeyListener {


    public void run(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        frame.setVisible(true);
        frame.add(panel);
        frame.setTitle("Type or Die");
        frame.addKeyListener(this);
        char currentLetter = generateRandomLetter();
        label.setText(Character.toString(currentLetter));
        label.setFont(label.getFont().deriveFont(28.0f));
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label);
        frame.pack();
    }



    static char generateRandomLetter() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
   if(){

   }

    }
}
