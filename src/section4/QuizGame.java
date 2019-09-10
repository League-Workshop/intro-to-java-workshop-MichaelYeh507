package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int userScore = 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("What is 1 + 1?");
		// 3.  Use an if statement to check if their answer is correct
		if (answer == "1") {
			
		// 4.  if the user's answer was correct, add one to their score 
			userScore += 1;
		} else {
			userScore -= 1;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answerTwo = JOptionPane.showInputDialog("Is java a coding language?");
		// 6.  After all the questions have been asked, print the user's score 
		if (answerTwo.equalsIgnoreCase("Yes")) {
			userScore++;
		} else {
			userScore -= 1;
		}
		String answerThree = JOptionPane.showInputDialog("Is coding fun?");
		if (answerThree.equalsIgnoreCase("Yes")) {
			userScore += 100000000;
		} else {
			userScore -= 100000000;
		}
		JOptionPane.showMessageDialog(null, "Your score is " + userScore + ".");
	}
	}
