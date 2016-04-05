package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class NotGatePainter implements LogicGatePainter {

	@Override
	public void drawGate(Graphics2D g2) {
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(5));
		g2.drawLine(50,70,100,70); //posX1, posY1, posX2, posY2
		g2.drawLine(100,50,100,90);
		g2.drawLine(100,50,150,70);
		g2.drawLine(100,90,150,70);
		g2.drawArc(150,65,10,10,0,360);
		g2.drawLine(160, 70, 180, 70);
	}
}
