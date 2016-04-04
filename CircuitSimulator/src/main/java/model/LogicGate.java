package model;

import java.util.ArrayList;

abstract class LogicGate implements Source, Drain {
	protected ArrayList <InputPin> pins = new ArrayList <>();
	
	@Override
	public InputPin getInputPin(int index) {//eu coloquei o metodo que o hashi pediu, mas nao
											//vi sentido, pq nao tem ngm fora dessa classe que
											//precisa saber o pino de entrada do logic gate
											//pq so ele precisa disso pra faze as contas
		return pins.get(index);
	}
}
