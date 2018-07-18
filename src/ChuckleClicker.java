import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	private JFrame frame= new JFrame();
	private JPanel panel= new JPanel();
	private JButton button1= new JButton();
	private JButton button2= new JButton();

	
public static void main(String[] args) {
	
	ChuckleClicker CC= new ChuckleClicker();
	CC.makeButtons();
	
}
void makeButtons(){
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	button1.setText("Joke");
	button2.setText("punchline");
	frame.pack();
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	button1.addActionListener(this);
	button2.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	
	if(e.getSource()==button1) {
		JOptionPane.showMessageDialog(null, "What did the plate say to the fork?");
	}else {
		JOptionPane.showMessageDialog(null, "Lunch is on me.");
	}
}
}
