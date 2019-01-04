
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "August 1st";
		String dadsBirthday = "Novemever 18th";
		String myBirthday = "January 18th";
String jeff = new String();
//int biggadaday = 0;
		// 2. Find out which birthday the user wants and and store their response in a variable
	jeff = JOptionPane.showInputDialog("Who's birhtday do you want?");
		// 3. Print out what the user typed
		System.out.println(jeff);
		//biggadaday = Integer.parseInt(jeff)
		// 4. if user asked for "mom"
		if(jeff.equalsIgnoreCase("MoM")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		else if(jeff.equalsIgnoreCase("dAd")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		else if(jeff.equalsIgnoreCase("ThOmAs")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't have that person's birthday!");
		}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
