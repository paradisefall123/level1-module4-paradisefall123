package _05_typing_tutor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;


public class TypingTutor implements KeyListener {
    char currentLetter = generateRandomLetter();
    JLabel label = new JLabel();
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();


    public void run() {
        frame.setVisible(true);
        frame.add(panel);
        frame.setTitle("Type or Die");
        frame.addKeyListener(this);

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
        System.out.println("you typed: " + currentLetter);
        if (currentLetter == (e.getKeyChar())) {
            System.out.println("correct");
            panel.setBackground(Color.green);
        }else if (currentLetter!=(e.getKeyChar())){
            panel.setBackground(Color.red);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        currentLetter = e.getKeyChar();
        currentLetter = generateRandomLetter();
        label.setText(Character.toString(currentLetter));


    }

}
