package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false
		
		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
        String a = JOptionPane.showInputDialog("what day is it?");
		// Set the boolean isWeekend based on the value they enter
		if (a.equals("sunday")||a.equals("saturday")) {
			isWeekend = true;
			JOptionPane.showConfirmDialog(null, "you get to sleep in");
		}
		else {
			isWeekend = false;
			JOptionPane.showConfirmDialog(null, "you get out of bed and got to school");
		}
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
		String s = JOptionPane.showInputDialog("what was your test score?");
		int x = (int) Integer.parseInt(s);
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		if (x > 70) {
			passedExam = true;
			JOptionPane.showConfirmDialog(null, "congratulation!");
		}
		else {
			passedExam = false;
			JOptionPane.showConfirmDialog(null, "goodluck next time.");
		}
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over?");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		JOptionPane.showConfirmDialog(null, "game is over.");
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String c = JOptionPane.showInputDialog("what color to draw with?");
		if (c.equals("red")) {
			isRed = true;
		}
		else {
			isRed = false;
		}
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String t = JOptionPane.showInputDialog("what shape do you want?");
		if (t.equals("square")) {
			isSquare=true;
		}
		else {
			isSquare=false;
		}
		if (isRed==true&&isSquare==true) {
			drawRedSquare();
		}
		else {
			JOptionPane.showConfirmDialog(null, "you don't know how to draw that shape");
		}
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		
		Robot rob = new Robot();
		rob.penDown();
		rob.setPenColor(256, 0, 0);
		rob.setSpeed(1000);
		for (int i=0;i<4;i++) {
		rob.move(100);
		rob.turn(90);
		}
	}	
}
