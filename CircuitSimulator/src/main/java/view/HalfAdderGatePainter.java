package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class HalfAdderGatePainter implements LogicGatePainter {
	
	@Override
	public void drawGate(Graphics2D g2) {
		
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(5));
		g2.draw(new Rectangle2D.Float(130,50,50,90));
		g2.drawLine(100,80,130,80);
		g2.drawLine(100,110,130,110);
		g2.drawLine(180,80,210,80);
		g2.drawLine(180,110,210,110);
	}
}