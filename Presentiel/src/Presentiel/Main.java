package Presentiel;

public class Main {

	public static void main(String[] args) {
		String s1, s2;
		s1 = "9";
		s2 = "3";
		Fraction frac = new Fraction(s1, s2);
		System.out.println(frac.toString());
	}
}
