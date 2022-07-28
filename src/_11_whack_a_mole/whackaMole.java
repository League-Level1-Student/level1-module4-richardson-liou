package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whackaMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Date startTime = new Date();
	int molesWhacked = 0;
	int whacks = 0;
	int notWhacked = 0;
	
	public void drawButtons(int random) {
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(300, 400));
		frame.add(panel);
		
		for(int i =0; i<24; i++){
			JButton button = new JButton();
			
			if(i==random) {
				button.setText("mole");
				
			}
			
			panel.add(button);
			button.addActionListener(this);
			
	
		}
		frame.pack();
		
		
	}
	
	 static void speak(String words) {
	        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
	            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
	                    + words + "');\"";
	            try {
	                Runtime.getRuntime().exec( cmd ).waitFor();
	            } catch( Exception e ) {
	                e.printStackTrace();
	            }
	        } else {
	            try {
	                Runtime.getRuntime().exec( "say " + words ).waitFor();
	            } catch( Exception e ) {
	                e.printStackTrace();
	            }
	        }
	    }
	 
	 private void endGame(Date timeAtStart, int molesWhacked) { 
		    Date timeAtEnd = new Date();
		    JOptionPane.showMessageDialog(null, "Your whack rate is "
		            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
		                  + " moles per second.");
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonpressed = (JButton) e.getSource();
		
		
			
		if (buttonpressed.getText().equals("mole")) {
			speak("You hit a mole!");
			molesWhacked +=1;
			whacks+=1;
			frame.remove(panel);
			panel = new JPanel();
			drawButtons(new Random().nextInt(24));
		}
		else {
			switch(notWhacked) {
			case 0:
				speak("You missed!");
				break;
			case 1:
				speak("Try again");
				break;
			case 2:
				speak("So close");
				break;
			default:
				speak("You missed!");
				break;
			}
			whacks+=1;
			notWhacked +=1;
			frame.remove(panel);
			panel = new JPanel();
			drawButtons(new Random().nextInt(24));
			
		}
		if (whacks ==10) {
			endGame(startTime, molesWhacked);
		}
		else if(notWhacked ==5) {
			endGame(startTime, molesWhacked);
		}
		
		
	}

	
}
