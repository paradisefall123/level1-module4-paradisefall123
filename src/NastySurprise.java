
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	public static void main(String[] args) {
		new NastySurprise().createUI();
	}

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		leftButton.setText("Treat");
		rightButton.setText("Trick");
		leftButton.setName("leftbutton");
		rightButton.setName("rightbutton");
		leftButton.addActionListener(this);
		rightButton.addActionListener(this);
		panel.add(rightButton);
		panel.add(leftButton);
		frame.setTitle("Trick or Treat");
		frame.pack();
	}
	public void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}




	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed.getName().equals("rightbutton")) {
			showPictureFromTheInternet("https://scstylecaster.files.wordpress.com/2017/01/arthur.jpg");
		}else{
			showPictureFromTheInternet("https://i.pinimg.com/originals/fd/5a/af/fd5aafab785adeb9cfe4b6ed89405b20.jpg");
		}
	}



}
