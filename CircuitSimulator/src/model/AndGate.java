package model;

public class AndGate extends LogicGate {
	private InputPin pinA;
	private InputPin pinB;
	
	@Override
	public boolean getOutputValue(int index) {
		boolean A = pinA.getSource().getOutputValue(pinA.getIndex());
		boolean B = pinB.getSource().getOutputValue(pinB.getIndex());
		return A && B;
	}
}