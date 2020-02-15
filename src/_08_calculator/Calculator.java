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
        JButton multiply=new JButton();
        JButton divide=new JButton();
        JTextField one=new JTextField();
        JTextField two=new JTextField();
        frame.setVisible(true);
        frame.setTitle("Simple Calculator");
        panel.add(addition);
        panel.add(multiply);
        panel.add(subtraction);
        panel.add(divide);
        panel.add(one);
        panel.add(two);

        multiply.setText("Mul");
        divide.setText("Div");
        subtraction.setText("Sub");
        addition.setText("Add");
        subtraction.addActionListener(this);
        divide.addActionListener(this);
        multiply.addActionListener(this);
        addition.addActionListener(this);
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
