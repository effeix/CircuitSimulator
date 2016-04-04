package view;

import java.awt.Dimension;
import javax.swing.JFrame;

import controller.InputHandler;

public class Main {
	private final static int HEIGHT = 400;
	private final static int WIDTH = 750;
	
	public static void main (String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	        	InputHandler i = new InputHandler();
	            Panel panel = new Panel();
	            JFrame frame = new JFrame("Labyrinth Generator");
	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            frame.setPreferredSize(new Dimension(WIDTH,HEIGHT));
	            frame.setResizable(false);
	            frame.setContentPane(panel);
	            frame.pack();
	            frame.setVisible(true);
	        }
	    });
		
	}

}
