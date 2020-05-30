package _11_whack_a_mole;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

public class WhackAMole implements ActionListener {

    private Date timestart;
    private JPanel panel;
    private String s;
    private int nummole;
    private JFrame frame;
    private int count=0;
    private int missed=0;

    public void run() {
        frame = new JFrame();
        panel = new JPanel();
        frame.add(panel);
        frame.setTitle("Whack a Button for Fame and Glory");
        frame.setSize(250, 300);
        Random ran = new Random();
        nummole = ran.nextInt(24);
        frame.setVisible(true);
        timestart=new Date();
        drawButtons(nummole);
        frame.validate();
    }

    public void drawButtons(int num) {
        for (int i = 0; i < 24; i++) {
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


    private void endGame(Date timeAtStart, int molesWhacked) {
        Date timeAtEnd = new Date();
        JOptionPane.showMessageDialog(null, "Your whack rate is "
                + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                + " moles per second.");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Pressed! "+actionEvent.getActionCommand());
       Random missedcom=new Random(4);

        int button = Integer.parseInt(actionEvent.getActionCommand());
        if (button!= nummole) {
            JOptionPane.showMessageDialog(null, "Missed!");
            missed++;
            frame.dispose();
            run();
        } else {
           JOptionPane.showMessageDialog(null, "Yay!");
           count++;
            frame.dispose();
            run();
        }
        if(missed==5){
        JOptionPane.showMessageDialog(null,"You have lost!");
        frame.dispose();
        }

        else if(count==10){
            endGame(timestart,count);

        }
    }
}
