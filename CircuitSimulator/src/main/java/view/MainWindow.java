package view;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class MainWindow extends JPanel{
	private final static int HEIGHT = 400;
	private final static int WIDTH = 750;
	
	public static void main(String[] args) {
		drawWindow();
	}
	
	public static void drawWindow() {
		JFrame frame = new JFrame("Circuit Simulator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.setResizable(false);
		frame.add(new MainWindow());
		
		//SETTINGS
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		//Set background color
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT); //PosX, PosY, width, height
		
		//Draw AndGate
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(5));
		g2.draw(new Line2D.Float(50,70,100,70)); //X1, Y1, X2, Y2
		g2.draw(new Line2D.Float(50, 105, 100, 105));
		g2.draw(new Line2D.Float(150, 87, 200, 87));
		g2.draw(new Arc2D.Float(50,50,100,75,-90,180,2)); //X, Y, W, H, start, angle extent, type
		}
}
