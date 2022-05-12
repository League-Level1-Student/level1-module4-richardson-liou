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
	JButton eng = new JButton(">>");
	JButton pig = new JButton("<<");
	int pos;
	char ch;
	
	public void run(){
		frame.setPreferredSize(new Dimension(600,70));
		english.setPreferredSize(new Dimension(200,50));
		piglatin.setPreferredSize(new Dimension(200,50));
		
		panel.add(english);
		panel.add(eng);
		panel.add(pig);
		panel.add(piglatin);
		frame.add(panel);
		
		frame.setVisible(true);
		frame.pack();
		
		pig.addActionListener((ActionListener) this);
		eng.addActionListener((ActionListener) this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == eng) {
			translateToPig();
		}
		else if(buttonPressed == pig) {
			System.out.println("op");
		}
		
	}
	public void translateToPig() {
		String word = english.getText();
		for (int i = 0; i<word.length(); i++) {
			ch= word.charAt(i);
			if (isVowel(ch)) {
				pos = i;
				break;
			}
		}
		if(pos == 0) {
			piglatin.setText(word +"yay");
		}
		else {
			String a = word.substring(pos); 
            String b = word.substring(0, pos); 
            piglatin.setText(a+"-"+b+"ay");
        }
    }

	public void translateToEng() {
		String word = piglatin.getText();
		
	}
	
	
	private boolean isVowel(char character) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
            return true;
        }
		return false;
	}
}
