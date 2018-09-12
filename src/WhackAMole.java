import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame;
	JPanel panel;
	Random r= new Random();
	JButton moleButton;
	int count=0;
	int countLosses=0;
	boolean firstTime=true;
	Date timeAtStart;
	

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
			 moleButton= button;
			 
			}
		}

	}

	void start() {
		frame = new JFrame();
		panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(300, 300);
		int num= r.nextInt(24);
		drawButtons(num);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		if(firstTime) {
			
		 timeAtStart= new Date();
		 firstTime=false;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getSource()==moleButton) {
			System.out.println("You hit the mole!");
			frame.dispose();
			frame.setVisible(true);
			start();
			playSound("correct.wav");
			count= count +1;
		}else {
			System.out.println("WRONG!!!!");
			speak("try again");
			countLosses=countLosses+1;
			
		}
		if(count==10) {
		
			endGame(timeAtStart,count);
		}else if(countLosses==5) {
			System.out.println("You have lost the game.");
			endGame(timeAtStart, countLosses);
		}
		
	}
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	     private void playSound(String fileName) {
	         AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	         sound.play();
	    

	}
	     private void endGame(Date timeAtStart, int molesWhacked) {
	         Date timeAtEnd = new Date();
	         JOptionPane.showMessageDialog(null, "Your whack rate is "
	              + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	              + " moles per second.");
	    }
}
