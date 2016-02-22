package cse360assign3;
/**Calculator class that applys simple arithmetics
 * @author : Mohammed Hussein
 * @version: 20/21/2016
 */
public class Calculator {

	private int total;

	/** default constructor */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * public method getTotal
	 * @return int type value total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * add() method
	 * @void, adds a value to total 
	 */
	public void add (int value) {
		total = total+value;
	}

	/**
	 * subtract() method
	 * @void, subtracts a value from total 
	 */
	public void subtract (int value) {
		total = total-value;
	}

	/**
	 * multiply() method
	 * @void, multiply total by value  
	 */
	public void multiply (int value) {
		total = total*value;
	}
	/**
	 * divide() method
	 * @void, divides the total by value  
	 */	
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total = total/value ; 
	}

	/**
	 * getHistory() method
	 * @String, returns arithmetic history  
	 */
	public String getHistory () {
		return "";
	}
}
