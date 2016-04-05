package model;

public class OrGate extends LogicGate {

	public OrGate (InputPin inputPin, InputPin inputPin2) {
		pins.add(inputPin);
		pins.add(inputPin2);
	}
	
	@Override
	public boolean getOutputValue(int index) {
		boolean A = pins.get(0).getSource().getOutputValue(pins.get(0).getIndex());
		boolean B = pins.get(1).getSource().getOutputValue(pins.get(1).getIndex());
		return A || B;
	}


}
