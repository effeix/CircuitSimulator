package model;

public class NotGate extends LogicGate {
	private InputPin pin;
	
	public void setPin(InputPin pinA) {
		this.pin = pinA;
	}
	
	@Override
	public boolean getOutputValue(int index) {
		boolean npin = pin.getSource().getOutputValue(pin.getIndex());
		return !npin;
	}
}
