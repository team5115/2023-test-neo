package frc.team5115.Robot;

import static frc.team5115.Constants.*;

import java.util.NoSuchElementException;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.team5115.Classes.Neo;
import edu.wpi.first.wpilibj.DigitalOutput;

public class RobotContainer {
    public final Joystick joy = new Joystick(0);
    private final Timer timer;
    DigitalOutput x = new DigitalOutput(0);
    private final Neo neo;

    public RobotContainer() {
        neo = new Neo();
        timer = new Timer();
        timer.reset();
        configureButtonBindings();
    }

    public void configureButtonBindings() {
    }

    public void startTeleop(){
        neo.set(1);
        x.set(true);
        System.out.println("Starting teleop");
    }

    public void disabledInit(){
        neo.stop();
        x.set(false);
    }

    public void stopEverything(){
        //drivetrain.stop();
        //intakeMotor.stop();
    }

    public void startAuto(){
    }

    public void autoPeriod(){

    }

    public void teleopPeriodic(){
        //double forward = -joy.getRawAxis(JOY_Y_AXIS_ID); // negated because Y axis on controller is negated
        //double turn = joy.getRawAxis(JOY_Z_AXIS_ID);
        //drivetrain.TankDriveOld(forward, turn);
    }
}
