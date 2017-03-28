package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot rex = new Robot();
rex.penDown();
int sides = 7;
rex.setPenColor(Color.PINK);
rex.setSpeed(100);
for (int i = 0; i < sides; i++) {
rex.move(200);
rex.turn(360 / sides);
}

		
		
	}
}
