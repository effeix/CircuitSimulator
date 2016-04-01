package model;

public class NotGate extends LogicGate {
	private InputPin pin;
	
	@Override
	public boolean getOutputValue(int index) {
		boolean npin = pin.getSource().getOutputValue(pin.getIndex());
		return !npin;
	}
	
	public void setPin(InputPin Pin){
		this.pin = Pin;
	}
}
