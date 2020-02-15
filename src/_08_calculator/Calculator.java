package _08_calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    public void run(){
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        JButton addition=new JButton();
        JButton subtraction = new JButton();
        frame.setVisible(true);
        frame.setTitle("Simple Calculator");
        panel.add(addition);
        addition.setText("Add");
        //addition.addActionListener(this);
        frame.add(panel);
        frame.pack();
    }
    public void add(){

    }
    public void multiply(){

    }
    public void subtract(){

    }
    public void divide(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
