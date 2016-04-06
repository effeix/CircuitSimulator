package view;

import java.awt.Graphics2D;

import javax.swing.JPanel;

import com.sun.prism.Graphics;

public class GatePanel extends JPanel {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LogicGatePainter painter;
	private Graphics2D g2;
	
	 public GatePanel(LogicGatePainter painter) {
		 this.painter = painter;
	}
	 
	 
	 public void paintComponent (Graphics g) {
		System.out.println("as ");		
		painter.drawGate(g2);
		 
	 }
	 

}
