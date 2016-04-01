package model;

public class InputPin {
	Source source;
	int index;
	
	public Source getSource() {
		return source;
	}
	
	public int getIndex() {
		return index;
	}
	
	public void setSource(Source source) { //source = switch ou saida de uma porta
		this.source = source;
	}
}
