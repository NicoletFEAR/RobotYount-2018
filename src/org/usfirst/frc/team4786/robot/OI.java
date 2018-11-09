package org.usfirst.frc.team4786.robot;

import edu.wpi.first.wpilibj.XboxController;

public class OI {
	private XboxController xboxController;
	
	public OI()
	{
		xboxController = new XboxController(0);
	}
	
	public XboxController getDriveController()
	{
		return xboxController;
	}
}
