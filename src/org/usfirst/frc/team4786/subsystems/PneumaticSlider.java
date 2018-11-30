package org.usfirst.frc.team4786.subsystems;

import org.usfirst.frc.team4786.commands.ToggleSlider;
import org.usfirst.frc.team4786.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PneumaticSlider extends Subsystem {

	private final DoubleSolenoid sliderPressurizer = new DoubleSolenoid(RobotMap.primaryPneumaticModule,
																		RobotMap.forwardSliderChannel,
																		RobotMap.reverseSliderChannel);

    public void initDefaultCommand() {
    	setDefaultCommand(new ToggleSlider());
    }
    
    public DoubleSolenoid.Value currentState()
    {
    	return sliderPressurizer.get();
    }
    
    public void toggleSlider()
    {
    	DoubleSolenoid.Value state = sliderPressurizer.get();
    	if (state == DoubleSolenoid.Value.kForward || state == DoubleSolenoid.Value.kOff)
    	{
    		moveReverse();
    	}
    	else
    	{
    		moveForward();
    	}
    }
    
    
    public void moveForward()
    {
    	sliderPressurizer.set(DoubleSolenoid.Value.kForward);
    }
    
    public void moveReverse()
    {
    	sliderPressurizer.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void stop()
    {
    	sliderPressurizer.set(DoubleSolenoid.Value.kOff);
    }
}

