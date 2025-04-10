package Gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Enhance version of code using OOP

public class GUI implements ActionListener{

    private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	
	public GUI() {
		createFrame();
		createButton();
		createLabel();
		addComponentsToFrame();

	}

	private void createFrame() {
		frame = new JFrame("Our GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void createButton() {
		JButton button = new JButton("Click me");
		button.addActionListener(this);
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
	}

	private void createLabel() {
		label = new JLabel("Number of clicks: 0");
		panel.add(label);
	}

	private void addComponentsToFrame() {
		frame.add(panel, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}		

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks: " + count);
	}

	
	public static void main(String[] args) {
		new GUI(); 

	}
}




		/*

  simple code from the tutorial of Alex Leee(YT) :

  

		JFrame frame = new JFrame();
		
		JButton button = new JButton("Click me");
		button.addActionListener(this);
		JLabel label = new JLabel("Number of clicks: 0");
		
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new GUI(); 

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks: " + count);
	}

}
 */ 
		
