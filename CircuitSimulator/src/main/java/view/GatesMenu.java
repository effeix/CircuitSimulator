package view;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class GatesMenu extends JPanel {
	public GatesMenu() {

	}
	
	public void createMenu() {
		String[] gate_names = new String[]{"And","FullAdder","HalfAdder","Not","Or","Xor"};
		JComboBox<String> gates = new JComboBox<>(gate_names);
	}
}
