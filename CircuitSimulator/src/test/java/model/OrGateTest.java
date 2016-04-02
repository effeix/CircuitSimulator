package model;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class OrGateTest {	
	@Test
	public void Input00() {
		//Since our switches objects start at false, we don't need to toggle their state to test the 0 x 0 case
		
		//Components for the circuit
		OrGate or = new OrGate();
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		
		//Create and set input objects
		InputPin pinA = new InputPin();
		pinA.setSource(switch1);
		InputPin pinB = new InputPin();
		pinB.setSource(switch2);
		or.setPin(pinA, pinB);
		
		//Test if output if false
		Assert.assertFalse(or.getOutputValue(0));
	}
	
	@Test
	public void Input01() {
		//Components for the circuit
		OrGate or = new OrGate();
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		
		//Set input B (switch2) as 1
		switch2.toggleState();
		
		//Create and set input objects
		InputPin pinA = new InputPin();
		pinA.setSource(switch1);
		InputPin pinB = new InputPin();
		pinB.setSource(switch2);
		or.setPin(pinA, pinB);
				
		//Test if the output is false
		Assert.assertTrue(or.getOutputValue(0));	
	}
	
	@Test
	public void Input10() {
		//Components for the circuit
		OrGate or = new OrGate();
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
				
		//Set input A (switch1) as 1
		switch1.toggleState();
		
		//Create and set input objects
		InputPin pinA = new InputPin();
		pinA.setSource(switch1);
		InputPin pinB = new InputPin();
		pinB.setSource(switch2);
		or.setPin(pinA, pinB);
		
		//Test if the output is false
		Assert.assertTrue(or.getOutputValue(0));
	}
	
	@Test
	public void Input11() {
		//Components for the circuit
		OrGate or = new OrGate();
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
						
		//Set both inputs as 1
		switch1.toggleState();
		switch2.toggleState();
				
		//Create and set input objects
		InputPin pinA = new InputPin();
		pinA.setSource(switch1);
		InputPin pinB = new InputPin();
		pinB.setSource(switch2);
		or.setPin(pinA, pinB);
				
		//Test if the output is true
		Assert.assertTrue(or.getOutputValue(0));
	}
}
