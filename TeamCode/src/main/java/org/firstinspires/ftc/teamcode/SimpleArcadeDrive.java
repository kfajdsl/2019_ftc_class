package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class SimpleArcadeDrive extends OpMode {

    private DcMotor leftFront, leftBack, rightFront, rightBack;

    @Override
    public void init() {

        leftFront = hardwareMap.get(DcMotor.class, "left_front");
        leftBack = hardwareMap.get(DcMotor.class, "left_back");
        rightFront = hardwareMap.get(DcMotor.class, "right_front");
        rightBack = hardwareMap.get(DcMotor.class, "right_back");

        leftFront.setDirection(DcMotorSimple.Direction.FORWARD);


    }

    @Override
    public void loop() {

        double forward = gamepad1.left_stick_y;
        double turn = gamepad1.right_stick_x;

        double leftPower = forward + turn;
        double rightPower = forward - turn;

        leftFront.setPower(leftPower);
        leftBack.setPower(leftPower);

        rightFront.setPower(rightPower);
        rightBack.setPower(rightPower);

    }

}
