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

public class NastySurprise implements ActionListener{
	private JFrame frame= new JFrame();
	private JPanel panel= new JPanel();
	private JButton trickButton= new JButton();
	private JButton treatButton= new JButton();
	
public static void main(String[] args) {
	NastySurprise NS= new NastySurprise();
	NS.start();
	
}
void start() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(trickButton);
	trickButton.setText("Trick");
	treatButton.setText("Treat");
	treatButton.addActionListener(this);
	trickButton.addActionListener(this);
	
	panel.add(treatButton);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==trickButton) {
		showPictureFromTheInternet("http://www.laughspark.info/uploadfiles/funny-cute-puppy-taking-flower-for-her-m-635768408212156839-15898.jpg");
	}else {
		showPictureFromTheInternet("https://i.ytimg.com/vi/V08WRasGLG8/hqdefault.jpg");
	}
}
private void showPictureFromTheInternet(String imageUrl) {
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
}
