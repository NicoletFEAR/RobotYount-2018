package org.usfirst.frc.team4786.subsystems;

import org.usfirst.frc.team4786.commands.OpenLoopDrive;
import org.usfirst.frc.team4786.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new OpenLoopDrive());
    }

    public void arcadeDrive(double driveSpeed, double turnAmount) {
    	double leftSpeed = driveSpeed;
    	double rightSpeed = driveSpeed;
   
    	RobotMap.frontLeft.set((-leftSpeed) - turnAmount);
		RobotMap.backLeft.set((-leftSpeed) - turnAmount);
		RobotMap.frontRight.set((rightSpeed) - turnAmount);
		RobotMap.backRight.set((rightSpeed) - turnAmount);
    }
    
    public void stop() {
    	RobotMap.frontLeft.stopMotor();
		RobotMap.backLeft.stopMotor();
		RobotMap.frontRight.stopMotor();
		RobotMap.backRight.stopMotor();
    }
}

