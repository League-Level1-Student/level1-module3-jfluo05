import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	public static void main(String[] args) {
		WhackAMole WAM = new WhackAMole();
		WAM.start();
	}

	void drawButtons(int m) {

		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);

			if (i == m) {
				button.setText("Mole");
			}
		}

	}

	void start() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(300, 300);
		Random r = new Random(24);

		drawButtons(r);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		e.getSource();
		System.out.println("Clicked!");
	}

}
