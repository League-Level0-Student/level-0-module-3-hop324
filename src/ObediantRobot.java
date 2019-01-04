	import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class ObediantRobot {
	static Robot jeff = new Robot();
	static String g = new String();
	static String gag = new String();
	int a = 0;
public static void main(String[] args) {
	jeff.setSpeed(100);
	gag = JOptionPane.showInputDialog("What Color do you want?Red, green, or blue?");
	if(gag.equalsIgnoreCase("Blue")) {
		jeff.setPenColor(0, 0, 255);
	}
	else if(gag.equalsIgnoreCase("Red")) {
		jeff.setPenColor(255, 0, 0);
	}
	else if(gag.equalsIgnoreCase("Green")) {
		jeff.setPenColor(0, 255, 0);
	}
	else {
		jeff.setRandomPenColor();
	}	
	g = JOptionPane.showInputDialog("What shape do you want?");
	if(g.equalsIgnoreCase("Triangle")) {
		drawTriangle();
	}
	else if(g.equalsIgnoreCase("Square")) {
		drawSquare();
	}
	else if(g.equalsIgnoreCase("Circle")) {
		drawCircle();
	}
}
static void drawSquare() {
jeff.penDown();
for(int i = 4; i > 0; i--) {
jeff.move(50);
jeff.turn(90);
}
jeff.penUp();
}
static void drawTriangle() {
	jeff.penDown();
	for(int x = 3; x > 0; x--) {
		jeff.move(50);
		jeff.turn(120);
	}
	jeff.penUp();
}
static void drawCircle() {
	jeff.penDown();
	for(int z = 360; z > 0; z--) {
	jeff.move(1);
	jeff.turn(1);
	}
	jeff.penUp();
}
}
