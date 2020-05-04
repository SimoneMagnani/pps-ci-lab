package pps;
/**
 * This class logs my name with any prefix given by constructor parameter.
 * @author Samubura
 *
 */
public class Samubura {

	private String prefix;
	
	public Samubura(String prefix) {
		this.prefix = prefix;
	}
	
	@Override
	public String toString() {
		return prefix + " Samubura";
	}
}
