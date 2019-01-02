//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;
import org.jointheleague.graphical.robot.Robot;

import javax.swing.JOptionPane;

import java.awt.AWTException;
import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args){
		//1. Create a new Robot
		
		Robot robot = new Robot();
	String jess = new String();
		//3. Ask the user what color they would like the robot to draw
	for( int o = 0; o < 100; o++) {
	robot.setSpeed(50);
	jess = JOptionPane.showInputDialog("What color do you want the robot to draw? Red, Green, or Blue");
		//5. Use an if/else statement to set the pen color that the user requested
if( jess.equals("Red")) {
	robot.setPenColor(250, 0, 0);
}
else if(jess.equals("Green")) {
	robot.setPenColor(0, 250, 0);
}
else if(jess.equals("Blue")) {
	robot.setPenColor(0, 0, 250);
}
else {
	robot.setRandomPenColor();
}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		robot.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		robot.penDown();
for(int i = 0; i < 4; i++) {
		robot.move(100);
robot.turn(90);
}
	}
	}
}
