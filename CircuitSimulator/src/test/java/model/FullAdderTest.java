package model;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FullAdderTest {

	@Test
	public void Input000() {
		//Since our switches objects start at false, we don't need to toggle their state to test the 0 x 0 case
		
		//Components for the circuit
		FullAdderGate fullAdder = new FullAdderGate();
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		Switch switch3 = new Switch();
		
		//Create and set input objects
		InputPin pinA = new InputPin();
		pinA.setSource(switch1);
		InputPin pinB = new InputPin();
		pinB.setSource(switch2);
		InputPin pinC = new InputPin();
		pinC.setSource(switch3);
		fullAdder.setPin(pinA, pinB, pinC);
		
		//Test if outputs are false
		Assert.assertFalse(fullAdder.getOutputValue(0)); //Sum
		Assert.assertFalse(fullAdder.getOutputValue(1)); //Carry
	}
	
	@Test
	public void Input001() {
		//Components for the circuit
		FullAdderGate fullAdder = new FullAdderGate();
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		Switch switch3 = new Switch();
		
		//Set input B (switch2) as 1
		switch3.toggleState();
		
		//Create and set input objects
		InputPin pinA = new InputPin();
		pinA.setSource(switch1);
		InputPin pinB = new InputPin();
		pinB.setSource(switch2);
		InputPin pinC = new InputPin();
		pinC.setSource(switch3);
		fullAdder.setPin(pinA, pinB, pinC);
				
		//Test if the output is false
		Assert.assertTrue(fullAdder.getOutputValue(0)); //Sum
		Assert.assertFalse(fullAdder.getOutputValue(1)); //Carry
	}
	
	@Test
	public void Input010() {
		//Components for the circuit
		FullAdderGate fullAdder = new FullAdderGate();
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		Switch switch3 = new Switch();
				
		//Set input A (switch1) as 1
		switch2.toggleState();
		
		//Create and set input objects
		InputPin pinA = new InputPin();
		pinA.setSource(switch1);
		InputPin pinB = new InputPin();
		pinB.setSource(switch2);
		InputPin pinC = new InputPin();
		pinC.setSource(switch3);
		fullAdder.setPin(pinA, pinB, pinC);
		
		//Test if the output is false
		Assert.assertTrue(fullAdder.getOutputValue(0)); //Sum
		Assert.assertFalse(fullAdder.getOutputValue(1)); //Carry
	}
	
	@Test
	public void Input011() {
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
	
	@Test
	public void Input100() {
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
	
	@Test
	public void Input101() {
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
	
	@Test
	public void Input110() {
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
	
	@Test
	public void Input111() {
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
