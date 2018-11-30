package org.usfirst.frc.team4786.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

public class RobotMap {
	public static SpeedController frontLeft;
	public static SpeedController frontRight;
	public static SpeedController backLeft;
	public static SpeedController backRight;
	
	public static final int frontLeftPort = 0;
	public static final int frontRightPort = 2;
	public static final int backLeftPort = 1;
	public static final int backRightPort = 3;
	
	public static final int airCompressorPort = 0;
	public static final int pressureSwitchPort = 0;
	public static final int primaryPneumaticModule = 0;
	
	public static final int forwardSliderChannel = 0;
	public static final int reverseSliderChannel = 1;
	
	public static final int magnetPort = 3;
	
	public static void init() {
		frontLeft = new Spark(frontLeftPort);
		frontRight = new Spark(frontRightPort);
		backLeft = new Spark(backLeftPort);
		backRight = new Spark(backRightPort);
	}
}
