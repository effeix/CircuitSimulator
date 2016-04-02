package view;

import java.awt.*;
import javax.swing.*;

public class MainWindow {
	public static void main(String[] args) {
		createWindow();
	}
	
	public static void createWindow() {
		JFrame frame = new JFrame("Circuit Simulator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setPreferredSize(new Dimension(750,400));
		
		//SETTINGS
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
}
