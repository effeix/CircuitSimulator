package model;

public class AndGate extends LogicGate {
	
	private boolean A;
	private boolean B;
	public AndGate(InputPin inputPin, InputPin inputPin2) {
		pins.add(inputPin);
		pins.add(inputPin2);		

	}
	
	@Override
	public boolean getOutputValue(int index) {
		A = pins.get(0).getSource().getOutputValue(pins.get(0).getIndex());
		B = pins.get(1).getSource().getOutputValue(pins.get(1).getIndex());
		outputs[0] =  A && B;
		return outputs[index];
	}

	

}
