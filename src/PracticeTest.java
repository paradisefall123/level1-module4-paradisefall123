import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticeTest implements ActionListener {
    JFrame frame;
    JLabel label;
    JButton submit;
    JButton hint;
    JTextField answer;
    JPanel panel;

    void run() {
        frame = new JFrame();


        panel = new JPanel();
        label = new JLabel();
        submit = new JButton();
        hint = new JButton();
        answer = new JTextField(14);
        frame.setVisible(true);
        frame.setTitle("Riddle");
        frame.add(panel);
        panel.add(label);
        panel.add(answer);
        panel.add(submit);
        panel.add(hint);
        answer.addActionListener(this);
        submit.addActionListener(this);
        hint.addActionListener(this);
        submit.setSize(70, 70);
        hint.setSize(70, 70);
        label.setText("What belongs to you, but others use it more than you?");
        submit.setText("Submit");
        hint.setText("Hint");
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton buttonClicked = (JButton) actionEvent.getSource();
        String response = answer.getText();
        if (actionEvent.getActionCommand().equals("Hint")) {
            JOptionPane.showMessageDialog(null, "It was given to you at birth by your parents.");
        } else if (response.equalsIgnoreCase("Your name")) {
            JOptionPane.showMessageDialog(null, "Correct");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect");
        }

    }

}