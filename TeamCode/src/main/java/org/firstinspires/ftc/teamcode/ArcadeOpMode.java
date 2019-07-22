package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Arcade Drive", group="Simple Drivebase")
public class ArcadeOpMode extends OpMode {

    DcMotor leftFront, leftBack, rightFront, rightBack;
    MotorGroup leftMotors, rightMotors;

    ArcadeDrive arcadeDrive;

    @Override
    public void init() {
        leftFront = hardwareMap.get(DcMotor.class, "left_front");
        leftBack = hardwareMap.get(DcMotor.class, "left_back");
        rightFront = hardwareMap.get(DcMotor.class, "right_front");
        rightBack = hardwareMap.get(DcMotor.class, "right_back");

        leftMotors = new MotorGroup(new DcMotor[]{leftFront, leftBack});
        rightMotors = new MotorGroup(new DcMotor[]{rightFront, rightBack});

        arcadeDrive = new ArcadeDrive(leftMotors, rightMotors);

    }

    @Override
    public void loop() {

        arcadeDrive.drive(gamepad1.left_stick_y, gamepad1.right_stick_x);

    }

}
