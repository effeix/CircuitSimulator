package model;

public class NotGate extends LogicGate {
	private InputPin pin;
	
	@Override
	public boolean getOutputValue(int index) {
		boolean A = pin.getSource().getOutputValue(pin.getIndex());
		return !A;
	}
	
	public void setPin(InputPin Pin){
		this.pin = Pin;
	}
}
