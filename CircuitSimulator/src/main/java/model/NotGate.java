package model;

public class NotGate extends LogicGate {
	private InputPin pin;
	
	public NotGate(InputPin input) {
		pins.add(input);
	}
	
	@Override
	public boolean getOutputValue(int index) {
		boolean npin = pins.get(0).getSource().getOutputValue(index);
		return !npin;
	}

	@Override
	public InputPin getInputPin(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPin(InputPin inputPin) {
		pin = inputPin;
		
	}
}
