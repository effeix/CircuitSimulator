package view;

import java.awt.*;
import javax.swing.*;

public class MainWindow extends JPanel{
	private final static int HEIGHT = 400;
	private final static int WIDTH = 750;
	
	public static void main(String[] args) {
		createWindow();
	}
	
	public static void createWindow() {
		JFrame frame = new JFrame("Circuit Simulator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.add(new MainWindow());
		
		//SETTINGS
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT); //PosX, PosY, width, height
		g.setColor(Color.BLACK);
		g.drawLine(10, 10, 50, 50);
	}
}
