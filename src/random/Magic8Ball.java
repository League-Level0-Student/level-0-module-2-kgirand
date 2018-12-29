//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	int i = new Random().nextInt(4);
	JOptionPane.showInputDialog(null, "What would you like to ask the Magic 8 ball?");
	if(i==0) {
	JOptionPane.showMessageDialog(null, "yes");
	}
	else if(i==1) {
		JOptionPane.showMessageDialog(null, "no");
		}
	else if(i==2) {
	JOptionPane.showMessageDialog(null, "i don't know. maybe");
	}
	else if (i==3) {
	JOptionPane.showMessageDialog(null, "figure it out yourself" );
	}
}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
