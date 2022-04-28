package _08_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel answer = new JLabel();
	
	JTextField num1 = new JTextField();
	JTextField num2 = new JTextField();
	JButton add = new JButton("+");
	JButton subs = new JButton("-");
	JButton div = new JButton("/");
	JButton mult = new JButton("x");
	
	public void run(){
		
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(500, 500));
		num1.setPreferredSize(new Dimension(220, 50));
		num2.setPreferredSize(new Dimension(220, 50));
		
		panel.add(num1);
		panel.add(num2);
		panel.add(add);
		panel.add(subs);
		panel.add(div);
		panel.add(mult);
		frame.add(panel);
		
		
		add.addActionListener(this);
		subs.addActionListener(this);
		div.addActionListener(this);
		mult.addActionListener(this);

		frame.pack();
		
		
	}
	
	public void add() {
		int number1 = Integer.parseInt(num1.getText());
		int number2 = Integer.parseInt(num2.getText());
		answer.setText( number1+ number2+"");
		frame.add(answer);
		frame.pack();
	}
	public void subtract() {
		
	}
	public void multiply() {
		
	}
	public void divide() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed == add) {
			add();
		}
		else if(buttonPressed == subs) {
			subtract();
		}
		else if(buttonPressed == div) {
			divide();
		}
		else if(buttonPressed == mult) {
			multiply();
		}
		
	}
}
