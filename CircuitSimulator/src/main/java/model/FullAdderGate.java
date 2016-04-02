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

		//Criando as portas

		HalfAdderGate half_adder1 = new HalfAdderGate();
		HalfAdderGate half_adder2 = new HalfAdderGate();
		OrGate or = new OrGate();

		//Criando os pinos e atribuindo os valores do primeiro HalfAdder
		
		half_adder1.setPin(faPinA,faPinB);

		InputPin sum_HA1 = new InputPin();
		InputPin carry_HA1 = new InputPin();

		sum_HA1.setIndex(0);
		carry_HA1.setIndex(1);

		sum_HA1.setSource(half_adder1);
		carry_HA1.setSource(half_adder1);

		//Criando os pinos e atribuindo os valores do segundo HalfAdder

		half_adder2.setPin(sum_HA1,faPinC);

		InputPin sum_HA2 = new InputPin();
		InputPin carry_HA2 = new InputPin();

		sum_HA2.setIndex(0);
		carry_HA2.setIndex(1);

		sum_HA2.setSource(half_adder2);
		carry_HA2.setSource(half_adder2);

		//Or

		or.setPin(carry_HA1,carry_HA2);

		//Array de saídas do FullAdder

		out[0] = half_adder2.getOutputValue(0);
		out[1] = or.getOutputValue(0);

		return out[index];
	}

}
