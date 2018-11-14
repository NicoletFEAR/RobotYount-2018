package org.usfirst.frc.team4786.subsystems;

import org.usfirst.frc.team4786.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AirCompressor extends Subsystem {

   private static Compressor c;
   private AnalogInput ai;
   
   public AirCompressor(){
	   c = new Compressor (RobotMap.airCompressorPort);
	   ai = new AnalogInput (RobotMap.pressureSwitchPort);
   }
   
   public double getPressure() {
		double pressure = 250.0 * ai.getVoltage() / 5.0 - 25.0;
		boolean enoughPressure = true;
		SmartDashboard.putNumber("Pressure", pressure);
		// return pressure;
		if (pressure < 60) {
			enoughPressure = false;
		} else{
			enoughPressure = true;
		}
//		SmartDashboard.putBoolean("Pressure is enough", enoughPressure);
		return pressure;

	}
   
   public Compressor getCompressor(){
	   return c;
   }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

