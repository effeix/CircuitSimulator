package model;

public class XorGate extends LogicGate {
	
	//Input pins for the XorGate
	private InputPin pinA;
	private InputPin pinB;
	
	//Set the input pins for the XorGate
	public void setPin(InputPin pinA, InputPin pinB) {
		this.pinA = pinA;
		this.pinB = pinB;
	}
	
	//Gates used to compose XorGate
	NotGate not1 = new NotGate();
	NotGate not2 = new NotGate();
	AndGate and1 = new AndGate();
	AndGate and2 = new AndGate();
	OrGate or = new OrGate();
	
	@Override
	public boolean getOutputValue(int index) {
		//Building the XorGate in 5 steps
		
		//Step 1 - Setting pinA and pinB (XorGate inputs) as input for the NotGates
		not1.setPin(pinA);
		not2.setPin(pinB);
		
		//Step 2 - Creating pins for the NotGates outputs
		InputPin outNot1 = new InputPin();
		outNot1.setSource(not1);
		InputPin outNot2 = new InputPin();
		outNot2.setSource(not2);
		
		//Step 3 - Connecting the NotGates to the AndGates
		and1.setPin(pinA, outNot2);
		and2.setPin(pinB, outNot1);
		
		//Step 4 - Creating pins for the AndGates outputs
		InputPin outAnd1 = new InputPin();
		outAnd1.setSource(and1);
		InputPin outAnd2 = new InputPin();
		outAnd2.setSource(and2);
		
		//Step 5 - Connecting the AndGates to the OrGate
		or.setPin(outAnd1, outAnd2);
		
		//Return the output of the OrGate (XorGate output)
		return or.getOutputValue(0);
	}

	@Override
	public InputPin getInputPin(int index) {
		// TODO Auto-generated method stub
		return null;
	}	
}

