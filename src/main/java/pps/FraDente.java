package pps;

public class FraDente {
	
	/**
	 * Print a message with my name.
	 */
	public void sayHello() {
		System.out.println("Hello " + this.toString());
	}
	
	@Override
	public String toString() {
		return "Francesco Dente";
	}
}
