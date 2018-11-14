package org.usfirst.frc.team4786.robot;

import edu.wpi.first.wpilibj.VictorSP;

public class RobotMap {
	public static VictorSP frontLeft;
	public static VictorSP frontRight;
	public static VictorSP backLeft;
	public static VictorSP backRight;
	
	public static final int airCompressorPort = 0;
	public static final int pressureSwitchPort = 0;
	public static final int magnetPort = 0;
	
	public static void init() {
		frontLeft = new VictorSP(0);
		frontRight = new VictorSP(1);
		backLeft = new VictorSP(2);
		backRight = new VictorSP(3);
	}
}
