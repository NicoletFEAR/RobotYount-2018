package org.usfirst.frc.team4786.commands;

import org.usfirst.frc.team4786.robot.Robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class OpenLoopDrive extends Command {

    public OpenLoopDrive() {
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double forwardValue = Robot.oi.getDriveController().getTriggerAxis(GenericHID.Hand.kLeft);   	
    	double reverseValue = Robot.oi.getDriveController().getTriggerAxis(GenericHID.Hand.kRight); // switched comp practice
    	double turnAmount = Robot.oi.getDriveController().getX(GenericHID.Hand.kLeft);
    	
    	//Calculate an Arcade drive speed by taking forward speed and subtracting it by reverse speed
    	//So Cool! :D
    	double robotOutput = reverseValue - forwardValue;
    	
    	Robot.driveTrain.arcadeDrive(robotOutput, turnAmount * 0.5);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
