package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
JOptionPane.showMessageDialog(null, "If you ever find yourself having to cross having to cross a \n piranha infested river, here's how to do it...");
		// Get the user to enter an adjective
String a = JOptionPane.showInputDialog("Adjective please!");
		// Get the user to enter a type of liquid
String b = JOptionPane.showInputDialog("Your favorite drink?");
		// Get the user to enter a body part
String c = JOptionPane.showInputDialog("Pick a body part!");
		// Get the user to enter a verb
String d = JOptionPane.showInputDialog("verb please.. ");
		// Get the user to enter a place
String e = JOptionPane.showInputDialog("your favorite place?");
		// Fit the user's words into this sentence, and save it in a String:
		String f = "Piranhas are more"+ a + "during the day, so cross the river at \n " + 
	" night. Piranhas are attracted to fresh" + b + " and will most \n" +
		"likely take a bite out of your " + c + " if you" + d + " . Whatever \n" +
		" you do, if you have an open wound, try to find another way to get \n" +
		"back to the" + e + "! Good luck! \n" ;
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		JOptionPane.showMessageDialog(null, f);

	}
}

