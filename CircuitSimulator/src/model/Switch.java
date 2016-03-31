package model;

public class Switch implements Source {
	private boolean state = false;
	
	public void toggleState() {
		this.state = !this.state;
	}
	
	@Override
	public boolean getOutputValue(int index) {
		return this.state;
	}
}
