package model;

public class FullAdderGate extends LogicGate {
	
	private InputPin faPinA;
	private InputPin faPinB;
	private InputPin faPinC;

	public void setPin(InputPin pinA, InputPin pinB, InputPin pinC) {
		this.faPinA = pinA;
		this.faPinB = pinB;
		this.faPinC = pinC;
	}

	@Override
	public boolean getOutputValue(int index) {
		
		boolean[] out = new boolean[2];

		//criando as portas lógicas

		XorGate xor1 = new XorGate();
		XorGate xor2 = new XorGate();
		AndGate and1 = new AndGate();
		AndGate and2 = new AndGate();
		OrGate or = new OrGate();

		//Xor1

		xor1.setPin(faPinA,faPinB);
		InputPin outXor1 = new InputPin();
		outXor1.setSource(xor1);

		//Xor2x

		xor2.setPin(outXor1,faPinC);
		InputPin outXor2 = new InputPin();
		outXor2.setSource(xor2);

		//And1

		and1.setPin(faPinC,outXor1);
		InputPin outAnd1 = new InputPin();
		outAnd1.setSource(and1);

		//And2

		and2.setPin(faPinB,faPinA);
		InputPin outAnd2 = new InputPin();
		outAnd2.setSource(and2);

		//Or

		or.setPin(outAnd1,outAnd2);
		InputPin outOr = new InputPin();
		outOr.setSource(or);

		//array de saídas

		out[0] = xor2.getOutputValue(0);
		out[1] = or.getOutputValue(0);

		return out[index];
	}

}
