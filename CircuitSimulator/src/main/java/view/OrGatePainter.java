package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class OrGatePainter implements LogicGatePainter {
	
	@Override
	public void drawGate(Graphics2D g2) {
		
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(5));
		g2.drawLine(50,70,115,70); 
		g2.drawLine(50, 105, 115, 105);
		g2.drawArc(70, 50, 50, 75, -90, 180);
		g2.drawArc(42, 50, 120, 75, -90, 180);
		g2.drawLine(165,87,195,87);	
		
	}

}
