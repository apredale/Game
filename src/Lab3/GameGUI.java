package Lab3;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameGUI extends JFrame implements ActionListener {
	
	public GameGUI() {
		buildWindow();
	}
	
	private JTextArea mainDisplay; // Game's output will go here
	private JTextField input; // Input box for player's commands
	
	public void print(Object obj) {
		mainDisplay.append(obj.toString()+"\n");
	}
	
	public void actionPerformed(ActionEvent e) {
		Game.processCommand(input.getText());
		input.setText("");
	}
	
	private void buildWindow() {
		setTitle("Hotel Game");
		setLayout(new BorderLayout());
		
		mainDisplay = new JTextArea();
		input = new JTextField();
		
		JPanel southPanel = new JPanel(new GridLayout(3, 1));
		JLabel label = new JLabel("What would you like to do?");
		JButton button = new JButton("Execute");
		button.addActionListener(this);
		southPanel.add(label);
		southPanel.add(input);
		southPanel.add(button);
		
		add(mainDisplay, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
}
