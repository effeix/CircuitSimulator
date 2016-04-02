package model;

public class HalfAdderGate extends LogicGate {
	
	private InputPin haPinA;
	private InputPin haPinB;

	public void setPin(InputPin pinA, InputPin pinB) {
		this.haPinA = pinA;
		this.haPinB = pinB;
	}

	@Override
	public boolean getOutputValue(int index) {

	XorGate xor = new XorGate();
	AndGate and = new AndGate();

	xor.setPin(haPinA,haPinB);
	and.setPin(haPinA,haPinB);

	boolean[] out = new boolean[2];

	out[0] = xor.getOutputValue(0);
	out[1] = and.getOutputValue(0);

	return out[index];

	}	


}
