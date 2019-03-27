package org.torc.robot2019.program;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import org.torc.robot2019.program.TORCControls.ControllerInput;
import org.torc.robot2019.program.teleopcontrols.TeleopDrive;

public class TeleopMode {
	
	private static TeleopDrive driveCommand;

	public static void Init() {
		System.out.println("Teleop Mode Enabled!!");
		System.out.println("RobotType: " + KMap.GetRobotType().toString());
		// Home elevator
		RobotMap.S_Elevator.homeElevator();
		// Home Wrist
		// RobotMap.S_EndEffector.homeEndEffector();
		// Keep Pivot arm at init position
		RobotMap.S_PivotArm.setPosition(RobotMap.S_PivotArm.getEncoder());
		// Initialize Teleop Drive Command
		driveCommand = new TeleopDrive(RobotMap.S_DriveTrain, RobotMap.S_GPManager, 
			RobotMap.S_PivotArm, RobotMap.S_Climber, RobotMap.S_Elevator, RobotMap.S_EndEffector,
			RobotMap.S_ElevatorArmManager);
		driveCommand.start();
	}
	
	public static void Periodic() {

	}
}

