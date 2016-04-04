package view;

import java.awt.*;
import javax.swing.*;

public class MainWindow {
	private static int height = 400;
	private static int width = 750;
	public static void main(String[] args) {
		createWindow();
	}
	
	public static void createWindow() {
		JFrame frame = new JFrame("Circuit Simulator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setPreferredSize(new Dimension(width,height));
		
		//SETTINGS
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
}
