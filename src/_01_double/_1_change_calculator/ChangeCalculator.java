package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		String a = JOptionPane.showInputDialog("how many nickles do you have?");
		
		int s = (int) Integer.parseInt(a);
		// Ask the user how many dimes they have, and convert their answer
		String g = JOptionPane.showInputDialog("how many dimes do you have?");
		
		int v = (int) Integer.parseInt(g);
		// Ask the user how many quarters they have, and convert their answer
		String f = JOptionPane.showInputDialog("how many quarters do you have?");
		
		int c = (int) Integer.parseInt(f);
		// Calculate how much money the user has.  Hint: Use a double variable 
		double t = 5*s + 10*v + 25*c;
		t = t/100;
		JOptionPane.showConfirmDialog(null,"you have $"+ t);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

