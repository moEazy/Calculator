package cse360assign3;
/**Calculator class that applys simple arithmetics
 * @author : Mohammed Hussein
 * @version: 20/22/2016
 */
public class Calculator {

	private int total;
	private String theHistory;

	/** default constructor */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		theHistory= 0+"";
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
		theHistory= theHistory + " + " +value;
	}

	/**
	 * subtract() method
	 * @void, subtracts a value from total 
	 */
	public void subtract (int value) {
		total = total-value;
		theHistory= theHistory + " - " +value;
	}

	/**
	 * multiply() method
	 * @void, multiply total by value  
	 */
	public void multiply (int value) {
		total = total*value;
		theHistory= theHistory + " * " +value;
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
		theHistory= theHistory + " / " +total;
	}

	/**
	 * getHistory() method
	 * @String, returns arithmetic history  
	 */
	public String getHistory () {
		return theHistory;
	}
}
