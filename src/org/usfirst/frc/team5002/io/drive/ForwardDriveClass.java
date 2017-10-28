package org.usfirst.frc.team5002.io;

import org.usfirst.frc.team5002.robot.Robot;
/**
 * 
 * @author Chris McKinnon
 *
 */

public class ForwardDriveClass implements Callback {
	

	@Override
	public void run(float value) {
		// sets SwerveDrives Drive Value
		Robot.swervedrive.setDrive(value);		
		
		
	}

}
