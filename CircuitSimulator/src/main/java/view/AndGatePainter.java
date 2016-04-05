package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class AndGatePainter implements LogicGatePainter {

@Override
	public void drawGate(Graphics2D g2) {
		
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(5));
		/*
		g2.drawLine(50,70,100,70); //posX1, posY1, posX2, posY2
		g2.drawLine(50, 105, 100, 105);
		g2.drawLine(150, 87, 180, 87);
		g2.drawLine(100,50,100,125);
		g2.drawArc(50,50,100,75,-90,180); */
		
		g2.draw(new Rectangle2D.Float(130,50,50,120));
		g2.drawLine(100,80,130,80);
		g2.drawLine(100,110,130,110);
		g2.drawLine(100,140,130,140);
		g2.drawLine(180,90,210,90);
		g2.drawLine(180,130,210,130);
	}
}
	