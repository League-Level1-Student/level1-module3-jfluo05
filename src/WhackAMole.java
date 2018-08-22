import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener{
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	
	void start() {
		
		for (int i = 0; i < 22; i++) {
			JButton button= new JButton();
			panel.add(button);
			button.addActionListener(this);
		}
		}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		e.getSource();
	}

	

}
