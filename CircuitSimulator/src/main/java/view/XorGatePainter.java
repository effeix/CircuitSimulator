package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class XorGatePainter implements LogicGatePainter {
	
	@Override
	public void drawGate(Graphics2D g2) {
		
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(5));
		g2.drawLine(50,70,135,70); 
		g2.drawLine(50, 105, 135, 105);
		g2.drawArc(70, 50, 50, 75, -90, 180);
		g2.drawArc(90, 50, 50, 75, -90, 180);
		g2.drawArc(60, 50, 120, 75, -90, 180);
		g2.drawLine(183,87,215,87);
	}
}
