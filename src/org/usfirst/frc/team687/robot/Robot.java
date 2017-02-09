package org.usfirst.frc.team687.robot;

import org.usfirst.frc.team687.robot.subsystems.Climber;
import org.usfirst.frc.team687.robot.subsystems.Conveyor;
import org.usfirst.frc.team687.robot.subsystems.Drive;
import org.usfirst.frc.team687.robot.subsystems.GearManipulation;
import org.usfirst.frc.team687.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.PowerDistributionPanel;

import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {
	
	public static OI oi;
	public static Compressor compressor;
	public static PowerDistributionPanel pdp;
	
	public static Climber climber;
	public static Conveyor conveyor;
	public static Drive drive;
	public static Intake intake;
	public static GearManipulation gearManip;
	
	@Override
	public void robotInit() {
		oi = new OI();
				
		climber = new Climber();
		conveyor = new Conveyor();
		drive = new Drive();
		intake = new Intake();
		
		compressor = new Compressor();
		compressor.start();
		
		pdp = new PowerDistributionPanel();
	}
	
    public void disabledInit() {

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
    	
    }
    
    public void autonomousPeriodic() {
    	
    }
    
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		SmartDashboard.putData("pdp", pdp);
    }
    
    public void testPeriodic() {

    }
}