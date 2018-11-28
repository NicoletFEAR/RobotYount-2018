package org.usfirst.frc.team4786.robot;

import org.usfirst.frc.team4786.commands.EngageMagnet;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	private XboxController xboxController;
	private Button xboxAButton;
	private Button xboxLBButton;
	private Button xboxRBButton;
	
	public OI()
	{
		xboxController = new XboxController(0);
		xboxAButton = new JoystickButton(xboxController, 1);
		xboxLBButton = new JoystickButton(xboxController, 5);
		xboxRBButton = new JoystickButton(xboxController, 6);

		xboxAButton.whenPressed(new EngageMagnet());
	}
	
	public XboxController getDriveController()
	{
		return xboxController;
	}

	public boolean bothBumpersHeld()
	{
		if (xboxLBButton.get() == true && xboxRBButton.get() == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
