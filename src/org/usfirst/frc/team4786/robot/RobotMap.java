package org.usfirst.frc.team4786.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

public class RobotMap {
	public static SpeedController frontLeft;
	public static SpeedController frontRight;
	public static SpeedController backLeft;
	public static SpeedController backRight;
	
	public static final int airCompressorPort = 0;
	public static final int pressureSwitchPort = 0;
	public static final int magnetPort = 0;
	
	public static void init() {
		frontLeft = new Spark(0);
		frontRight = new Spark(2);
		backLeft = new Spark(1);
		backRight = new Spark(3);
	}
}
