
package cse360assign3;

public class Calculator {
	
	private int total;
	private String history = "0";
	
	/**
	 * Calculator init
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * 
	 * @return returns the current total.
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * 
	 * @param value The number to be added to the current total.
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 * 
	 * @param value The number to be subtracted from the current total.
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * 
	 * @param value The number to be multiplied by the current total.
	 */
	public void multiply (int value) {
		total *= value;
		history += " * " + value;
	}
	
	/**
	 * 
	 * @param value The number to divide the current total by.
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		} else {
			total = total/value;
		}
		history += " / " + value;
	}
	
	/**
	 * 
	 * @return The history of operations as a string.
	 */
	public String getHistory () {
		return history;
	}
}