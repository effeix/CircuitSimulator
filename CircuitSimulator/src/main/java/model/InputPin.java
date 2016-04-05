package model;

public class InputPin {
	Source source;
	int index;
	
	public InputPin (Source source) {
		this.source = source;
	}
	public Source getSource() {
		return source;
	}
	
	public void setSource(Source source) { //source = switch ou saida de uma porta
		this.source = source;
	}
	
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
}
