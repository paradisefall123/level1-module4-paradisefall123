package _09_latest_tweet;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GetLatestTweet implements ActionListener {
    public void run(){
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        JTextField text=new JTextField(17);
        JButton button=new JButton();
        frame.setVisible(true);
        frame.add(panel);
        panel.add(text);
        panel.add(button);
        frame.setTitle("The Amazing Tweet Retriever");
        frame.setSize(500,400);
        button.setText("Search the Twitterverse");
        button.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand()+" Tweet,Tweet");
    }
}
