package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class GatePainter extends JPanel {
	public void paint(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT); //PosX, PosY, width, height
		g.setColor(Color.BLACK);
		g.drawLine(10, 10, 50, 50);
	}
}
