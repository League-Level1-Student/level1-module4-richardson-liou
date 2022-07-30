package _12_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label;
	String orange = "orange.png";
	String cherry = "cherry.jpg";
	String lime = "limed.png";
	
	JButton spin = new JButton("Spin");
	
	public void spin() {
		frame.setPreferredSize(new Dimension(400,130));
		frame.setVisible(true);
		
		frame.add(panel);
		panel.add(spin);
		frame.pack();
		spin.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonpressed = (JButton) e.getSource();
		frame.remove(panel);
		panel = new JPanel();
		panel.add(spin);
		panel.setPreferredSize(new Dimension(400,130));
		frame.add(panel);
		if(buttonpressed == spin) {
			

			int rand1 = new Random().nextInt(3);
			int rand2 = new Random().nextInt(3);
			int rand3 = new Random().nextInt(3);
			//SLOT 1
			if (rand1 == 0){
				try {
					label = createLabelImage(cherry);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				panel.add(label);
				frame.pack();
			}
			else if(rand1 ==1) {
				try {
					label = createLabelImage(lime);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				panel.add(label);
				frame.pack();
			}
			else if(rand1 == 2) {
				try {
					label = createLabelImage(orange);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				panel.add(label);
				frame.pack();
			}
			
				
			//SLOT 2
			if (rand2 == 0){
				try {
					label = createLabelImage(cherry);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				panel.add(label);
				frame.pack();
			}
			else if(rand2 ==1) {
				try {
					label = createLabelImage(lime);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				panel.add(label);
				frame.pack();
			}
			else if(rand2 == 2) {
				try {
					label = createLabelImage(orange);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
				}
				panel.add(label);
				frame.pack();
			}
				
			//SLOT 3
			if (rand3 == 0){
				try {
					label = createLabelImage(cherry);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				panel.add(label);
				frame.pack();
			}
			
			else if(rand3 ==1) {
				try {
					label = createLabelImage(lime);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				panel.add(label);
				frame.pack();
			}
			
			else if(rand3 == 2) {
				try {
					label = createLabelImage(orange);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				panel.add(label);
				frame.pack();
			}
			if(rand1== rand2 && rand2 == rand3) {
				JOptionPane.showMessageDialog(null, "YOU WIN!");
			}
			}
		
			
		}
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
    
    
}
