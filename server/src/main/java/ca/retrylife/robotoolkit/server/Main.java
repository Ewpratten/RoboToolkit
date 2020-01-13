package ca.retrylife.robotoolkit.server;

import edu.wpi.first.wpilibj.RobotBase;
import edu.wpi.first.wpilibj.TimedRobot;

public final class Main {
	private Main() {
	}

	public static void main(String... args) {
		RobotBase.startRobot(Robot::new);
	}
}

class Robot extends TimedRobot {

	@Override
	public void robotInit() {

	}

}