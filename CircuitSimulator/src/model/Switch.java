package model;

public class Switch implements Source {
	private boolean state;
	
	public void setState(boolean state) {
		this.state = state;
	}
	
	public void setSource(Source source) {
		//
	}
	
	@Override
	public boolean getOutputValue(int index) {
		return this.state;
	}
}
