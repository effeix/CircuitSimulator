package model;

public class NotGate extends LogicGate {
	private InputPin pinA;
	
	@Override
	public boolean getOutputValue(int index) {
		boolean A = pinA.getSource().getOutputValue(pinA.getIndex());
		return !A;
	}
}
