package view;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.geom.*;

import javax.print.attribute.standard.OutputDeviceAssigned;
import javax.swing.*;

public class Panel extends JPanel implements ItemListener {
	static final long serialVersionUID = 475623984138162L;
	
	public static JCheckBox switch1 = new JCheckBox("Switch 1");
	JCheckBox switch2 = new JCheckBox("Switch 2");
	JCheckBox output = new JCheckBox("Output");
	
	JPanel switchPanel = new JPanel(new GridLayout(2, 0));
	JPanel outputPanel = new JPanel(new GridLayout(1,1));
	
	String[] gate_names = new String[]{"And","FullAdder","HalfAdder","Not","Or","Xor"};
	JComboBox<String> gates = new JComboBox<>(gate_names);
	
	public Panel() {
		super(new BorderLayout());
		output.setEnabled(false);
		switchPanel.add(switch1);
		switchPanel.add(switch2);
		outputPanel.add(output);
		this.add(switchPanel, BorderLayout.LINE_START);
		this.add(outputPanel, BorderLayout.LINE_END);
		this.add(gates, BorderLayout.PAGE_END);
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		//Draw AndGate
		AndGatePainter p = new AndGatePainter();
		p.drawGate(g2);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
	}
}
