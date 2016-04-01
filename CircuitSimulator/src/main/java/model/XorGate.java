package model;

public class XorGate extends LogicGate {
	
	private InputPin pinA;
	private InputPin pinB;

	@Override
	public boolean getOutputValue(int index) {
		
		//Portas necessárias para fazer a XorGate
		
		NotGate not1 = new NotGate();
		NotGate not2 = new NotGate();
		
		AndGate and1 = new AndGate();
		AndGate and2 = new AndGate();
		
		OrGate or = new OrGate();
		
		//Definindo os pinos
		
		//entradas da xor conectadas nas portas not
		not1.setPin(pinA);
		not2.setPin(pinB);
		
		//entradas da xor conectadas nas portas and
		and1.setpinA(pinA);
		and2.setpinA(pinB);
		
		//Criando pinos das saídas das portas not
		InputPin outNot1 = new InputPin();
		InputPin outNot2 = new InputPin();
		
		
		//conectando as saídas das portas not nas entradas das portas and
		and1.setpinB(outNot2);
		and2.setpinB(outNot1);
		
		//Criando pinos das saídas das portas and
		
		
		
		return false;
	}	
}

