package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_scores {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("what is your test score?");
		double a =  Double.parseDouble(s);
	
		if (a>=90) {
			JOptionPane.showConfirmDialog(null, "wow you got A! genious");
		}
		else if (a>=80) {
			JOptionPane.showConfirmDialog(null, "you got B! thats not bad");
		}
		else if (a>=70) {
			JOptionPane.showConfirmDialog(null, "you got C. lets study more next time");
		}
		else if(a>=60) {
			JOptionPane.showConfirmDialog(null, "you got D? did you study?");
		}
		else {
			JOptionPane.showConfirmDialog(null, "what? you got f???? what the hack did you do?");
		}
	}
}
