package view;

import javax.swing.JFrame;

public class Main {
	
	public static void main (String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	            Panel screen = new Panel();
	            JFrame frame = new JFrame("Labyrinth Generator");
	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            frame.setContentPane(screen);
	            frame.pack();
	            frame.setVisible(true);
	        }
	    });
		
	}

}
