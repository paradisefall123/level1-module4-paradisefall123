package _08_calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JTextField one=new JTextField(17);
    JTextField two=new JTextField(17);
    JLabel label=new JLabel();
    public void run(){
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        JPanel panel=new JPanel();
        JPanel answer=new JPanel();
        JButton addition=new JButton();
        JButton subtraction = new JButton();
        JButton multiply=new JButton();
        JButton divide=new JButton();

        frame.setVisible(true);
        frame.setTitle("Simple Calculator");

        panel.add(one);
        panel.add(two);
        panel.add(addition);
        panel.add(multiply);
        panel.add(subtraction);
        panel.add(divide);
        answer.add(label);
        panel.add(answer);


        multiply.setText("Mul");
        divide.setText("Div");
        subtraction.setText("Sub");
        addition.setText("Add");
        subtraction.addActionListener(this);
        divide.addActionListener(this);
        multiply.addActionListener(this);
        addition.addActionListener(this);
        frame.add(panel);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        int uno=Integer.parseInt(one.getText());
        int dos=Integer.parseInt(two.getText());
        if (e.getActionCommand().equals("Add")){

            label.setVisible(true);

            int sum=dos+uno;
            Integer.toString(sum);
            label.setText(sum+" ");
        }else if(e.getActionCommand().equals("Sub")){
            label.setVisible(true);
            int difference=uno-dos;
            Integer.toString(difference);
            label.setText(difference+" ");
        }else if(e.getActionCommand().equals("Mul")){
            label.setVisible(true);
            int product=uno*dos;
            Integer.toString(product);
            label.setText(product+" ");
        }else if(e.getActionCommand().equals("Div")){
            label.setVisible(true);
            int quotient=uno/dos;
            Integer.toString(quotient);
            label.setText(quotient+" ");
        }


    }
}
