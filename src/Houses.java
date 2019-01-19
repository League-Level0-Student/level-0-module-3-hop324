
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class Houses {
	static Robot yeet = new Robot();
	public static void main(String[] args) {
		yeet.setRandomPenColor();
		yeet.setSpeed(50);
		yeet.setX(0);
		yeet.setY(600);
		yeet.penDown();
		yeet.move(100);
		yeet.turn(90);
		yeet.move(10);
		yeet.turn(90);
		yeet.move(100);
	}
}
