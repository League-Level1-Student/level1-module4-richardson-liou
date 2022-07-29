package _12_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spin = new JButton();
	
	public void spin() {
		frame.setPreferredSize(new Dimension(400,100));
		frame.add(panel);
		panel.add(spin);
		
		spin.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonpressed = (JButton) e.getSource();
		
		if(buttonpressed == spin) {
			int rand1 = new Random().nextInt(3);
			int rand2 = new Random().nextInt(3);
			int rand3 = new Random().nextInt(3);
			if (rand1 == 1){
				//display cherry
			}
			else if(rand1 ==2) {
				//display lime
			}
			else if(rand1 == 3) {
				//display orange
			}
		}
		
	}
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
}
