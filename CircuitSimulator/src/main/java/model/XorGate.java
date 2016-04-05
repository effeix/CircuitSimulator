package model;

public class XorGate extends LogicGate {
	
	//Gates used to compose XorGate
	NotGate not1;
	NotGate not2;
	AndGate and1;
	AndGate and2;
	OrGate or;
	
	//Set the input pins for the XorGate
	public XorGate(InputPin input1, InputPin input2) {
		pins.add(input1);
		pins.add(input2);
		
		not1 = new NotGate(pins.get(0));
		not2 = new NotGate(pins.get(1));

		and1 = new AndGate(new InputPin(not1), pins.get(1));
		and2 = new AndGate(pins.get(0), new InputPin(not2));
		
		or = new OrGate(new InputPin(and1), new InputPin(and2));

	}
	

	
	@Override
	public boolean getOutputValue(int index) {
		return this.or.getOutputValue(0);
	}

	@Override
	public InputPin getInputPin(int index) {
		return pins.get(index);
	}	
}

