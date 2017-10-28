package org.usfirst.frc.team5002.io;

import org.usfirst.frc.team5002.robot.Robot;
/**
 * 
 * @author Chris McKinnon
 *
 */

public class StrafeDriveController implements Callback {

	@Override
	public void run(float value) {
		// sets SwerveDrives Turn Value
		Robot.swervedrive.setTurn(value);
		
	}

}
