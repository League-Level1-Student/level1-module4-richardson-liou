package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton("Joke");
	JButton punch = new JButton("Punchline");
	
public static void main(String[] args) {
	ChuckleClicker chuckle = new ChuckleClicker();
	chuckle.makeButtons();
	
}
public void makeButtons() {
	
	
	frame.setVisible(true);
	frame.add(panel);
	panel.add(joke);
	panel.add(punch);
	frame.pack();
	
	joke.addActionListener(this);
	punch.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
if(e.getSource() == joke) {
		JOptionPane.showMessageDialog(null, "Why couldn't the pony sing a lullaby?");
	}
if(e.getSource()==punch) {
	JOptionPane.showMessageDialog(null, "She was a little HORSE");
}
	
}
}
