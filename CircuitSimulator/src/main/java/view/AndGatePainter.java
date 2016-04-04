package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;

public class AndGatePainter implements LogicGatePainter {

	@Override
	public void drawGate(Graphics2D g2) {
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(5));
		g2.draw(new Line2D.Float(50,70,100,70)); //posX1, posY1, posX2, posY2
		g2.draw(new Line2D.Float(50, 105, 100, 105));
		g2.draw(new Line2D.Float(150, 87, 200, 87));
		g2.draw(new Arc2D.Float(50,50,100,75,-90,180,2)); //X, Y, W, H, start, angle extent, type		
	}

}
