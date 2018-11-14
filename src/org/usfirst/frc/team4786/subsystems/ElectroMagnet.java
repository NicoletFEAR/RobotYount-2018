package org.usfirst.frc.team4786.subsystems;

import org.usfirst.frc.team4786.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ElectroMagnet extends Subsystem {

    private Relay magnetControl;
    public ElectroMagnet (){
    	magnetControl = new Relay (RobotMap.magnetPort);
    }
    public boolean isOn(){
    	if(magnetControl.get() == Relay.Value.kOn){
    		return true;
    	}
    	return false;
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

