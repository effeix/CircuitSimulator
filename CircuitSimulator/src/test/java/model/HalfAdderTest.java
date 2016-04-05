package model;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class HalfAdderTest {

	@Test
	public void Input00() {

		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		InputPin input1 = new InputPin(switch1);
	    InputPin input2 = new InputPin(switch2);
		
		//Components for the circuit
		LogicGate halfAdder = new HalfAdderGate(input1, input2);
		
		//Test if outputs are false
		Assert.assertFalse(halfAdder.getOutputValue(0)); //Sum
		Assert.assertFalse(halfAdder.getOutputValue(1)); //Carry
	}
	
	@Test
	public void Input01() {

		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		switch2.turnOn();
		InputPin input1 = new InputPin(switch1);
	    InputPin input2 = new InputPin(switch2);
		
		//Components for the circuit
		LogicGate halfAdder = new HalfAdderGate(input1, input2);
		
		//Test if outputs are false
		Assert.assertTrue(halfAdder.getOutputValue(0)); //Sum
		Assert.assertFalse(halfAdder.getOutputValue(1)); //Carry
	}
	
	@Test
	public void Input10() {

		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		switch1.turnOn();
		InputPin input1 = new InputPin(switch1);
	    InputPin input2 = new InputPin(switch2);
		
		//Components for the circuit
		LogicGate halfAdder = new HalfAdderGate(input1, input2);
		
		//Test if outputs are false
		Assert.assertTrue(halfAdder.getOutputValue(0)); //Sum
		Assert.assertFalse(halfAdder.getOutputValue(1)); //Carry
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
		LogicGate halfAdder = new HalfAdderGate(input1, input2);
		
		//Test if outputs are false
		Assert.assertFalse(halfAdder.getOutputValue(0)); //Sum
		Assert.assertTrue(halfAdder.getOutputValue(1)); //Carry
	}
}
