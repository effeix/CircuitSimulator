package model;

public class NotGate extends LogicGate {
	private InputPin pin;
	
	public void setPin(InputPin pin) {
		this.pin = pin;
	} 
	
	@Override
	public boolean getOutputValue(int index) {
		boolean npin = pin.getSource().getOutputValue(pin.getIndex());
		return !npin;
	}

	@Override
	public InputPin getInputPin(int index) {
		// TODO Auto-generated method stub
		return null;
	}
}
