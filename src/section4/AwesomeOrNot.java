package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int randNum = new Random().nextInt(4);
	// 3. Print out this variable
		System.out.println(randNum);
	// 4. Get the user to enter something that they think is awesome
	String object = JOptionPane.showInputDialog("Enter something you think is awsome.");
	// 5. If the random number is 0
	if (randNum == 0) {
		JOptionPane.showMessageDialog(null, object + " is awsome");
	}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
	if (randNum == 1) {
		JOptionPane.showMessageDialog(null, object + " is OK");
	}
	// -- tell the user whatever they entered is OK.

	// 7. If the random number is 2
	if (randNum == 2) {
		JOptionPane.showMessageDialog(null, object + " is boring");
	}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
	if (randNum == 3) {
		JOptionPane.showMessageDialog(null, object + " is trash");
	}
	// -- write your own answer
	
	}
}


