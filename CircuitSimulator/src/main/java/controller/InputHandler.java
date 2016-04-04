package controller;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import view.Panel;

public class InputHandler implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object source = e.getItemSelectable();
		if (source == Panel.switch1) {
			System.out.println("FUNCIONA");
		}
	}
}
