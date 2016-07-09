
package org.usfirst.frc.team687.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    // Declaration of Variables. This is where you look to find out what type of variable each variable is.
	Joystick joy;
	VictorSP motor; // A VictorSP is a type of motor controller we use.
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	// Object construction. All objects should be constructed in the robotInit() function.
    	// Most constructors include parameters - pieces of data (numbers, strings, or even other variables)
    	// 	that contain information about the object itself, usually the port it is plugged in to.
        joy = new Joystick(0); // joy is in Joystick port 0
        motor = new VictorSP(9); // the motor controller is plugged into PWM port 9 on the roboRIO
    }

    /**
     * This is where the action happens!
     * The teleopPeriodic() method is called periodically throughout the teleop period of the game.
     * This is where most of the code lives.
     */
    public void teleopPeriodic() {
        SmartDashboard.putNumber("Joystick Y", joy.getY()); // You should see the joystick Y value come onto the Smart Dashboard.
        motor.set(.25); // The motor is set to 0.25, which 1/4 power forward. Full power forward is 1 and full power reverse is -1.
    }
    
}
