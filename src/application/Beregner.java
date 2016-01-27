package application;

public class Beregner {

	/**
	 * Returns inputparameter squared
	 * @param x input parameter
	 * @return input parameters squared
	 * @author hd
	 */
	public int square(int x) {
		return x*x;
	}
	
	/**
	 * Returns true if input parameters x and y are equal, false otherwise
	 * @param x input parameter
	 * @param y input parameter
	 * @return true if input parameters are equal, false otherwise
	 * @author hd
	 */
	public boolean isEqual(int x, int y)	{	
		if (x==y)
			return true;
		return false;
	}
}
