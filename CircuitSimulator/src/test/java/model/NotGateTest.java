package model;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class NotGateTest {

	@Test
	public void Input0() {
		//Since our switches objects start at false, we don't need to toggle their state to test the 0 x 0 case
		

		Switch switch1 = new Switch();
		InputPin input1 = new InputPin(switch1);
		
		//Components for the circuit
		NotGate not = new NotGate(input1);
		
		//Test if output if false
		Assert.assertTrue(not.getOutputValue(0));
	}
	
	@Test
	public void Input1() {
		Switch switch1 = new Switch();
		switch1.turnOn();
		InputPin input1 = new InputPin(switch1);
		
		//Components for the circuit
		NotGate not = new NotGate(input1);
				
		//Test if the output is false
		Assert.assertFalse(not.getOutputValue(0));	
	}
}
