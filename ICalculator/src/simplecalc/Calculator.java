package simplecalc;

public class Calculator implements ICalculator {
	
	
	public int add(int x ,int y) {
		return x+y;
	}
	
	public float divide (int x ,int y ) {
		try {
			return ((float)x/y);
		}catch(ArithmeticException e) {
			throw new RuntimeException("cannot divide by zero");
		}
	}
}