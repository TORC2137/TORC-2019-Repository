package org.torc.robot2019.program;

import com.ctre.phoenix.sensors.PigeonIMU;

import org.torc.robot2019.subsystems.BasicDriveTrain;
import org.torc.robot2019.vision.VisionManager;

import edu.wpi.first.wpilibj.AnalogInput;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static AnalogInput PNUPressure;
	
	public static RobotInfo RobInfo;

	public static TORCControls Controls;

	public static BasicDriveTrain DriveTrain;

	public static VisionManager VManager;
	
}