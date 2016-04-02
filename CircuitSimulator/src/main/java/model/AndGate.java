package model;

public class AndGate extends LogicGate {
	private InputPin pinA;
	private InputPin pinB;
	
	public void setPin(InputPin pinA, InputPin pinB) {
		this.pinA = pinA;
		this.pinB = pinB;
	}
	
	@Override
	public boolean getOutputValue(int index) {
		boolean A = pinA.getSource().getOutputValue(pinA.getIndex());
		boolean B = pinB.getSource().getOutputValue(pinB.getIndex());
		return A && B;
	}
}
