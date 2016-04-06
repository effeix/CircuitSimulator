package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.geom.*;
import java.util.ArrayList;

import javax.print.attribute.standard.OutputDeviceAssigned;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import controller.GateHandler;
import model.AndGate;
import model.FullAdderGate;
import model.LogicGate;
import model.NotGate;
import model.OrGate;
import model.Switch;

public class Panel extends JPanel implements ItemListener {
	static final long serialVersionUID = 475623984138162L;
	
	
	private FullAdderPainter fullAdderPainter = new FullAdderPainter();
	private LogicGatePainter andPainter = new AndGatePainter();

	private JPanel switchBoxes = new JPanel(new GridLayout(3, 0));
	private ArrayList<JCheckBox> switchList = new ArrayList<>();
	private ArrayList<JCheckBox> outputList = new ArrayList<>();
	

	
	private JPanel outputPanel = new JPanel(new GridLayout(2,0));
	private JPanel gatePanel = new GatePanel(andPainter);
	
	private String[] gate_names = new String[]{"And","FullAdder","HalfAdder","Not","Or","Xor"};
	private JComboBox<String> gates = new JComboBox<>(gate_names);
	
	private GateHandler gateHandler;



	
	public Panel() {
		super(new BorderLayout());
		switchBoxes.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		outputPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		outputPanel.setBackground(Color.BLUE);
		switchBoxes.setBackground(Color.RED);
		gatePanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		gatePanel.setBackground(Color.GREEN);
		this.add(gatePanel, BorderLayout.CENTER);
		switchList.add(new JCheckBox("Switch 1"));
		switchList.add(new JCheckBox("Switch 2"));
		switchList.add(new JCheckBox("Switch 3"));
		

		outputList.add(new JCheckBox("Output 1"));
		outputList.add(new JCheckBox("Output 2"));

		
		switchList.get(0).addItemListener(this);
		switchList.get(1).addItemListener(this);
		switchList.get(2).addItemListener(this);

		gateHandler = new GateHandler(switchList, gates);

		for (int i = 0; i<gateHandler.getLogicGate().getNumberOfInputPins();i++) {
			switchBoxes.add(switchList.get(i));
		}
		
		for (int i = 0; i < gateHandler.getLogicGate().getNumberOfOutputPins(); i++){
			outputPanel.add(outputList.get(i));
		}
		
		gates.addItemListener(this);
		this.add(switchBoxes, BorderLayout.WEST);
		this.add(gates, BorderLayout.SOUTH);
		this.add(outputPanel, BorderLayout.EAST);
	}
	

	public void paintComponents (Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		gatePanel.paintComponents(g);
		System.out.println("a s");
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		gateHandler.itemStateChanged(e, outputList);
		
		switchBoxes.removeAll();
		outputPanel.removeAll();
		this.remove(switchBoxes);
		this.remove(outputPanel);
		
		for (int i = 0; i<gateHandler.getLogicGate().getNumberOfInputPins();i++) {
			switchBoxes.add(switchList.get(i));
		}
		for (int i = 0; i < gateHandler.getLogicGate().getNumberOfOutputPins(); i++){
			outputPanel.add(outputList.get(i));
		}

		switchBoxes.revalidate();
		outputPanel.revalidate();
		this.add(switchBoxes, BorderLayout.WEST);
		this.add(outputPanel, BorderLayout.EAST);
		this.revalidate();
		this.repaint();
		
	}

}

