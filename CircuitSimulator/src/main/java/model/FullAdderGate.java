package model;

public class FullAdderGate extends LogicGate {
	private LogicGate halfAdder1;
	private LogicGate halfAdder2;
	private LogicGate orGate;
	
	private boolean[] outputs = new boolean[2];	
	
	//Set the input pins for the XorGate
	public FullAdderGate(InputPin input1, InputPin input2, InputPin input3) {
		pins.add(input1);
		pins.add(input2);
		pins.add(input3);


		
	}
	
	@Override
	public boolean getOutputValue(int index) {		
		halfAdder2 = new HalfAdderGate(pins.get(1), pins.get(2));
		halfAdder1 = new HalfAdderGate(pins.get(0), new InputPin(halfAdder2));
		orGate = new OrGate(new InputPin(halfAdder1), new InputPin(halfAdder2));
		orGate.getInputPin(0).setIndex(1);
		orGate.getInputPin(1).setIndex(1);
		
		outputs[0] = halfAdder1.getOutputValue(0);
		outputs[1] = orGate.getOutputValue(0);
		return outputs[index];
	}
	
	public int getNumberOfOutputPins () {
		return outputs.length;
	}	
	
}