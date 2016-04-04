package view;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class Panel extends JPanel {
	static final long serialVersionUID = 475623984138162L;
	private final static int HEIGHT = 400;
	private final static int WIDTH = 750;
	

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		//Set background color
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT); //posX, posY, width, height
		
		//Buttons on/off
		Image on = new ImageIcon("C:/Users/Rafael/Documents/GitHub/CircuitSimulator/CircuitSimulator/src/imgs/on.png").getImage();
		Image off = new ImageIcon("C:/Users/Rafael/Documents/GitHub/CircuitSimulator/CircuitSimulator/src/imgs/off.png").getImage();
		
		g.drawImage(on, 100, 100, null);
		g.drawImage(off, 200, 200, null);
		
		//Draw AndGate
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(5));
		g2.draw(new Line2D.Float(50,70,100,70)); //posX1, posY1, posX2, posY2
		g2.draw(new Line2D.Float(50, 105, 100, 105));
		g2.draw(new Line2D.Float(150, 87, 200, 87));
		g2.draw(new Arc2D.Float(50,50,100,75,-90,180,2)); //X, Y, W, H, start, angle extent, type
		
		repaint();
	}

}
