package org.usfirst.frc.team4786.subsystems;

import org.usfirst.frc.team4786.commands.DisengageMagnet;
import org.usfirst.frc.team4786.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

public class PullMagnet extends Subsystem {
    private final Relay magnetControl;

    public PullMagnet()
    {
    	magnetControl = new Relay(RobotMap.magnetPort);
    }
    
    public void initDefaultCommand() {
    	setDefaultCommand(new DisengageMagnet());
    }

    public boolean isOn()
    {
    	if(magnetControl.get() == Relay.Value.kOn){
    		return true;
    	}
    	return false;
    }
    
    public void toggleMagnet()
    {
    	if (isOn() == true)
    	{
    		magnetControl.set(Relay.Value.kOff);
    	}
    	else
    	{
    		magnetControl.set(Relay.Value.kOn);
    	}
    }
    
    public void engageMagnet()
    {
    	if (isOn() == false)
    	{
    		magnetControl.set(Relay.Value.kOn);
    	}
    }
    
    public void disengageMagnet()
    {
    	if (isOn() == true)
    	{
    		magnetControl.set(Relay.Value.kOff);
    	}
    }
}

