package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whackaMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton mole = new JButton("mole!");
		
	
	public void drawButtons(int rand) {
		frame.setPreferredSize(new Dimension(600, 900));
		frame.add(panel);
		
		
		for(int i =0; i<25; i++){
			if(i==rand) {
				
				panel.add(mole);
			}
			else {
				panel.add(new JButton());
			}
			frame.pack();
		mole.addActionListener((ActionListener) this);
		}
		
	}
	m
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
		if (buttonpressed == mole) {
			
		}
		else {
			speak("You missed!");
		}
		
	}

	
}
