package model;

public class XorGate extends LogicGate {
	
	private InputPin pinA;
	private InputPin pinB;
	
	public void setpinA(InputPin pinA){
		this.pinA = pinA;
	}
	
	public void setpinB(InputPin pinB){
		this.pinB = pinB;
	}
	
	
	@Override
	public boolean getOutputValue(int index) {
		
		//Portas necessárias para fazer a XorGate
		
		NotGate NotA = new NotGate();
		NotGate NotB = new NotGate();
		
		AndGate AndA = new AndGate();
		AndGate AndB = new AndGate();
		
		OrGate Or = new OrGate();
		
		//Construção da Xor definindo as entradas e saídas das portas

		
		return false;
	}	
}

