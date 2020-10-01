package Presentiel;

public class Fraction {
	public String s1;
	public String s2;

	public Fraction (String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;	
	}
	public String toString() {
		String s;
		s = this.s1 + "/" + this.s2;
		return s;	
	}

}