package model;

public class OrGate extends LogicGate {
	
	public void setPin(InputPin pinA, InputPin pinB) {
		pins.add(pinA);//eu botei aqui a mesma implementacao que agente uso pro getOutputValuer
					   //que agente fez com lista pq ele pedia de entrada um index
		pins.add(pinB);
	}
	
	@Override
	public boolean getOutputValue(int index) {
		boolean A = pins.get(0).getSource().getOutputValue(pins.get(0).getIndex());
		boolean B = pins.get(1).getSource().getOutputValue(pins.get(1).getIndex());
		return A || B;
	}


}
