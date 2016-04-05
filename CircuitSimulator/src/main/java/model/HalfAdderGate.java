package model;

public class HalfAdderGate extends LogicGate {
	private boolean[] outputs = new boolean[2];
	//Gates used to compose XorGate
	private XorGate xor;
	private AndGate and;
	//Set the input pins for the XorGate
	public HalfAdderGate(InputPin input1, InputPin input2) {
		pins.add(input1);
		pins.add(input2);
		
	}

	@Override
	public boolean getOutputValue(int index) {
		
		xor = new XorGate(pins.get(0), pins.get(1));
		and = new AndGate(pins.get(0), pins.get(1)));
		
		outputs[0] = xor.getOutputValue(0);
		outputs[1] = and.getOutputValue(0);
		return outputs[index];

	}

	@Override
	public InputPin getInputPin(int index) {
		return pins.get(index);
	}
	
	public int getNumberOfOutputPins () {
		return outputs.length;
	}


}
