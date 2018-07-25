import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener{
	private JFrame frame= new JFrame();
	private JPanel panel=new JPanel();
	private JLabel label= new JLabel();
	private int score;
	
	char currentLetter;

	char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}

public static void main(String[] args) {
	TypingTutor TT= new TypingTutor();
	TT.start();
	
}
void start() {
	currentLetter = generateRandomLetter();
	frame.setVisible(true);
	frame.add(panel);
	panel.add(label);
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.addKeyListener(this);
	label.setText(currentLetter+"");
	frame.setSize(200, 200);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println(e.getKeyChar());
	
	if(currentLetter==e.getKeyChar()) {
		System.out.println("Correct! The letter is "+currentLetter);
		panel.setBackground(Color.green);
		score=score+1;
	}else {
		System.out.println("Wrong! The letter is "+currentLetter+". You answered "+e.getKeyChar());
		panel.setBackground(Color.red);
		
	}
	if(score>=10) {
		showTypingSpeed(10);
	}
	
	currentLetter = generateRandomLetter();
	label.setText(currentLetter+"");

	
}
private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
    Date timeAtEnd = new Date();
    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
    long gameInSeconds = (gameDuration / 1000) % 60;
    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
    int charactersPerMinute = (int) (charactersPerSecond * 60);
    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
}
Date timeAtStart = new Date();

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
