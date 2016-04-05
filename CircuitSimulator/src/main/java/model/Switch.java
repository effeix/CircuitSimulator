package model;

public class Switch implements Source {
	private boolean state = false;
	
	public void turnOn() {
		this.state =true;
	}
	
	public void turnOff() {
		this.state = false;
	}
	
	public boolean getState () {
		return this.state;
	}
	@Override
	public boolean getOutputValue(int index) {
		return this.state;
	}
}
