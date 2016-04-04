package view;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class Panel extends JPanel {
	static final long serialVersionUID = 475623984138162L;
	JCheckBox switch1 = new JCheckBox("Switch 1");
	JCheckBox switch2 = new JCheckBox("Switch 2");
	JPanel switchPanel = new JPanel(new GridLayout(2, 0));
	
	public Panel() {
		super(new BorderLayout());
		switchPanel.add(switch1);
		switchPanel.add(switch2);
		this.add(switchPanel, BorderLayout.LINE_START);
	}

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		//Draw AndGate
		AndGatePainter p = new AndGatePainter();
		p.drawGate(g2);
	}

}
