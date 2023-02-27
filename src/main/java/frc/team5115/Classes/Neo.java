package frc.team5115.Classes;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Neo extends SubsystemBase{
    private CANSparkMax intakeTop;

    public Neo(){
        intakeTop = new CANSparkMax(1, MotorType.kBrushless);   
        //intakeBottom = new CANSparkMax(6, MotorType.kBrushless);    
        //intakeTurn = new CANSparkMax(7, MotorType.kBrushless);    
 
    }

    public void set(double speed){
        intakeTop.set(speed);
    }


    public void stop(){
        set(0);

    }

}
