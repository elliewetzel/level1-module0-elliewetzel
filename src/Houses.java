import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		Robot colin = new Robot();
		colin.setX(5);
		colin.setY(200);
		colin.setSpeed(500);
		colin.setRandomPenColor();
		colin.penDown();
		for(int i = 0; i < 5; i ++) {
		drawHouse(colin);
		colin.turn(-90);
		drawPointedRoof(colin);
		colin.turn(-90);
		}
	}

	public static void drawPointedRoof(Robot colin) {
		colin.setRandomPenColor();
		colin.move(50);
		colin.turn(45);
		colin.move(20);
		colin.turn(90);
		colin.move(20);
		colin.turn(45);
		colin.move(50);
		colin.setPenColor(Color.GREEN);
		colin.turn(-90);
		colin.move(25);
	}

	public static void drawHouse(Robot colin) {
		colin.setRandomPenColor();
		colin.move(100);
		colin.turn(90);
		colin.move(25);
		colin.turn(90);
		colin.move(100);
		colin.setPenColor(Color.GREEN);
		colin.turn(-90);
		colin.move(25);
	}
	
	
	
}

