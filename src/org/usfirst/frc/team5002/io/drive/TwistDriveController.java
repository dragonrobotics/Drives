package org.usfirst.frc.team5002.io;

import org.usfirst.frc.team5002.robot.Robot;

public class TwistDriveController implements Callback{

	@Override
	public void run(float value) {
		// sets SwerveDrives Twist Value
		Robot.swervedrive.setTwist(value);
	}
	
	
}
