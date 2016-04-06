package model;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class AndGateTest {

	@Test
	public void Input00() {
		//Since our switches objects start at false, we don't need to toggle their state to test the 0 x 0 case
		
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		InputPin input1 = new InputPin(switch1);
	    InputPin input2 = new InputPin(switch2);
		
		//Components for the circuit
		AndGate and = new AndGate(input1, input2);
		
		//Test if output if false
		Assert.assertFalse(and.getOutputValue(0));
	}
	
	@Test
	public void Input01() {

		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		switch2.turnOn();
		InputPin input1 = new InputPin(switch1);
	    InputPin input2 = new InputPin(switch2);
		
		//Components for the circuit
		AndGate and = new AndGate(input1, input2);
				
		//Test if the output is false
		Assert.assertFalse(and.getOutputValue(0));	
	}
	
	@Test
	public void Input10() {
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		switch1.turnOn();
		InputPin input1 = new InputPin(switch1);
	    InputPin input2 = new InputPin(switch2);
		
		//Components for the circuit
		AndGate and = new AndGate(input1, input2);
		
		//Test if the output is false
		Assert.assertFalse(and.getOutputValue(0));
	}
	
	@Test
	public void Input11() {
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		switch1.turnOn();
		switch2.turnOn();
		InputPin input1 = new InputPin(switch1);
	    InputPin input2 = new InputPin(switch2);
		
		//Components for the circuit
		AndGate and = new AndGate(input1, input2);
		//Test if the output is true
		Assert.assertTrue(and.getOutputValue(0));
	}
}
