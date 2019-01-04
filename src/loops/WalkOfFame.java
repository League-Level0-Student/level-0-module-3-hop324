
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		int H = 0;
		// 1. Set the X position of the robot so that it starts on the left.
		rob.setX(H);
		// You also need to show the robot to see the result of this line.
		rob.setSpeed(50);
		// 2. Make the robot draw a star shape. Hint: 144.
		for (int x = 20; x > 0; x--) {
			rob.penDown();
			for (int i = 5; i > 0; i--) {
				rob.move(30);
				rob.turn(144);
			}
			//if( x  ==20) {
		//		rob.turn(90);
			//}
		H=	rob.getX();
			H+=50;
				rob.setX(H);
			
			rob.penUp();
			rob.setAngle(90);
			rob.move(50);
			rob.setAngle(0);

		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
