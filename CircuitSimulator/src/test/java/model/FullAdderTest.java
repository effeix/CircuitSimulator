package model;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FullAdderTest {

	@Test
	public void Input000() {
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		Switch switch3 = new Switch();
		InputPin input1 = new InputPin(switch1);
	    InputPin input2 = new InputPin(switch2);
	    InputPin input3 = new InputPin(switch3);
		
		//Components for the circuit
		LogicGate fullAdder = new FullAdderGate(input1, input2, input3);
		
		//Test if outputs are false
		Assert.assertFalse(fullAdder.getOutputValue(0)); //Sum
		Assert.assertFalse(fullAdder.getOutputValue(1)); //Carry
	}
	
	@Test
	public void Input001() {
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		Switch switch3 = new Switch();
		switch3.turnOn();
		InputPin input1 = new InputPin(switch1);
	    InputPin input2 = new InputPin(switch2);
	    InputPin input3 = new InputPin(switch3);
		
		//Components for the circuit
		LogicGate fullAdder = new FullAdderGate(input1, input2, input3);
		
		//Test if outputs are false
		Assert.assertTrue(fullAdder.getOutputValue(0)); //Sum
		Assert.assertFalse(fullAdder.getOutputValue(1)); //Carry
				
	}
	
	@Test
	public void Input010() {
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		Switch switch3 = new Switch();
		switch2.turnOn();

		InputPin input1 = new InputPin(switch1);
	    InputPin input2 = new InputPin(switch2);
	    InputPin input3 = new InputPin(switch3);
		
		//Components for the circuit
		LogicGate fullAdder = new FullAdderGate(input1, input2, input3);
		
		//Test if outputs are false
		Assert.assertTrue(fullAdder.getOutputValue(0)); //Sum
		Assert.assertFalse(fullAdder.getOutputValue(1)); //Carry
	}
	
	@Test
	public void Input011() {
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		Switch switch3 = new Switch();
		switch1.turnOn();
		switch2.turnOn();

		InputPin input1 = new InputPin(switch1);
	    InputPin input2 = new InputPin(switch2);
	    InputPin input3 = new InputPin(switch3);
		
		//Components for the circuit
		LogicGate fullAdder = new FullAdderGate(input1, input2, input3);
		
		//Test if outputs are false
		Assert.assertFalse(fullAdder.getOutputValue(0)); //Sum
		Assert.assertTrue(fullAdder.getOutputValue(1)); //Carry
	}
	
	@Test
	public void Input100() {
		//Components for the circuit
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		Switch switch3 = new Switch();
		switch1.turnOn();

		InputPin input1 = new InputPin(switch1);
	    InputPin input2 = new InputPin(switch2);
	    InputPin input3 = new InputPin(switch3);
		
		//Components for the circuit
		LogicGate fullAdder = new FullAdderGate(input1, input2, input3);
		
		//Test if outputs are false
		Assert.assertTrue(fullAdder.getOutputValue(0)); //Sum
		Assert.assertFalse(fullAdder.getOutputValue(1)); //Carry
	}
	
	@Test
	public void Input101() {
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		Switch switch3 = new Switch();
		switch1.turnOn();
		switch3.turnOn();

		InputPin input1 = new InputPin(switch1);
	    InputPin input2 = new InputPin(switch2);
	    InputPin input3 = new InputPin(switch3);
		
		//Components for the circuit
		LogicGate fullAdder = new FullAdderGate(input1, input2, input3);
		
		//Test if outputs are false
		Assert.assertFalse(fullAdder.getOutputValue(0)); //Sum
		Assert.assertTrue(fullAdder.getOutputValue(1)); //Carry
			
	}
	
	@Test
	public void Input110() {
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		Switch switch3 = new Switch();
		switch2.turnOn();
		switch3.turnOn();

		InputPin input1 = new InputPin(switch1);
	    InputPin input2 = new InputPin(switch2);
	    InputPin input3 = new InputPin(switch3);
		
		//Components for the circuit
		LogicGate fullAdder = new FullAdderGate(input1, input2, input3);
		
		//Test if outputs are false
		Assert.assertFalse(fullAdder.getOutputValue(0)); //Sum
		Assert.assertTrue(fullAdder.getOutputValue(1)); //Carry
	}
	
	@Test
	public void Input111() {
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		Switch switch3 = new Switch();
		switch1.turnOn();
		switch2.turnOn();
		switch3.turnOn();

		InputPin input1 = new InputPin(switch1);
	    InputPin input2 = new InputPin(switch2);
	    InputPin input3 = new InputPin(switch3);
		
		//Components for the circuit
		LogicGate fullAdder = new FullAdderGate(input1, input2, input3);
		
		//Test if outputs are false
		Assert.assertTrue(fullAdder.getOutputValue(0)); //Sum
		Assert.assertTrue(fullAdder.getOutputValue(1)); //Carry
	}

}
