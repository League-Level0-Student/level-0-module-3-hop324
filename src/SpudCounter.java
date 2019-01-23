import java.awt.print.Printable;

import javax.print.attribute.standard.PrinterLocation;
import javax.swing.JOptionPane;

public class SpudCounter {
public static void main(String[] args) {
	for( int x = 1; x < 9; x++) {
		if(x == 8) {
		System.out.print("More");
		}
		else if(x == 4) {
			System.out.println("4");
		}
		else {
			System.out.println(x + " Potatoes");
		}
	}
}
}
