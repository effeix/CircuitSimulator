package controller;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import model.AndGate;
import model.FullAdderGate;
import model.HalfAdderGate;
import model.InputPin;
import model.LogicGate;
import model.NotGate;
import model.OrGate;
import model.Switch;
import model.XorGate;

public class GateHandler {
	
	private ArrayList<Switch> switches = new ArrayList<>();
    private ArrayList<JCheckBox> switchList;
    private ArrayList<InputPin> inputPins = new ArrayList<>();
    private JComboBox<String> gates;
	
	private LogicGate andGate;
	private LogicGate orGate;
	private LogicGate notGate;
	private LogicGate fullAdder;
	private LogicGate halfAdder;
	private LogicGate xorGate;
	private LogicGate logicGate;
	
	
	
	public GateHandler (ArrayList<JCheckBox> switchList, JComboBox<String> gates) {
		
		this.switchList = switchList;
		this.gates = gates;

		switches.add(new Switch());
		switches.add(new Switch());
		switches.add(new Switch());
		
		inputPins.add(new InputPin(switches.get(0)));
		inputPins.add(new InputPin(switches.get(1)));
		inputPins.add(new InputPin(switches.get(2)));
		
		andGate = new AndGate(inputPins.get(0), inputPins.get(1));
		orGate = new OrGate(inputPins.get(0), inputPins.get(1));
		notGate = new NotGate(inputPins.get(0));
		xorGate = new XorGate(inputPins.get(0), inputPins.get(1));
		fullAdder = new FullAdderGate(inputPins.get(0), inputPins.get(1), inputPins.get(2));
		halfAdder= new HalfAdderGate(inputPins.get(0), inputPins.get(1));
		
		logicGate = andGate;
		

	}

	
	public void itemStateChanged (ItemEvent e, ArrayList<JCheckBox> output) {
		
		Object item = gates.getSelectedItem();
		
		for (int i=0; i < logicGate.getNumberOfInputPins(); i ++) {
			if (switchList.get(i).isSelected()) {
				switches.get(i).turnOn();
			}
			else {
				switches.get(i).turnOff();
			}
		}
		
		if (item == "And") {
			this.logicGate = andGate;
		}
		
		if (item == "Or") {
			this.logicGate = orGate;
		}
		
		if (item == "Not") {
			this.logicGate = notGate;
		}
		
		if (item == "FullAdder") {
			this.logicGate = fullAdder;
		}
		
		if (item == "HalfAdder") {
			this.logicGate = halfAdder;
		}
		
		if (item == "Xor") {
			this.logicGate = xorGate;
		}
		for (int i=0; i<logicGate.getNumberOfOutputPins(); i++) {
			checkGate(output, i);	
		}
	}
	
	
	public void checkGate (ArrayList<JCheckBox> outputs, int index) {			
				
		outputs.get(index).setSelected(logicGate.getOutputValue(index));
		if (switchList.get(1).isSelected()) {
		System.out.println(logicGate.getOutputValue(index));
		}
		
		}
	
	public LogicGate getLogicGate () {
		return this.logicGate;
	}



}
