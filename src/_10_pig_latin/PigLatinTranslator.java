package _10_pig_latin;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField english = new JTextField();
	JTextField piglatin = new JTextField();
	JButton eng = new JButton();
	JButton pig = new JButton();
	
	public PigLatinTranslator() {
		frame.setPreferredSize(new Dimension(500,70));
		english.setPreferredSize(new Dimension(200,50));
		piglatin.setPreferredSize(new Dimension(200,70));
		
		panel.add(eng);
		panel.add(english);
		panel.add(pig);
		panel.add(panel);
		
		frame.setVisible(true);
		frame.pack();
		
		pig.addActionListener((ActionListener) this);
		eng.addActionListener((ActionListener) this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == eng) {
			
		}
		else if(buttonPressed == pig) {
			
		}
	}
}
