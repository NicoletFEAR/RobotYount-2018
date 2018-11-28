package org.usfirst.frc.team4786.subsystems;

import org.usfirst.frc.team4786.commands.ToggleSlider;
import org.usfirst.frc.team4786.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PneumaticSlider extends Subsystem {

	private final Solenoid sliderPressurizer = new Solenoid(RobotMap.primaryPneumaticModule, RobotMap.sliderSolenoidChannel);

    public void initDefaultCommand() {
    	setDefaultCommand(new ToggleSlider());
    }
    
    public boolean isOn()
    {
    	return sliderPressurizer.get();
    }
    
    public void toggleSlider()
    {
    	sliderPressurizer.set(!isOn());
    }
}

