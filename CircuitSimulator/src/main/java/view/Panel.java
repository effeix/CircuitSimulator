package view;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class Panel extends JPanel {
	static final long serialVersionUID = 475623984138162L;

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		//Buttons on/off
		Image on = new ImageIcon("src/imgs/off.png").getImage();
		Image off = new ImageIcon("src/imgs/off.png").getImage();
		
		g.drawImage(on, 100, 100, null);
		g.drawImage(off, 100, 200, null);
		
		//Draw AndGate
		AndGatePainter p = new AndGatePainter();
		p.drawGate(g2);
	}

}
