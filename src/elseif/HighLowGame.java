//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.awt.print.Printable;
import java.util.Random;

import javax.print.attribute.standard.PrinterLocation;
import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		String jess = new String();
		int no = 0;
		//int guesses = 5;
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
for(int guesses = 5; guesses > 0; guesses--) {
		jess = JOptionPane.showInputDialog("Guess the number 1-100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			no = Integer.parseInt(jess);
			// 5. if the guess is correct
			if(no == random) {
				JOptionPane.showMessageDialog(null, "You win!");
			}
			else if(no > random) {
				JOptionPane.showMessageDialog(null, "Too High!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Too Low!");
			}
}
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
			JOptionPane.showMessageDialog(null, "You lose!");
		
	}

}


