package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class ArcadeDrive {

    private MotorGroup leftMotors;
    private MotorGroup rightMotors;

    public ArcadeDrive(DcMotor leftMotor, DcMotor rightMotor) {
        this.leftMotors = new MotorGroup(new DcMotor[]{leftMotor});
        this.rightMotors = new MotorGroup(new DcMotor[]{rightMotor});
    }

    public ArcadeDrive(MotorGroup leftMotors, MotorGroup rightMotors) {
        this.leftMotors = leftMotors;
        this.rightMotors = rightMotors;
    }

    public void drive(double forward, double turn) {
        leftMotors.setPower(forward + turn);
        rightMotors.setPower(forward - turn);
    }

    public void drive(float forward, float turn) {
        leftMotors.setPower(forward + turn);
        rightMotors.setPower(forward - turn);
    }

}
