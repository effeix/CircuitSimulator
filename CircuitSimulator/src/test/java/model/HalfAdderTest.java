package model;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class HalfAdderTest {

	@Test
	public void Input00() {
		//Since our switches objects start at false, we don't need to toggle their state to test the 0 x 0 case
		
		//Components for the circuit
		HalfAdderGate halfAdder = new HalfAdderGate();
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		
		//Create and set input objects
		InputPin pinA = new InputPin();
		pinA.setSource(switch1);
		InputPin pinB = new InputPin();
		pinB.setSource(switch2);
		halfAdder.setPin(pinA, pinB);
		
		//Test if outputs are false
		Assert.assertFalse(halfAdder.getOutputValue(0)); //Sum
		Assert.assertFalse(halfAdder.getOutputValue(1)); //Carry
	}
	
	@Test
	public void Input01() {
		//Components for the circuit
		HalfAdderGate halfAdder = new HalfAdderGate();
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		
		//Set input B (switch2) as 1
		switch2.toggleState();
		
		//Create and set input objects
		InputPin pinA = new InputPin();
		pinA.setSource(switch1);
		InputPin pinB = new InputPin();
		pinB.setSource(switch2);
		halfAdder.setPin(pinA, pinB);
				
		//Test if the output is false
		Assert.assertTrue(halfAdder.getOutputValue(0)); //Sum
		Assert.assertFalse(halfAdder.getOutputValue(1)); //Carry
	}
	
	@Test
	public void Input10() {
		//Components for the circuit
		HalfAdderGate halfAdder = new HalfAdderGate();
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
				
		//Set input A (switch1) as 1
		switch1.toggleState();
		
		//Create and set input objects
		InputPin pinA = new InputPin();
		pinA.setSource(switch1);
		InputPin pinB = new InputPin();
		pinB.setSource(switch2);
		halfAdder.setPin(pinA, pinB);
		
		//Test if the output is false
		Assert.assertTrue(halfAdder.getOutputValue(0)); //Sum
		Assert.assertFalse(halfAdder.getOutputValue(1)); //Carry
	}
	
	@Test
	public void Input11() {
		//Components for the circuit
		HalfAdderGate halfAdder = new HalfAdderGate();
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
		halfAdder.setPin(pinA, pinB);
				
		//Test if the output is true
		Assert.assertFalse(halfAdder.getOutputValue(0)); //Sum
		Assert.assertTrue(halfAdder.getOutputValue(1)); //Carry
	}
}
