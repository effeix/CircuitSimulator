package model;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class NotGateTest {

	@Test
	public void Input0() {
		//Since our switches objects start at false, we don't need to toggle their state to test the 0 x 0 case
		
		//Components for the circuit
		NotGate not = new NotGate();
		Switch switch1 = new Switch();
		
		//Create and set input objects
		InputPin pin = new InputPin();
		pin.setSource(switch1);
		not.setPin(pin);
		
		//Test if output if false
		Assert.assertTrue(not.getOutputValue(0));
	}
	
	@Test
	public void Input1() {
		//Components for the circuit
		NotGate not = new NotGate();
		Switch switch1 = new Switch();
		
		//Set input A (switch1) as 1
		switch1.toggleState();
		
		//Create and set input objects
		InputPin pinA = new InputPin();
		pinA.setSource(switch1);
		not.setPin(pinA);
				
		//Test if the output is false
		Assert.assertFalse(not.getOutputValue(0));	
	}
}
